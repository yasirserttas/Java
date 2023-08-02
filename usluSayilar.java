import java.util.Scanner;


public class usluSayilar {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int a,b;
        int c=1;

        System.out.print("ussu alinacak sayiyi girin:");
        a= scanner.nextInt();
        System.out.print("sayinin ussunu  girin:");
        b= scanner.nextInt();

        for(int d=1;d<=b;d++){
            

            c*=a;

        }

        System.out.print(a+" ussu "+b+" sonuc="+c);



    }
}
