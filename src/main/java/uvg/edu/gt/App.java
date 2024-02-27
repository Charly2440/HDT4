package uvg.edu.gt;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Leo
        Leo leo = new Leo();

        System.out.println("Elegir la implementacion de stack a utilizar (Escoger numero)\n\t1.Array stack\n\t2.Vector stack\n\t3.Stack de lista doblemente enlazada\n\t4.Stack de lista simplemente enlazada");
        int stackType = scanner.nextInt();
        StackFactory<Integer> stackFactory = new StackFactory<>();
        scanner.nextLine();
        // Create a stack for operands
        UvgStack<Integer> operandStack = stackFactory.crearStack(stackType);

        // Create an instance of MyPfCalc
        MyPfCalc calculator = new MyPfCalc(operandStack);

        // Ask the user for the file name
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();

        // Read the content of the file using Leo
        String fileContent = leo.leerArchivo(fileName);

        // Check if the file content is null (file not found or empty)
        if (fileContent == null) {
            System.out.println("Error: File not found or empty.");
        } else {
            // Print the content of the file
            System.out.println("File content:");
            System.out.println(fileContent);

            // Use the content of the file with MyPfCalc to perform calculations
            Integer result = calculator.calc(fileContent);
            if (result != null) {
                System.out.println("Result of calculation: " + result);
            } else {
                System.out.println("Error: Unable to calculate result.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
