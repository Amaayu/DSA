package Company_Task;

import java.util.Scanner;

public class Fibonacci_Series {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter single digit number you want print fibonacci_Series" + "\n");
        Integer Number = scan.nextInt();

        int First = 0;
        int Second = 1;
        int Next ;

        System.out.print("0,");

        for (int i = 0 ; i < Number ; i++){

          Next =   First + Second;
          First =  Second;
          Second = Next;

            System.out.print(First +  ",");
        }

    }
}
