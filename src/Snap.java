import java.util.Scanner;

public class Snap {

    public static void main(String[] args) {

        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);

        Card card1 =deck.deal();
        Card card2;

        int score = 0;
        //game instructions
        System.out.println("Welcome to Snap!");
        System.out.println("Press Enter to reveal cards and press 's' when you see a snap!");
        scanner.nextLine();

        System.out.println(card1);
        for (int i = 0; i < 51; i++) {

            System.out.println("\nPress Enter for next card...");
            scanner.nextLine();

            card2 = deck.deal();
            System.out.println(card2);

            if (card1.getRank() == card2.getRank()) {
                System.out.println("SNAP!! Type 's' quickly");
                String response = scanner.nextLine();
                
                if (response.equalsIgnoreCase("s")){
                    System.out.println("Correct!");
                    score++;
                } else {
                    System.out.println("Too slow!");
                }
            }
            card1 = card2;

        }
        
        System.out.printf("\nGAME OVER! Your score: %d%n", score);
        scanner.close();
                

    }
}