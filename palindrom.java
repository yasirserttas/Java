import java.util.Scanner;

public class palindrom{

    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin: ");
        String kelime = scanner.nextLine();
        int uzunluk = kelime.length(); 
        String tersKelime = "";
        for (int i = uzunluk - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }
        
        if (kelime.equals(tersKelime)) {
            System.out.println("Kelime palindromik.");
        } else {
            System.out.println("Kelime palindromik degil.");
        }
    }
}