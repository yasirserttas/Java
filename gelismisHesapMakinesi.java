import java.util.Scanner;




public class gelismisHesapMakinesi

{
static void top(){
    Scanner scan = new Scanner(System.in);
    int a,b;
    System.out.print("birinci sayiyi gir:");
    a= scan.nextInt();
    System.out.print("ikinci sayiyi gir:");
    b= scan.nextInt();
    System.out.print("sonuc:"+(a+b));
    
}
static void cik(){
    Scanner scan = new Scanner(System.in);
    int a,b;
    System.out.print("birinci sayiyi gir:");
    a= scan.nextInt();
    System.out.print("ikinci sayiyi gir:");
    b= scan.nextInt();
    System.out.print("sonuc:"+(a-b));
    
}
static void cap(){
    Scanner scan = new Scanner(System.in);
    int a,b;
    System.out.print("birinci sayiyi gir:");
    a= scan.nextInt();
    System.out.print("ikinci sayiyi gir:");
    b= scan.nextInt();
    System.out.print("sonuc:"+(a*b));
    
}
static void bol(){
    Scanner scan = new Scanner(System.in);
    int a,b;
    System.out.print("birinci sayiyi gir:");
    a= scan.nextInt();
    System.out.print("ikinci sayiyi gir:");
    b= scan.nextInt();
    System.out.print("sonuc:"+(a/b));
    
}
static void uslu(){
    Scanner scan = new Scanner(System.in);
    int a,b,c=1;
    System.out.print("taban sayiyi gir:");
    a= scan.nextInt();
    System.out.print("ussu gir:");
    b= scan.nextInt();
    for (int i=0;i<b;i++){
        c*=a;
        
    }
    System.out.print("sonuc:"+c);

    
}
static void faktoriyel(){
    Scanner scan = new Scanner(System.in);
    int a,b=1;
    System.out.print("kacinci faktoriyel:");
    a= scan.nextInt();
    for(int i=1;i<=a;i++){
        b*=i;
        
        
    }
    System.out.print(a+"!="+b);
    
    
    
}
static void mod(){
    Scanner scan = new Scanner(System.in);
    int a,b;
    System.out.print("birinci sayiyi gir:");
    a= scan.nextInt();
    System.out.print("ikinci sayiyi gir:");
    b= scan.nextInt();
    System.out.print("sonuc:"+(a%b));

    
    
}
static void dikdotgen(){
    Scanner scan = new Scanner(System.in);
    int a,b;
    System.out.print("birinci kenar uzunlugu:");
    a= scan.nextInt();
    System.out.print("ikinci kenar uzunlugu:");
    b= scan.nextInt();
    System.out.print("sonuc:"+(a*b));
    
}
    


    public static void main(String[] args) {
    Scanner abc= new Scanner(System.in);
    int a;
    System.out.print("1- Toplama islemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "4- Bolme islemi\n"
                + "5- Uslu sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve cevre Hesabi\n"
                + "0- cikis Yap\n"
                + "secimi giriniz:");

                a= abc.nextInt();
                

                switch (a) {
                    case 1:
                        top();
                        break;
                    case 2:
                        cik();

                        break;
                    case 3:
                        cap();
                     
                        break;
                    case 4:
                        bol();
                        
                        break;
                    case 5:
                        uslu();

                        break;
                    case 6:
                        faktoriyel();
                     
                        break;
                    case 7:
                        mod();

                        break;
                    case 8:
                        dikdotgen();
                     
                        break;
                    case 0:
                        System.out.print("yanlis deger girdiniz tekrar deneyin");

                        break;
                    
                    default:
                        break;
                }



                

    }
    
    
}
