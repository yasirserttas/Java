import java.util.Scanner;


public class girilensayiyakadar {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);
        int a;
        int toplam=0;

        System.out.print("bir sayi giriniz:");
        a= abc.nextInt();
        for (int i=1 ; i<=a; i++){
            if(a%4==0 || a%3==0){
                toplam+=a;
            }
        }
        System.out.print("toplam: "+toplam);
    }
    
    

    
}
