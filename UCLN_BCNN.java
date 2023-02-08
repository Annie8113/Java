import java.util.Scanner;

public class UCLN_BCNN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 2 so nguyen duong: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // int BC = a*b;
        System.out.println("Uoc chung lon nhat la: " + UCLN(a, b));
        System.out.println("Boi chung nho nhat la: " + BCLN(a, b));
    }
    public static int UCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public static int BCLN(int a, int b) {
        return (a*b)/UCLN(a, b);
    }
}
