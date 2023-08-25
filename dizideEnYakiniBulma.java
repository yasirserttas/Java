import java.util.Scanner;

public class dizideEnYakiniBulma {
    public static void main(String[] args) {
        int[] dizi = {15, 12, 788, 1, -1, -778, 2, 0};
        
        Scanner abc = new Scanner(System.in);
        System.out.print("Bir sayi gir: ");
        int a = abc.nextInt();
        
        int enYakinKucuk = -1;  // Başlangıçta en yakın küçük sayı yok olarak işaretlenir.
        int enYakinBuyuk = -1;  // Başlangıçta en yakın büyük sayı yok olarak işaretlenir.
        
        for (int num : dizi) {
            if (num < a && (enYakinKucuk == -1 || num > enYakinKucuk)) {
                enYakinKucuk = num;
            }
            if (num > a && (enYakinBuyuk == -1 || num < enYakinBuyuk)) {
                enYakinBuyuk = num;
            }
        }
        
        if (enYakinKucuk != -1) {
            System.out.println("Girilen sayidan kucuk en yakin sayi: " + enYakinKucuk);
        } else {
            System.out.println("Girilen sayidan kucuk bir sayi bulunamadi");
        }
        
        if (enYakinBuyuk != -1) {
            System.out.println("Girilen sayidan büyük en yakin sayi: " + enYakinBuyuk);
        } else {
            System.out.println("Girilen sayidan büyük bir sayi bulunamadi");
        }
    }
}