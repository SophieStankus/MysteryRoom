import java.util.Scanner;

public class MakeGuess2
{
   public static String makeGuess2(int numGuesses)
  {
    Scanner scanner4 = new Scanner(System.in);
    String result = ""; 

    while (numGuesses != 2)
    {
      System.out.println("\nWhat is the number of Sandy's location (1-5)?");
      String locationGuess = scanner4.nextLine();

      if (locationGuess.charAt(0) == '2')
      {
        System.out.println("Correct! You win!");
        System.exit(0);
      }
      else
      {
        result = "Oops, try again!";
        numGuesses ++; 
        continue;
      }
    }

    System.out.println("Oh no, Sandy was found too late. Better luck next time, Detective.");

    return result;
  }
}