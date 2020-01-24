import java.util.Random;
import java.util.Scanner;

public class Test
{
    public static void main(final String[] args)
    {
        int humanScore = 1;
        int humanTotal = 0;

        int subtotal = 0;
        int humanRoll;
        final Scanner keyboard = new Scanner(System.in);
        final Random rand = new Random();
        char choice = 'h';
        String input;
        System.out.println("Welcome to the game of Pig!\n");


        while (humanScore < 100 )
        {
            do
            {
                humanRoll = rand.nextInt(6) + 1;
                System.out.println("You rolled: " + humanRoll);
                if (humanRoll == 1)
                {
                    humanScore = 0;
                    System.out.print("You lose your turn! ");
                    System.out.print("Your total is " + humanTotal);
                    break;
                }
                else
                {
                    humanScore += humanRoll;
                    System.out.print("Your turn score is " +
                            humanScore);
                    System.out.println(" If you hold you will have " +
                            humanScore + " points.");
                    System.out.println("Enter 'r' to roll " +
                            "again, 'h' to hold.");
                    input = keyboard.nextLine();
                    choice = input.charAt(0);

                    if (choice == 'h')
                    {
                        break;
                    }
                }
            }while (humanRoll != 1 && choice != 'h');

            humanTotal += humanScore;
            System.out.println("Your score is " +
                    humanTotal);
            humanScore = 0;

            System.out.println();

        }
        while (humanTotal >= 100)
        {
            System.out.println("YOU WIN!");
        }
        while (subtotal >= 100)
        {
            System.out.println("THE COMPUTER WINS!");
        }
    }
}