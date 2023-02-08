import java.util.Scanner;

public class Liet_ke_SNT {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = scanner.nextInt();
        String s = "";
        for (int i = 2; i < n; i++) {
            if (Check(i)) s = s + i + " ";
        }
        System.out.println("Cac so nguyen to nho hon " + n + " la: " + s);
   } 
   public static boolean Check(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
   }
}
