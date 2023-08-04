import java.util.Scanner;

public class metotOlusturma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir baslangic sayi girin: ");
        int n = scanner.nextInt();
        recursiveKural(n);
        
    }

    public static void recursiveKural(int num) {
        System.out.println("Mevcut deger: " + num);

        if (num > 0) {
            
            recursiveKural(num - 5);
        } else {
            
            
            num += 5;
            System.out.println("Mevcut deger: " + num);
            if (num <= 0) {
                
                return;
            } else {
                recursiveKural(num);
            }
        }
    }
}
