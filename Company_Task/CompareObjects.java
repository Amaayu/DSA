package Company_Task;

import java.util.Scanner;

public class CompareObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.next();

        System.out.print("Enter second string: ");
        String s2 = sc.next();

        if (s1.equals(s2))
            System.out.println("Objects are Equal");
        else
            System.out.println("Objects are NOT Equal");
    }
}

