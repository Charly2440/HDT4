package uvg.edu.gt;
import java.util.Scanner;
public class PruebaDeUsoSinArchivoText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Elegir la implementacion de stack a utilizar (Escoger numero)\n\t1.Array stack\n\t2.Vector stack\n\t3.Stack de lista doblemente enlazada\n\t4.Stack de lista simplemente enlazada");
        int stackType = scanner.nextInt();
        StackFactory<Integer> stackFactory = new StackFactory<>();
        // Create a stack for operands
        UvgStack<Integer> operandStack = stackFactory.crearStack(stackType);

        // Create an instance of MyPfCalc
        MyPfCalc calculator = new MyPfCalc(operandStack);

        System.out.println("Escriba la expresion postfix a resolver:");
        scanner.nextLine();
        String postfixExpression = scanner.nextLine();

        // Postfix expression to evaluate: "34+2*"
        //String postfixExpression = "34+2*";

        // Calculate the result of the postfix expression
        try {
            Integer result = calculator.calc(postfixExpression);
            System.out.println("Result of the postfix expression \"" + postfixExpression + "\": " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
