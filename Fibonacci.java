import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
//        int i = 0;
        System.out.println(Fibo(n));    // Xuất phần tử Fibo thứ n
// Xuất dãy Fibonacci
        // while (Fibo(i) <= n) {
        //     System.out.print(Fibo(i) + " ");
        //     i++;
        // }
    }
    public static int Fibo (int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return Fibo(n - 2) + Fibo(n - 1);
        }
    }
}
