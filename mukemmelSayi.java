import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi,i,toplam=0;

        System.out.print("Bir sayi gir: ");
         sayi = input.nextInt();

        
        for ( i = 1; i < sayi; i++) 
        {
            if (sayi%i==0) {

                toplam+=i;

            }
        }

        if (toplam == sayi) 
        {
            System.out.println("Mukemmel sayidir");
        } else 
        {
            System.out.println("Mukemmel sayi degildir");
        }

        
    }
}
