import java.util.Scanner;

public class diziFrekans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemani giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        System.out.println("Eleman frekanslari:");
        for (int i = 0; i < boyut; i++) {
            int frekans = 1;  
            for (int j = i + 1; j < boyut; j++) {
                if (dizi[i] == dizi[j]) {
                    frekans++;
                    dizi[j] = -1; 
                }
            }
            if (dizi[i] != -1) {
                System.out.printf(dizi[i] + " -> " + frekans + " kez");
            }
        }

        
    }
}
