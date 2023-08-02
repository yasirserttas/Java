import java.util.Scanner;

public class basamakSayilariToplami {
    public static void main(String[] args) {
        
        int sayi, basamak, toplam;
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Bir sayi girin: ");
        sayi = scanner.nextInt();

        toplam = 0;
        while (sayi > 0) {
            
            basamak = sayi % 10;
            toplam += basamak;

            
            sayi /= 10;
        }
        

        
        System.out.println("Basamaklarin toplami: " + toplam);
    }
}
