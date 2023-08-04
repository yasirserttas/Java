import java.util.Scanner;

public class asalSayiRecursive {

    
    static boolean isPrime(int num, int divisor) {
        
        if (num <= 2) {
            return num == 2;
        }

        if (num % divisor == 0) {
            return false;
        }

        if (divisor * divisor > num) {
            return true;
        }

       
        return isPrime(num, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi gir: ");
        int num = scanner.nextInt();

        if (num < 2) {
            System.out.println("Asal degil.");
        } else {
            if (isPrime(num, 2)) {
                System.out.println(num + " Asal bir sayidir.");
            } else {
                System.out.println(num + " Asal bir sayi degil.");
            }
        }

        
    }
}
