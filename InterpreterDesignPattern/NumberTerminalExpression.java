package InterpreterDesignPattern;

public class NumberTerminalExpression implements AbstractExpression{

    String stringValue;
    NumberTerminalExpression(String stringValue) {
        // Initialize with the number
        this.stringValue = stringValue;
    }

    @Override
    public int interpret(Context context) {
        // Return the value from the map stored for the given stringValue
       return context.get(stringValue);
    }
    
}
