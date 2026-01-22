package Company_Task;

import java.util.Scanner;

public class Prime_Number{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which number you want Prime or not ");

        int number = sc.nextInt();
        int i;
        for( i = 2 ; i<number ; i++ ){
            if(number % i == 0)
                break;

    }
        if(i==number)
            System.out.println("this is a prime number");
        else
            System.out.println("this is not a prime number");


}
}
