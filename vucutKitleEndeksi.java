import java.util.Scanner;


public class vucutKitleEndeksi {
    public static void main(String[] args) {
        double kilo,boy,tp;
        Scanner inp = new Scanner(System.in);
        System.out.print("kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        System.out.print("\n");
        System.out.print("boyunuzu giriniz(metre cinsinden): ");
        boy = inp.nextDouble();
        System.out.print("\n");
        tp = kilo/(boy*boy);
        System.out.print("vucut kitle endeksi:"+tp);
        







        


    }
}
