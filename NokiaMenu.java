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
          default:
            System.out.println("Invalid selection");
            break;
        }
        break;//BREAK FOR PHONEBOOK MENU

      case 2://MESSAGES MENU
      		String displayMessagesMenu = """
\t\t___Messages___
1 => Write Messages\t\t6 => Smileys
2 => Inbox\t\t\t7 => Message Settings
3 => Outbox\t\t\t8 => Info Service
4 => Picture Messages\t\t9 => Voice Mailbox Number
5 => Templates\t\t\t10=> Service Command Editor

Select Menu (Enter corresponding number): """;
    System.out.print(displayMessagesMenu);
      int messagesMenu = input.nextInt();

      switch(messagesMenu){
        case 1:
          System.out.println("Write Messages");
          break;
        case 2:
          System.out.println("Inbox");
          break;
        case 3:
          System.out.println("Outbox");
          break;
        case 4:
          System.out.println("Picture Messages");
          break;
        case 5:
          System.out.println("Templates");
          break;
        case 6:
          System.out.println("Smileys");
          break;
        case 7:
          String displayMessageSettingsMenu = """
\t\t___Message Settings___
1 => Set 1
2 => Common

Select Options Menu (Enter corresponding number): """;
            System.out.print(displayMessageSettingsMenu);
            int messageSettingsMenu = input.nextInt();

            switch(messageSettingsMenu){
              case 1://SET 1 MENU
                String displaySet1Menu = """
\t\t___Message Settings___
1 => Message Centre Number
2 => Messages Sent As
3 => Message Validity

Select Options Menu (Enter corresponding number): """;
              System.out.print(displaySet1Menu);
              int set1Menu = input.nextInt();

                switch(set1Menu){
                  case 1:
                    System.out.println("Message Centre Number");
                    break;
                  case 2:
                    System.out.println("Messages Sent As");
                    break;
                  case 3:
                    System.out.println("Message Validity");
                    break;
                  default:
                    System.out.println("Invalid selection");
                    break;
              }
              break;//END OF SET 1 MENU

              case 2://COMMON MENU
                String displayCommonMenu = """
\t\t___Message Settings___
1 => Delivery Reports
2 => Reply Via Same Centre
3 => Character Support

Select Options Menu (Enter corresponding number): """;
                System.out.print(displayCommonMenu);
                int commonMenu = input.nextInt();

              switch(commonMenu){
                case 1:
                  System.out.println("Delivery Reports");
                  break;
                case 2:
                  System.out.println("Reply Via Same Centre");
                  break;
                case 3:
                  System.out.println("Character Support");
                  break;
                default:
                  System.out.println("Invalid selection");
                  break;
              }//END OF MESSAGES COMMON MENU
              break;
            default:
              System.out.println("Invalid selection");
              break;
            }//END OF MESSAGE SETTINGS
            break;
        case 8:
          System.out.println("Info Service");
          break;
        case 9:
          System.out.println("Voice Mailbox Number");
          break;
        case 10:
          System.out.println("Service Command Editor");
          break;
        default:
          System.out.println("Invalid selection");
          break;
      }
      break;//BREAK FOR MESSAGES MENU

      case 3://CHAT MENU
        System.out.println("Chat");
        break;

      //case 4:
            
      }

    }//MAIN MENU END



}
