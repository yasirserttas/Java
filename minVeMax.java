import java.util.Scanner;

public class minVeMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("kac sayi girilecek: ");
        int n ,enBuyuk, enKucuk,sayi;

        n=input.nextInt();

        System.out.print("1. sayiyi gir: ");
        sayi = input.nextInt();
        enBuyuk = sayi;
        enKucuk = sayi;

        for (int i = 1; i < n; i++) {
            System.out.print((i + 1) + ". sayiyi gir: ");
            sayi = input.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }

            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En en buyuk sayi: " + enBuyuk);
        System.out.println("En kucuk sayi: " + enKucuk);

       
    }
}