import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1,sayi2,ebob,ekok;
        
        System.out.print("Birinci sayiyi gir: ");
         sayi1 = scanner.nextInt();
        
        System.out.print("İkinci sayiyi gir: ");
         sayi2 = scanner.nextInt();
        
         ebob = 1;
         ekok = (sayi1 * sayi2) / ebob;
        
        while (sayi1 != sayi2) {

            if (sayi1 > sayi2) {

                sayi1 -= sayi2;

            } 
            else 
            {

                sayi2 -= sayi1;

            }
        }
        
        ebob = sayi1;

        ekok = (sayi1 * (sayi2 / ebob));

        
        System.out.print("Girilen sayilarin EBOB'u: " + ebob+"\n" +"Girilen sayilarin EKOK'u: " + ekok);
        
    }
}
