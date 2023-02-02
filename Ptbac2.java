import java.util.Scanner;

// ax^2 + bx + c = 0 
public class Ptbac2 {
    // Đọc DL đầu vào
    private static Scanner scanner = new Scanner(System.in);

    public static void Giai(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else {
                System.out.println("Phuong trinh có 1 nghiem: x = " + (-c/b));
            }
            return;
        }
        float Delta = b*b - 4*a*c;
        float x1, x2;
        if (Delta > 0) {
            x1 = (float) ((-b + Math.sqrt(Delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(Delta)) / (2*a));
            System.out.println("Phuong trinh có 2 nghiem:");
            System.out.println("x1 = " + x1 + "; x2 = " + x2);
        } else if (Delta == 0) {
            x1 = (-b / (2*a));
            System.out.println("Phuong trinh co nghiem kep: ");
            System.out.println("x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2: ax^2 + bx + c = 0");
        System.out.print("Nhap a = ");
        float a = Ptbac2.scanner.nextFloat();
        System.out.print("Nhap b = ");
        float b = Ptbac2.scanner.nextFloat();
        System.out.print("Nhap c = ");
        float c = Ptbac2.scanner.nextFloat();
        Ptbac2.Giai(a,b,c);
    }

}
