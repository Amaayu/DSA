package Company_Task;

import java.util.Scanner;
import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter max range: ");
        int max = sc.nextInt();

        int randomNumber = rand.nextInt(max);
        System.out.println("Random Number: " + randomNumber);
    }
}
