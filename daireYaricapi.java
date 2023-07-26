import java.util.Scanner;

public class daireYaricapi {
    public static void main(String[] args) {
        double pi=3.14,r,alpha,tp;
        Scanner in= new Scanner(System.in);

        System.out.print("dairenin yaricapini giriniz:");
        r= in.nextDouble();
        System.out.print("dairenin acisini giriniz (tam daire ise 360 yaziniz):");
        alpha= in.nextDouble();

        tp= pi*(r*r)*alpha/360;

        System.out.print("dairenin yaricapi:"+tp);





        


    }
}
