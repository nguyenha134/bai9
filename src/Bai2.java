import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a = ");
        a = scanner.nextInt();
        System.out.println("Nhap so b = ");
        b = scanner.nextInt();
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la: " + USCLN(a, b));
        System.out.println("Boi chung nho nhat cua " + a + " va " + b + " la: " + BSCNN(a, b));


    }

    public static int USCLN(int a, int b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }

    public static int BSCNN(int a, int b) {
        return (a * b) / USCLN(a, b);
    }
}
