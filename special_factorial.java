// A number is called a Special Number if the sum of the factorials of all its digits is equal to the original number.
// logic only,refer hackerrank problem 1 for full code
import java.util.Scanner;
public class special_factorial {


    public static int isspecial(int n) {
        int original = n;
        int result = 0;

        while (n > 0) {
            int digit = n % 10;
            int fact = 1;

            for (int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            result = result + fact;
            n = n / 10;
        }

        if (result == original) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int result = isspecial(n);

        if (result == n) {
            System.out.println(n + " is a Special Number");
        } else {
            System.out.println(n + " is not a Special Number");
        }

        sc.close();
    }
}