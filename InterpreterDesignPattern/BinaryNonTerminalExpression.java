package InterpreterDesignPattern;

public class BinaryNonTerminalExpression implements AbstractExpression {
    AbstractExpression leftExpression;
    AbstractExpression rightExpression;
    String operator; 

    BinaryNonTerminalExpression(AbstractExpression left, AbstractExpression right , String operator) {
        this.leftExpression = left;
        this.rightExpression = right;
        this.operator = operator; // This can be used to define the operation type (e.g., "+", "-", etc.)
    }

    @Override
    public int interpret(Context context) {
        // Example operation: addition of two expressions
        switch(operator) {
            case "+":
                return leftExpression.interpret(context) + rightExpression.interpret(context);
            case "-":
                return leftExpression.interpret(context) - rightExpression.interpret(context);
            case "*":
                return leftExpression.interpret(context) * rightExpression.interpret(context);
            case "/":
                return leftExpression.interpret(context) / rightExpression.interpret(context);
            default:
                throw new UnsupportedOperationException("Operator not supported: " + operator);
        }
    }
    
}
