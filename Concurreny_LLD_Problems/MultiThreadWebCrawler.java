package Concurreny_LLD_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class Solution {
    // Store the hostname of the startUrl to filter URLs.
    private String hostName;

    // Maintaining a concurrent hashmap to store visited URLs and avoid duplicates. 
    private ConcurrentHashMap<String, Boolean> urlHashMap = new ConcurrentHashMap<>();

    // Maintaining a Thread Pool to process URLs concurrently.
    private ExecutorService executor = Executors.newFixedThreadPool(5);

    private AtomicInteger numOfUrlsToParse = new AtomicInteger(0);

    private HtmlParser htmlParser;

    class Task implements Runnable {
        private String url; 

        Task(String url) {
            this.url = url;
        }

        public void run() {
            // Get all URLs from the current page --> This the blocking call
            for(String extractUrl : htmlParser.getUrls(url)) {
                String curHostName = extractUrl.split("/")[2];
                // Check if the url has the hostname and hasn't been visited.
                if(curHostName.equals(hostName) && urlHashMap.putIfAbsent(curHostName, true) == null) {
                    numOfUrlsToParse.addAndGet(1);
                    // Submit a new task to process this url. Submitting a new url to the new thread.
                    executor.submit(new Task(extractUrl));
                }
            }
            // Decrement the counter by 1 only when the current thread has extract all the URLs from it.
            numOfUrlsToParse.addAndGet(-1);
        }
    }

    public List crawl(String startUrl , HtmlParser htmlParser) {
        hostName = startUrl.split("/")[2];
        this.htmlParser = htmlParser;
        // Mark startUrl as visited
        urlHashMap.put(startUrl,true);
        // Increment the numOfUrlsToParse count by 1, indicating a thread is performing a task.
        numOfUrlsToParse.addAndGet(1);
        // Submit a new task to process this url. Submitting a new url to the new thread.
        executor.submit(new Task(startUrl));

        // Wait until all URLs have been processed.
        while(numOfUrlsToParse.get() > 0) {
            try {
                // Sleep to avoid busy waiting
                Thread.sleep(80);
            } catch (Exception e) {
                // Handles exception.
            }
        }
        // Shutdown the thread pool gracefully.
        executor.shutdown();
        return new ArrayList<>(urlHashMap.keySet());
    }
}

public class MultiThreadWebCrawler {
    
}
