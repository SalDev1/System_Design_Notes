package ChainResponsibilityDesignPattern;

public class InfoLogProcessor extends LogProcessor{
    // This constructor helps in understanding the next() reference of the next nextLogProcessor.
    InfoLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }
    public void log(int logLevel, String message) {
        if (logLevel == LogProcessor.INFO) {
            System.out.println("Error: " + message);
        } else if (nextProcessor != null) {
            nextProcessor.log(logLevel, message);
        }
    };
}
