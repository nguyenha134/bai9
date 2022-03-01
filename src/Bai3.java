import java.util.Scanner;

public class Bai3 {
    public static int DEC_10 = 10;

    public static void main(String[] args) {
        System.out.println("Nhap so nguyen duong n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("Tong cua cac so " + "cua %d la: %d", n, tongCacChuSo(n));
        System.out.printf("\nSo cac chu so cua %d la: %d", n, soCacChuSo(n));

    }

    public static int tongCacChuSo(int n) {
        int total = 0;
        do {
            total = total + n % DEC_10;
            n = n / DEC_10;
        } while (n > 0);
        return total;
    }

    public static int soCacChuSo(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }
}
