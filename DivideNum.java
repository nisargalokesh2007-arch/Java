
import java.util.Scanner;

public class DivideNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;

            if (num % digit == 0) {
                count++;
            }

            temp = temp / 10;
        }

        System.out.println("Count: " + count);

        sc.close();
    }
}
