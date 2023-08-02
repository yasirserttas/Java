import java.util.Scanner;


public class tekSayiGirileneKadar {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a,b=0;

        while(true){
            System.out.print("sayi gir:");
            a= scan.nextInt();

            if(a%4==0){
                b+=a;

            }

            if(a%2==1){
                break;
            }



        
        }

        System.out.print("toplam:"+b);
    }
    
}
