import java.util.Scanner;

public class harmonikSeri{
    public static void main(String[] args) {
        
        Scanner yasir = new Scanner(System.in);
        int n,i;
        System.out.print("Bir sayı girin: ");
         n = yasir.nextInt();
        

        double harmonikSerisi = 0;

        for ( i = 1; i <= n; i++) {

            harmonikSerisi += (1.0 / i);


        }
        
        System.out.print("Girilen sayinin harmonik serisi: " + harmonikSerisi);


    }


}
