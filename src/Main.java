import java.util.Scanner;

import static com.sun.xml.internal.bind.v2.schemagen.Util.equalsIgnoreCase;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playAChoice = "";
        String playBChoice = "";
        String continue = "";
        boolean playADone = false;
        boolean playBDone = false;
        boolean done = false;

        do
        {
            do
            {
                System.out.println("Player A, enter your move:\nR for Rock\nP for Paper\nS fpr Scissors ");
                playAChoice = in.nextLine();

                if(playAChoice.equalsIgnoreCase("r") || playAChoice.equalsIgnoreCase("p") || playAChoice.equalsIgnoreCase("s"))
                {
                    playADone = true;
                }
                else
                {
                    System.out.println("Invalid input. Please try again.");
                    playADone = false;
                }
            }while(!playADone);
            do
            {
                System.out.println("Player B, enter your move:\nR for Rock\nP for Paper\nS fpr Scissors ");
                playBChoice = in.nextLine();

                if(playBChoice.equalsIgnoreCase("r") || playBChoice.equalsIgnoreCase("p") || playBChoice.equalsIgnoreCase("s"))
                {
                    playBDone = true;
                }
                else
                {
                    System.out.println("Invalid input. Please try again.");
                    playBDone = false;
                }
            }while(!playBDone);
            if(playAChoice.equalsIgnoreCase("r"))
            {
                if(playBChoice.equalsIgnoreCase("s"))
                {
                    System.out.println("Rock breaks Scissors, Player A wins!");
                }
                else if(playBChoice.equalsIgnoreCase("p"))
                {
                    System.out.println("Paper covers Rock, Player B wins!");
                }
                else
                {
                    System.out.println("It's a tie!");
                }

            }
            else if(playAChoice.equalsIgnoreCase("p"))
            {
                if(playBChoice.equalsIgnoreCase("r"))
                {
                    System.out.println("Paper covers Rock, Player A wins!");
                }
                else if(playBChoice.equalsIgnoreCase("s"))
                {
                    System.out.println("Scissors cut Paper, Player B wins!");
                }
                else
                {
                    System.out.println("It's a tie!");
                }
            }
            else
            {
                if(playBChoice.equalsIgnoreCase("p"))
                {
                    System.out.println("Scissors cut Paper, Player A wins!");
                }
                else if(playBChoice.equalsIgnoreCase("r"))
                {
                    System.out.println("Rock breaks Scissors, Player B wins!");
                }
                else
                {
                    System.out.println("It's a tie!");
                }
            }
            do
            {
                System.out.print("Do you want to play again? (Y/N): ");
                continue = in.nextLine()
                if(continue.equalsIgnoreCase("y"))
                {
                    done = false;
                }
                else if(continue.equalsIgnoreCase("n"))
                {
                    done = true;
                }
                else
                {
                    System.out.println("Invalid input. Please try again.");
                }
            }
        }while(!done);
    }
}