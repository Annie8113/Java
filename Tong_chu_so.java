import java.util.Scanner;

public class Tong_chu_so {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap n: ");
    int n = scanner.nextInt();
    System.out.println("Tong cac chu so cua " + n + " la: " + Number(n));
    } 
    public static int Number (int n) {
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n/10;
        }
        return sum;
    }
}
