package ChainResponsibilityDesignPattern;

public class ErrorLogProcessor extends LogProcessor {
    public ErrorLogProcessor(LogProcessor nextProcessor) {
        super(nextProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == LogProcessor.ERROR) {
            System.out.println("Error: " + message);
        } else if (nextProcessor != null) {
            nextProcessor.log(logLevel, message);
        }
    };
}
