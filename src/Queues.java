import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class Queues{public static void main(String[] args) {

        Scanner keyboard = new Scanner (System.in);
        Queue<Character> letters = new LinkedList<Character>();
        int[] occurrences = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        char thisChar;
        int arrayPos;

        System.out.println("\nEnter a phrase to check > ");
        String inputStr = keyboard.nextLine();

        int i = 0;
        while (i < inputStr.length()) {
            thisChar = inputStr.charAt(i);
            arrayPos =(int)thisChar - (int) 'a';
            occurrences[arrayPos]++;
            letters .add(thisChar);
            i++;

        }
        System.out.println(letters);
        System.out.println(occurrences);

    }
}