public class Kata{

  public static boolean isEven(int num){
    return num % 2 == 0;
  }

  public static boolean isPrimeNum(int num){
      for(int i = 2;i * i <= num; i++){
        if(num % i == 0){
          return false; //why stress typing !true...not stress though. You'd still tap the keyboard 5 times for each of 'em. No!...6 times for !true, 'cause of the shift key and 1 to get '!'. Mtcheew...ignore my thoughts!!!
        }
      }
      return true;
  }

  public static int posDiff(int a, int b){    
    if(a < b){
        return -(a - b);
    }
    else return a - b;
  }
}
