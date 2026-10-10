
import java.util.Scanner;

public class NumBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            int bit = n % 2;

            if (bit == 1) {
                count++;
            }

            n = n / 2;
        }

        System.out.println("Number of 1 bits: " + count);

        sc.close();
    }
}
