import java.util.Scanner;

public class Liet_ke_SNT_co_5_chu_so {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap n: ");
    int n = scanner.nextInt();
    String s = "";
    for (int i = 2; i < n; i++) {
        if (Check(i) && Number(i) == 5) s = s + i + " ";
    }
    System.out.println("Cac so nguyen to co 5 chu so la: " + s);
} 
    public static boolean Check(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int Number (long n) {
        int dem = 0;
        while (n != 0) {
            n = n/10;
            dem++;
        }
        return dem;
    }
}
