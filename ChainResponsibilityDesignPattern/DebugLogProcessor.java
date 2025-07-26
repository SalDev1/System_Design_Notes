package ChainResponsibilityDesignPattern;

public class DebugLogProcessor extends LogProcessor {
    DebugLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void log(int logLevel, String message) {
        if(logLevel == LogProcessor.DEBUG) {
            System.out.println("Debug: " + message);
        } else if (nextProcessor != null) {
           super.log(logLevel, message);
        }
    }
    
}
