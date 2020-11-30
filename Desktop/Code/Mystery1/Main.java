import java.util.Scanner;

public class Main 
{
  // Declaring menu constants & Scanner
  static final String MENU = "\nOptions: " + 
    "\n\t1. Check the phone" +
    "\n\t2. Look on the table" + 
    "\n\t3. Look at your files" + 
    "\n\t4. Make a guess (suspect + store)" + 
    "\n\t5. Get a hint" + 
    "\n\t6. Quit game";

  static final String TABLE_SUBMENU = "\nOptions: " + 
    "\n\t1. Read the quote" +
    "\n\t2. Read the diary";

  static final String FILES_SUBMENU = "\nOptions: " + 
    "\n\t1. Look at mall map" +
    "\n\t2. Look at suspect description" + 
    "\n\t3. Look at mall staff information" + 
    "\n\t4. Look at the timestamp for when Sandy went missing";

  static final String STAFF_SUBMENU = "\nOptions: " + 
    "\n\t1. Harley Architects staff" +
    "\n\t2. Forest's Sports Goods staff" + 
    "\n\t3. Culinary School staff" + 
    "\n\t4. Miza's Sushi staff" +
    "\n\t5. McLane Bowling staff";

  static Scanner scanner = new Scanner(System.in);

  public static void main(String args[])
  {
    // Introduction
    System.out.println(Clues.welcome());
    String name = Clues.getName();
    System.out.println(Clues.background(name));

    // Control Flow Loop
    char userChoice = '0';
    int hintsLeft = 5;

    while (userChoice != 6)
    {
      System.out.println(MENU);
      System.out.println("What do you want to do? Please enter a single number: ");
      userChoice = scanner.nextLine().charAt(0);

      if (userChoice == '1')
      {
        System.out.println("Hmmm.. it looks like there's a voicemail on the answering machine.");
        System.out.println(Clues.phone());

        System.out.println("\nEnter '1' when you are ready to continue: ");
        char continueChoice = scanner.nextLine().charAt(0);
        if (continueChoice == '1')
        {
          continue;
        }
      }

      else if (userChoice == '2')
      {
        System.out.println("It appears there's a few things on the table.");
        System.out.println(TABLE_SUBMENU);
        System.out.println("Which do you want to look at (enter a single number): ");

        char tableChoice = scanner.nextLine().charAt(0);

        if (tableChoice == '1')
        {
          System.out.println(Clues.quote());
          
          System.out.println("\nEnter '1' when you are ready to continue: ");
          char continueChoice = scanner.nextLine().charAt(0);
          if (continueChoice == '1')
          {
            continue;
          }
        }
        else if (tableChoice == '2')
        {
          System.out.println(Clues.diary());
          
          System.out.println("\nEnter '1' when you are ready to continue: ");
          char continueChoice = scanner.nextLine().charAt(0);
          if (continueChoice == '1')
          {
            continue;
          }
        }
        else
        {
          System.out.println("ERROR: Please enter 1 or 2.");
          continue;
        }
      }

      else if (userChoice == '3')
      {
        System.out.println("\nYou have three police files to choose from.");
        System.out.println(FILES_SUBMENU);
        System.out.println("Enter your choice (1-4): ");
        char fileChoice = scanner.nextLine().charAt(0);

        if (fileChoice == '1')
        {
          System.out.println(Clues.map());

          System.out.println("\nEnter '1' when you are ready to continue: ");
          char continueChoice = scanner.nextLine().charAt(0);
          if (continueChoice == '1')
          {
            continue;
          }
        }
        else if (fileChoice == '2')
        {
          System.out.println(Clues.suspectDescription());

          System.out.println("\nEnter '1' when you are ready to continue: ");
          char continueChoice = scanner.nextLine().charAt(0);
          if (continueChoice == '1')
          {
            continue;
          }
        }
        else if (fileChoice == '3')
        {
          System.out.println(STAFF_SUBMENU);
          System.out.println("Which staff list do you want to view?");
          char staffChoice = scanner.nextLine().charAt(0);
          String staffList = "";

          switch (staffChoice)
          {
            case '1':
              staffList = Clues.employees1();
              break;
            case '2':
              staffList = Clues.employees2();
              break;
            case '3':
              staffList = Clues.employees3();
              break;
            case '4':
              staffList = Clues.employees4();;
              break;
            case '5':
              staffList = Clues.employees5();
              break;
            default:
              System.out.println("ERROR: Please enter a number 1 - 5.");
              continue;
          }

          System.out.println(staffList);

          System.out.println("\nEnter '1' when you are ready to continue: ");
          char continueChoice = scanner.nextLine().charAt(0);
          if (continueChoice == '1')
          {
            continue;
          }
        }
        else if (fileChoice == '4')
        {
          System.out.println("Hmmm.. we have the timestamp for when Sandy went missing," + 
          " but the times seem to have been encoded wrong. Can you help?");
          System.out.println(Clues.missingTime());

          System.out.println("\nEnter '1' when you are ready to continue: ");
          char continueChoice = scanner.nextLine().charAt(0);
          if (continueChoice == '1')
          {
            continue;
          }
        }
        else 
        {
          System.out.println("ERROR: Please enter a number 1 - 3.");
          continue;
        }
      }

      else if (userChoice == '4')
      {
        String result = MakeGuess1.makeGuess1();

        if (result == "You are correct!")
        {
          System.out.println(result);
          System.out.println("Since you know who took Sandy and what store she is in, you only need one more thing!" + 
          " Here is the map of Forest's Sports Goods. When you are ready, enter '1' to make your guess." +
          " You only get 2 trys, so be sure!");
          System.out.println(Clues.map2(hintsLeft));

          System.out.println("Enter 1 to make your final guess: ");
          char finalGuess = scanner.nextLine().charAt(0);
          if (finalGuess == '1'){
            System.out.println(MakeGuess2.makeGuess2(0));
          }
          else
          {
            System.out.println("I guess you weren't ready, no worries!");
          }
        }
      }

      else if (userChoice == '5')
      {
        System.out.println(GetHint.getHint(hintsLeft));
        hintsLeft --;
        System.out.println("\nEnter '1' when you are ready to continue: ");
        char continueChoice = scanner.nextLine().charAt(0);
        if (continueChoice == '1')
        {
          continue;
        }
      }

      else 
      {
        System.out.println("ERROR: Please choose a number between 1 and 6.");
        continue;
      }
    }
    
    // If user chooses to exit game
    System.out.println("Thank you for playing Mystery 1.0!");
    scanner.close();
  }
}