import java.util.Scanner;

public class palandromik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi gir: ");
        int sayi = scanner.nextInt();

        if (isPalindrom(sayi)) {
            System.out.println(sayi + " palindromik bir sayidir.");
        } else {
            System.out.println(sayi + " palindromik bir sayi degildir.");
        }
    }

    public static boolean isPalindrom(int num)
     {
        int tersNum = 0;
        int temp = num;

        while (temp != 0) 
        {
            int birlerBasamagi = temp % 10;
            tersNum = tersNum * 10 + birlerBasamagi;
            temp /= 10;
        }

        return num == tersNum;
    }
}