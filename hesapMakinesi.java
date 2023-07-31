import java.util.Scanner;

public class hesapMakinesi {


public static void main(String[] args) {

    int a,b,c;
    double tp;
    
    //girmek istediginiz sayilari alir 
    Scanner inp = new Scanner(System.in);
    System.out.print("birinci sayi'yi giriniz: ");
    a = inp.nextInt();

    System.out.print("ikinci sayi'i giriniz: ");
    b = inp.nextInt();

    System.out.println("hangi islemi yapmak istiyorsunuz?");
    System.out.println("1-toplama");
    System.out.println("2-cikarma");
    System.out.println("3-carpma");
    System.out.println("4-bolme");
    c = inp.nextInt();


    switch (c) {
        case 1:
        tp=a+b;
           System.out.print("sonuc: "+tp);
            break;

        case 2:
            tp=a-b;
           System.out.print("sonuc: "+tp);
            break;  

        case 3:
            tp=a*b;
           System.out.print("sonuc: "+tp);

            break;

        case 4:
        tp=a/b;
           System.out.print("sonuc: "+tp);


            
            break;

        default:
        System.out.print("yanlis tusladiniz.");

            break;
    }








}
    
}
