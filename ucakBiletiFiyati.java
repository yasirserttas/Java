import java.util.Scanner;

public class ucakBiletiFiyati {
    public static void main(String[] args) {
        Scanner abc= new Scanner(System.in);

        int mesafe,yas,tip;
        double ucret;
        System.out.print("mesafeyi giriniz: ");
        mesafe = abc.nextInt();
        ucret= mesafe*(0.1);
        System.out.print("yolcu yasi kactir: ");
        yas = abc.nextInt();
        if(yas<12){

            ucret /=2;



        }
        else if(yas>12 && 24>yas){
            ucret *=(0.9);
        }
        else if(yas>65){
           
            ucret *=(0.7);
        }

        System.out.print("yolculuk tipi nedir tek yon= 1 \n gidis-donus 2 ");
        tip = abc.nextInt();
        if(tip==2){
            ucret *=(0.8);
            ucret *=2;

        }
            
        

        System.out.print("ucak bileti fiyati: "+ucret);

        


    



         
    }
}