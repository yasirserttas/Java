import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int basamak,j,k,i;

        System.out.print("Basamak sayiyisi gir ");

         basamak = input.nextInt();

        for ( i = basamak; i >= 1; i--)
         {
            for ( j = 1; j <= basamak - i; j++) 
            {

                System.out.print(" ");
            }
            for ( k = 1; k <= 2 * i - 1; k++)
             {

                System.out.print("*");
            }
            System.out.println();
        }

        
    }
}
