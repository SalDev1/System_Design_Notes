package Concurreny_LLD_Problems;

import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Semaphore;

class BoundedBlockingQueue {
    private int capacity;
    private Semaphore fullSemaphore;
    private Semaphore emptySemaphore;
    ConcurrentLinkedDeque<Integer> deque;

    public BoundedBlockingQueue(int capacity) {
        this.capacity = capacity;
        fullSemaphore = new Semaphore(0);
        emptySemaphore = new Semaphore(capacity);
        deque = new ConcurrentLinkedDeque<>();
    }

    // Pushing an element into the deque from the front and if the deque is full, we will block the thread until a consumer
    // thread consumes an element from the deque and makes space for the producer thread to push an element into the deque.
    public void enqueue(int element) throws InterruptedException {
        emptySemaphore.acquire();
        deque.addFirst(element);
        fullSemaphore.release();
    }
    
    // Popping an element from the deque from the rear & if the queue is empty, we will block the consumer thread 
    // until a producer thread produces an element and pushes it into the deque and makes it available for the consumer thread to consume.
    public int dequeue() throws InterruptedException {
        int returnElement = -1;

        fullSemaphore.acquire();
        returnElement = deque.pollLast();
        emptySemaphore.release();

        return returnElement;
    }
    
    public int size() {
       int result = 0;

       result = deque.size();
       return result;
    }
}

public class DesignBoundedBlockingQueue {
    
}
