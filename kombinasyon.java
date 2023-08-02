import java.util.Scanner;

public class kombinasyon {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("N degerini giriniz: ");
        int n = scan.nextInt();

        System.out.println("R degerini giriniz: ");
        int r = scan.nextInt();

        long kombinasyon = 1;
        for (int i = 1; i <= r; i++) {
            kombinasyon *= (n - i + 1);
            kombinasyon /= i;
        }

        System.out.println("C(n, r) = " + kombinasyon);
    }
}