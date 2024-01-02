package FactoryDesignPattern;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if (System.getProperty("os.name").equals("Windows 8")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}

/**
 * All of the client code should work with factories and products through
 * abstract interfaces. This way it does not care which factory it works
 * with and what kind of product it returns.
 */