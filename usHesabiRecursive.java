import java.util.Scanner;



public class usHesabiRecursive {
    

    public static int usHesabiRecursive(int b, int a){
        int c;
        if(b==0){
            return 1;
        }
        else{
            return a*usHesabiRecursive(b-1,a);
        }


        
    }
    public static void main(String[] args) {
        Scanner nice= new Scanner(System.in);
        int a,b,c;
        System.out.print("sayinin tabanini giriniz:");
        a= nice.nextInt();
        System.out.print("sayinin ussunu giriniz:");
        b= nice.nextInt();

        c=usHesabiRecursive(b,a);
        System.out.print("sonuc:"+c);
        


    }
    
}
