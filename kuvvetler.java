import java.util.Scanner;

public class kuvvetler {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b=1,c=1;
        int x=0,y=0;
        System.out.print("sayiyi girin:");
        a= scan.nextInt();

        while(a>b){
            b*=4;
            x++;

        }

        while(a>c){
            c*=5;
            y++;
        }
        System.out.print(a+"'den kucuk ");
        System.out.print("\n");

        System.out.print("4'un "+(x-1));
        System.out.print(".kuvveti:"+(b/4));
        System.out.print("\n");

        System.out.print("5'in "+(y-1));
        System.out.print(".kuvveti:"+(c/5));



    }
}