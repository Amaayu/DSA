package Company_Task;

public class PetersonNumber {

  static int fectorial(int n){
       int fec = 0 ;
       while(n!=0){
           fec =  fec * n;
       n--;
       }
       return fec;
    }

    public static void main(String[] args) {
        int num = 145;
        int ans = num;
        int num1= 0;

        while (num!=0){
            num1 = num % 10;

       ans =+ PetersonNumber.fectorial(num1);
        }

    }
}
