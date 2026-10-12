import java.util.Scanner;

public class ConBinary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of binary digits: ");
        int n = sc.nextInt();

        int result = 0;

        System.out.println("Enter the binary digits (0 or 1):");

        for (int i = 0; i < n; i++) {
            int bit = sc.nextInt();
            result = result * 2 + bit;
        }

        System.out.println("Decimal value: " + result);

        sc.close();
    }
}