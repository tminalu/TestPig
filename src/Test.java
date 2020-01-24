import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(final String[] args) {
        int Score = 0;
        int Total = 0;
        char repeat;

        String play= "yes";

        int Roll;
        int Roll2;
        final Scanner keyboard = new Scanner(System.in);
         Random rand1 = new Random();
         Random rand2= new Random();

        String input;
        System.out.println("Welcome! Let's play Roll Dice:\n");


        while (play == "yes" && Score <100) {
            do {
                Roll = rand1.nextInt(6) + 1;
                Roll2=rand2.nextInt(6) +1;
                System.out.println("Your rolls  " + Roll + " & " +
                        "" +
                        Roll2);
                System.out.println("Score: " + Roll + Roll2);
                System.out.println("Roll again ?"  +play
                );
                input = keyboard.nextLine();


                if (Roll == 1 && Roll2 ==1) {
                    Score += 25;


                } else {


                    Score += Roll + Roll2;
                    System.out.print("Your score is " +
                            Score);




                    if ("yes" == play) {
                        break;
                    }
                }
            } while  (Roll != 1 && play != "yes");

            Total += Score;
            System.out.println("Your score is " +
                    Total);
            Score = 0;

            System.out.println();

        }
        while (Total >= 100) {
            System.out.println("YOU WIN!");

        }
    }
}