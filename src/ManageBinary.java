import java.util.Scanner;
import java.util.Stack;

public class ManageBinary {
    Scanner scanner = new Scanner(System.in);
    public void decimalToBinary(){
        Stack<Integer> stack = new Stack<Integer>();
        // User input
        System.out.println("Enter decimal number: ");
        int num = scanner.nextInt();

        while (num != 0)
        {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }
        System.out.print("\nBinary representation is:");
        while (!(stack.isEmpty() ))
        {
            System.out.print(stack.pop());
        }
        System.out.println();
    }
}
