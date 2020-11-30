public class GetHint
{
  public static String getHint(int hintsLeft)
  {
    String hint = "";
    switch (hintsLeft)
    {
      case 5:
        hint = "\nThe diary should only be used in Part 2! Focus on the voicemail and quote first, then the store map, then the police information and store employee list.";
        break;
      case 4:
        hint = "\nTry looking for a number based code in the voicemail.";
        break;
      case 3:
        hint = "\nTry applying the code to the quote on the fridge.";
        break; 
      case 2: 
        hint = "\nTry using the message hidden in the quote to decide which store Sandy is in.";
        break;
      case 1: 
        hint = "\nTry usng the suspect info, store name, and time information to determine who the suspect is.";
        break;
      default:
        hint = "\nOops, you're all out of hints!";
        break;
    }
    
    return hint;
  }
}