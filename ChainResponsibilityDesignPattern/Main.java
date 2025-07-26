package ChainResponsibilityDesignPattern;

public class Main {
    public static void main(String[] args) {
        
        // This ensures that a chain is linked between different log processors.
        LogProcessor logObject = new InfoLogProcessor((new DebugLogProcessor(new ErrorLogProcessor(null))));

        logObject.log(LogProcessor.ERROR , "expection happens");
        logObject.log(LogProcessor.DEBUG , "debugging the code");
        logObject.log(LogProcessor.INFO , "just an info message");
    }
}
