public class Kata{

  public static boolean isEven(int num){
    return num % 2 == 0;
  }

  public static boolean isPrimeNum(int num){
      for(int i = 2;i * i <= num; i++){
        if(num % i == 0){
          return false;
        }
      }
      return true;
  }

  public static int subtract(int a, int b){    
    if(a < b){
        return -(a - b);
    }
    else return a - b;
  }

  public static float divide(int a, int b){
    if(b == 0){
      return 0;//come back to this...it still returns 0.0
    }
    else return (float) a / b;
  }

  public static int factorOf(int num){
    int count = 0;
    for(int i = 1; i <= num; i++){
      if(num % i == 0){
        count++;
      }
    }
    return count++;
  }
}
