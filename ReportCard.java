import java.util.Scanner;

public class ReportCard{
	public static void main(String[] args){

		/*String display = """
------------------------------------
Score Range                  Grade
80 - 100                      A
70 - 79                       B
60 - 69                       C
50 - 59                       D
49 Below                      F

""";
    System.out.println(display);*/
    Scanner input = new Scanner(System.in);

    int countInv = 0;
    int countVal = 0;
    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;
    int countE = 0;
    int countScores = 0;

    System.out.print("Enter your valid score: ");
    int score = input.nextInt;
    
    switch(score/10){
      case 8, 9, 10: System.out.println("A");
        case 1: System.out.print("Enter another score");
                score = input.nextInt();
                countA++;
                countVal++;
                countScores =+ countA;
                break;
      case 7: System.out.println("B");
        case 1: System.out.print("Enter another score");
                score = input.nextInt();
                countB++;
                countVal++;
                countScores =+ countB;
                break;
     /* case 6: System.out.println("C"); break;
      case 5: System.out.println("D"); break;
      default:System.out.println("F");
		}
    if(score >= 80 || score <= 100){
    countA++;
    while(score < 0 || score > 100){
      System.out.print("Invalid input. Try again: ");
      score = input.nextInt();
      countInv++;
    }
    while(score >= 0 || score <= 100){
      System.out.print("Enter another score: ");
      score = input.nextInt();
      countVal++;
      if(countVal == 10){
        break;
      }
    }*/
    }
	}
}
