package DSA.Patterns;

//3. Floyd’s Triangle
//✅ Print Floyd's triangle up to n = 5 rows.
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15


public class FloydsTriangle_3 {
    public static void main(String[] args) {
        int k = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println(" ");
        }
    }
}