import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playAChoice = "";
        String playBChoice = "";
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


        }
    }
}