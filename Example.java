
    import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n, a = 0, b = 1, next;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        System.out.println("Fibonacci Series:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            next = a + b;
            a = b;
            b = next;
        }

        sc.close();
    }
}

