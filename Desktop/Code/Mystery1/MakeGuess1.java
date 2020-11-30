import java.util.Scanner;

public class MakeGuess1
{
  public static String makeGuess1() 
  {
    Scanner scanner3 = new Scanner(System.in);
    String result = "";

    System.out.println("\nWhat is the suspect's name (no capitals)?");
    String suspectName = scanner3.nextLine();
    System.out.println("What is the store number where Sandy was taken (1 - 5)?");
    String storeNumber = scanner3.nextLine();

    if ((suspectName.contains("paul")) && (storeNumber.charAt(0) == '2'))
    {
      result = "You are correct!";
    }
    else 
    {
      result = "That's not right, try again!";
    }
    
    return result;
  }
}