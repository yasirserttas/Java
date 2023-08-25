import java.util.Scanner;


public class dizilerdeSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.print( (i + 1) + ". elemani giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < boyut - 1; i++) {
            for (int j = 0; j < boyut - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }

        
        for (int eleman : dizi) {
            System.out.print(eleman + " ");
        }

        
    }
}
