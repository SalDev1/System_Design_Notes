package InterpreterDesignPattern;

public class Client {
    public static void main(String[] args) {
      // initialize the context and add some variables
      Context context = new Context();

      context.put("a",10);
      context.put("b", 20);   

      AbstractExpression expression = new BinaryNonTerminalExpression(new NumberTerminalExpression("a"), new NumberTerminalExpression("b") , "*");

      System.out.println(expression.interpret(context));
    }
}