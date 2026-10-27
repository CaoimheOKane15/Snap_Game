import java.util.Scanner;
import java.util.Stack;


public class Stacks {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Stack<Character> charStack = new Stack<Character>();

        System.out.println("\nEnter a string > ");
        String inputStr = keyboard.nextLine();
        String reversedStr = "";

        int i = 0;
        while (i < inputStr.length()) {
            charStack.push(inputStr.charAt(i));
            i++;
        }

        System.out.println("Stack contents: " + charStack);

        while (!charStack.empty()) {
            reversedStr += charStack.pop();

        }

        System.out.printf("%S reversed is %s\n", inputStr, reversedStr);

        if (inputStr.equals(reversedStr)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}