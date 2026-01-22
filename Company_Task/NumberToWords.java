package Company_Task;

public class NumberToWords {

    static String[] ones = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
    };

    static String[] teens = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    static String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    static String twoDigit(int n) {
        if (n < 10)
            return ones[n];

        if (n < 20)
            return teens[n - 10];

        return tens[n / 10] + " " + ones[n % 10];
    }


    static String threeDigit(int n) {
        if (n < 100)
            return twoDigit(n);

        return ones[n / 100] + " Hundred " + twoDigit(n % 100);
    }


    static String numberToWords(int n) {
        if (n == 0)
            return "Zero";

        if (n < 1000)
            return threeDigit(n);

        return threeDigit(n / 1000) + " Thousand " + threeDigit(n % 1000);
    }

    public static void main(String[] args) {
  //      System.out.println(numberToWords(123456));
        System.out.println(numberToWords(5314101));
    }
}
