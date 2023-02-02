import java.util.Scanner;

public class Giai_thua {
    public static long Giai(int n) {
        if (n > 0) {
            return n * Giai(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.println("n! = " + Giai(n));
    }
}
