import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n = ");
        n = scanner.nextInt();
        //y a
        yA(n);
        //y b
        yB(n);
        //y c
        yC(n);
    }

    private static void yC(int n) {
        int i;
        float s2 = 0;
        for (i = 1; i <= n; i++) {
            s2 += (1.0) / (i * (i + 1));
        }
        System.out.printf("Tong cua bieu thuc S(%d)=%f", n, s2);
    }

    private static void yB(int n) {
        int i;
        long s1 = 0, p = 1;
        for (i = 1; i <= n; i++) {
            p = p * i;
            s1 = s1 + p;
        }
        System.out.println("Tong cua bieu thuc = " + s1);
    }

    private static void yA(int n) {
        int i;
        float s = 0;
        for (i = 1; i <= n; i++) {
            s = s + (float) (1.0 / (2 * i));
        }
        System.out.printf("Tong 1/2+1/4+...+1/%d = ", 2 * n);
        System.out.println(Math.round(s * 100.0) / 100.0);
    }


}
