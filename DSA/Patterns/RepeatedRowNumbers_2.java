package DSA.Patterns;

//2. Repeated Row Numbers
//✅ Print a triangle where each row contains repeated numbers.
//        1
//        22
//        333
//        4444
//        55555

public class RepeatedRowNumbers_2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(i);
            System.out.println("");

        }

    }
}