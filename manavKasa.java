import java.util.Scanner;
public class manavKasa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double muz=0.95,elma=3.67,armut=2.14,domates=1.11,patlican=5.0,tp;
        int adet;

        System.out.print("elma kac kilo? ");
        adet = in.nextInt();
        System.out.print("\n");

        tp= elma*adet;


        System.out.print("muz kac kilo? ");
        adet = in.nextInt();
        System.out.print("\n");
        tp= muz*adet;

        System.out.print("armut kac kilo? ");
        adet = in.nextInt();
        System.out.print("\n");
        tp= armut*adet;

        System.out.print("domates kac kilo? ");
        adet = in.nextInt();
        System.out.print("\n");
        tp= domates*adet;

        System.out.print("patlican kac kilo? ");
        adet = in.nextInt();
        System.out.print("\n");
        tp= patlican*adet;

        System.out.print("toplam: "+tp);




    }
}