import java.util.Scanner;

public class ReportCard{
	public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    int count;
    int countInv = 0;
    int countVal = 0;
    int countA = 0;
    int countB = 0;
    int countC = 0;
    int countD = 0;
    int countF = 0;
    int countScores = 0;

    System.out.println("Enter your valid score: ");
    int score = input.nextInt();
    
    for(count = 1; count <= 10; count++){

      if(score < 0 || score > 100){
        System.out.print("Invalid input. Try again");
        countInv++;
      }
      else{

/*
80-100 A
70-79 B
60-69 C
50-59 D
49 Below F
*/

        switch(score/10){
          case 8, 9, 10: System.out.println("A");
            case 11: System.out.print("Enter another score: ");
                      score = input.nextInt();
                      countA++;
                      countVal++;
                      countScores =+ countA;
            break;
          case 7: System.out.println("B");
            case 12: System.out.print("Enter another score: ");
                      score = input.nextInt();
                      countB++;
                      countVal++;
                      countScores =+ countB;
                      break;
          case 6: System.out.println("C");
            case 13: System.out.print("Enter another score: ");
                      score = input.nextInt();
                      countC++;
                      countVal++;
                      countScores =+ countC;
                      break;
          case 5: System.out.println("D");
            case 14: System.out.print("Enter another score: ");
                      score = input.nextInt();
                      countD++;
                      countVal++;
                      countScores =+ countD;
                      break;
          case 4, 3, 2, 1: System.out.println("F");
            case 15: System.out.print("Enter another score: ");
                      score = input.nextInt();
                      countF++;
                      countVal++;
                      countScores =+ countF;
                      break;
        }
      }
    }
    System.out.printf("Invalid inputs: %d%nValid inputs: %d%nScore count Grade A: %d%nScore count Grade B: %d%nScore count Grade C: %d%nScore count Grade D: %d%nScore count Grade F: %d%n", countInv, countVal, countA, countB, countC, countD, countF);
  }
}
