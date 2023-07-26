import java.util.Scanner;

public class kdvHesapla {
    public static void main(String[] args) {
        double tutar,kdv;
        Scanner ina = new Scanner(System.in);

        System.out.print("urun tutarini giriniz: ");
        tutar = ina.nextDouble();

        if(tutar<1000 ){
            kdv = 0.18;
        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV orani tutar:%"+(kdv*100));
        System.out.println("KDV dahil tutar: "+(tutar*kdv+tutar));

        }
        else if(tutar>0) {
            kdv = 0.08;
        System.out.println("KDV'siz tutar: "+tutar);
        System.out.println("KDV orani tutar:%"+(kdv*100));
        System.out.println("KDV dahil tutar: "+(tutar*kdv+tutar));

        }
        else{
            System.out.println("0 dan kucuk bir tutar olamaz");

        }

        

        




    }
    
}
