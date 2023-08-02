import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int elemanSayisi,i,oncekiEleman = 0,simdikiEleman = 1;

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
         elemanSayisi = input.nextInt();

         
         

        System.out.print("Fibonacci Serisi: " + oncekiEleman + " " + simdikiEleman);

        for ( i = 2; i < elemanSayisi; i++) 
        {
            int sonrakiEleman = oncekiEleman + simdikiEleman;

            System.out.print(" " + sonrakiEleman);

            oncekiEleman = simdikiEleman;

            simdikiEleman = sonrakiEleman;
        }

        
    }

    
}
