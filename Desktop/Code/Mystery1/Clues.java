import java.util.Scanner;

public class Clues 
{
  static Scanner scanner2 = new Scanner(System.in);

  public static String welcome() 
  {
    String message = "\nHello! Thank you for playing Mystery 1.0." + 
    " Please play the game in full screen to best read the clues.";
    return message;
  }

  public static String getName() 
  {
    System.out.println("\nWhat is your name, Detective?");
    String name = scanner2.nextLine();
    return name;
  }

  public static String background(String name)
  {
    String story = "Hello Detective " + name + "." + 
    " I've got a new case for you. It's a tough one." + 
    " A girl named Sandy has gone missing." + 
    " It was somewhere in the mall, but we don't know in which store or when." + 
    " Here are some of her files. I suggest you go check out her things." + 
    " Thanks for the help, Detective.";
    return story;
  }
  
  public static String phone() 
  {
    String message = "\nGosh I hate picky customers. " +
    "Today this mom came in to buy some cakes because it was her twins' birthday. " +
    "And get this - she wants the cake to be a triangle. " + 
    "I'm sorry, this is a grocery store, not a bakery. " + 
    "You really want me to work overtime on my 4am shift? " + 
    "People are so entitled. Thinking they own the whole world. " + 
    "Actually, they probably think they own all the planets in the solar system.";
    return message;
  }

  public static String quote()
  {
    String quote = "\nFor I'm in the place that people would always love but never remember";
    return quote;
  }

  public static String map()
  {
    String mapKey = 
    "\nMap Key: " + 
    "\n\t1. Harley Architects" + 
    "\n\t2. Forest's Sports Goods" + 
    "\n\t3. Culinary School" + 
    "\n\t4. Miza's Sushi" + 
    "\n\t5. McLane Bowling\n";

    System.out.println(mapKey);

    String map = 
    "\n|--------|  |--|  |-----|" + 
    "\n|        |  |  |  |     |" + 
    "\n|    1   |  |3 |  |  2  |" +
    "\n|        |  |  |  |     |" + 
    "\n|________|  |  |  |_____|" +
    "\n            |  |         " + 
    "\n|--------|  |  |  |-----|" +
    "\n|        |  |  |  |  5  |" +
    "\n|    4   |  |  |  |_____|" +
    "\n|        |  |  |         " +
    "\n|        |  |   --------|" +
    "\n|________|  |___________|";
    return map;
  }

  public static String employees1() 
  {
    String employees = "\nHarley Architects: " + 
    "\n\t1. Oliver (works 6am - noon)" +
    "\n\t2. Olivia (works 8am - noon)" + 
    "\n\t3. Harry (works 8am - 2pm)" + 
    "\n\t4. Amilia (works 1pm - 5pm)" + 
    "\n\t5. George (works 3pm - 5pm)";

    return employees; 
  }

  public static String employees2() 
  {
    String employees = "\nForest's Sports Goods: " + 
    "\n\t1. Oliver (works 6am - noon)" +
    "\n\t2. Isa (works 8am - noon)" + 
    "\n\t3. Harry (works 8am - 2pm)" + 
    "\n\t4. Ava (works 1pm - 5pm)" + 
    "\n\t5. Paul (works 3pm - 5pm)";

    return employees;
  }

  public static String employees3() 
  {
    String employees = "\nCulinary School: " + 
    "\n\t1. Noah (works 6am - noon)" +
    "\n\t2. Emily (works 8am - noon)" + 
    "\n\t3. Jack (works 8am - 2pm)" + 
    "\n\t4. Isabella (works 1pm - 5pm)" + 
    "\n\t5. Jacob (works 3pm - 5pm)";

    return employees;
  }

  public static String employees4() 
  {
    String employees = "\nMiza's Sushi: " + 
    "\n\t1. Leo (works 6am - noon)" +
    "\n\t2. Mia (works 8am - noon)" + 
    "\n\t3. Oscar (works 8am - 2pm)" + 
    "\n\t4. Poppy (works 1pm - 5pm)" + 
    "\n\t5. Charlie (works 3pm - 5pm)";

    return employees;
  }

  public static String employees5() 
  {
    String employees = "\nMcLane Bowling: " + 
    "\n\t1. Theo (works 6am - noon)" +
    "\n\t2. Ella (works 8am - noon)" + 
    "\n\t3. Freddy (works 8am - 2pm)" + 
    "\n\t4. Lily (works 1pm - 5pm)" + 
    "\n\t5. Arthur (works 3pm - 5pm)";

    return employees;
  }

  public static String missingTime()
  {
    String times = "\nThe tape for Sandy shows her being taken at 11. " + 
    "Here are a few confirmed time conversions. See if you can find the pattern: " + 
    "\n\tTape time: 7 - Real time: 2pm" + 
    "\n\tTape time: 31 - Real time: 8am" + 
    "\n\tTape time: 23 - Real time: 6pm" + 
    "\nNote: Sandy went missing sometime between 6am and 6pm." ;

    return times;
  }

  public static String suspectDescription() 
  {
    String suspectDescription = "\nSuspect is a 25-30 year old male. " + 
    "He likely lives im the area. " + 
    "He has black hair and is approximately 5'8\".";
    
    return suspectDescription;
  }

  public static String diary()
  {
    String diary = "\nContinuous Writing Day 3:" + 
    "\nLet's talk." + 
    "\n\nI made a new friend today." + 
    "\nMy old friends were busy, so I was at the mall and" + 
    "\nbumped into this person who asked me" + 
    "\nif I knew how to get to the theater." + 
    "\nNow I didn't know, but I googled it and" + 
    "\nguess what! They gave me their number!";

    return diary;
  }

  public static String map2(int hintsLeft)
  {
    if (hintsLeft == 5)
    {
      System.out.println("\nThink of which clue you haven't used yet ;)");
    }

    String mapKey = 
    "\nMap Key: " + 
    "\n\t1. Tennis Courts" + 
    "\n\t2. Rock Wall" + 
    "\n\t3. Checkout Area" + 
    "\n\t4. Main Shopping Plaza" + 
    "\n\t5. Storage Room\n";

    System.out.println(mapKey);

    String map2 = 
    "\n|--------|--|------------|" + 
    "\n|        |  |            |" + 
    "\n|    1   |  |     2      |" +
    "\n|        |  |            |" + 
    "\n|        |  |            |" +
    "\n|________|  |____________|" + 
    "\n|---------------|  |-----|" +
    "\n|       4       |  |  3  |" +
    "\n|               |  |     |" +
    "\n|_______________|  |_____|" +
    "\n|------------------------|" +
    "\n|           5            |" + 
    "\n|________________________|";

    return map2;
  }
}