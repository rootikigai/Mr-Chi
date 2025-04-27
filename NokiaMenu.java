import java.util.Scanner;

public class NokiaMenu {
	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
//MAIN MENU
		String displayMenu = """

\t\t___Menu___
1 => Phone Book\t\t\t7 => Call Divert
2 => Message\t\t\t8 => Games
3 => Chat\t\t\t9 => Calculator
4 => Call Register\t\t10=> Reminders
5 => Tones\t\t\t11=> Clock
6 => Settings\t\t\t12=> Profiles
\t\t13=> SIM Services

Select Menu (Enter corresponding number): """;
    System.out.print(displayMenu);
    int mainMenu = input.nextInt();

    switch(mainMenu){
      case 1://PHONE BOOK MENU
		    String displayPhoneBook = """
\t\t___Phone Book___
1 => Search\t\t6 => Assign Tone
2 => Service Nos.\t7 => Send B'Card
3 => Add Name\t\t8 => Options
4 => Erase\t\t9 => Speed Dials
5 => Edit\t\t10=> Voice Tags

Select Phone Book Menu (Enter corresponding number): """;
        System.out.print(displayPhoneBook);
        int phoneBookMenu = input.nextInt();

        switch(phoneBookMenu){
          case 1:
            System.out.println("Search");
            break;
          case 2:
            System.out.println("Service Nos.");
            break;
          case 3:
            System.out.println("Add Name");
            break;
          case 4:
            System.out.println("Erase");
            break;
          case 5:
            System.out.println("Edit");
            break;
          case 6:
            System.out.println("Assign Tone");
            break;
          case 7:
            System.out.println("Send B'Card");
            break;
          case 8://PHONEBOOK OPTIONS MENU
		        String displayPhoneBookOptions = """
\t\t___Options___
1 => Type of View
2 => Memory Status

Select Options Menu (Enter corresponding number): """;
            System.out.print(displayPhoneBookOptions);
            int phoneBookOptions = input.nextInt();

            switch(phoneBookOptions){
              case 1:
                System.out.println("Type of View");
                break;
              case 2:
                System.out.println("Memory Status");
                break;
              default:
                System.out.println("Invalid selection");
                break;
            }
            break;//BREAK FOR PHONEBOOK OPTIONS MENU
          case 9:
            System.out.println("Speed Dials");
            break;
          case 10:
            System.out.println("Voice Tags");
            break;
        }
        break;//BREAK FOR PHONEBOOK MENU
    }//MAIN MENU END



	}
}
