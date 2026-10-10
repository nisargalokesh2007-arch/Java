
import java.util.Scanner;

public class AddDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        while (num >= 10) {
            int sum = 0;

            while (num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            num = sum;
        }

        System.out.println("Output: " + num);

        sc.close();
    }
}
