import java.util.Scanner;
 
public class nothesaplama {
    public static void main(String[] args) {
        int mat,fiz,kim,tur,tar,muz,tp;

        Scanner in = new Scanner(System.in);

        System.out.print("Matematik notu: ");
        mat = in.nextInt();

        System.out.print("Fizik notu: ");
        fiz = in.nextInt();

        System.out.print("Kimya notu: ");
        kim = in.nextInt();

        System.out.print("Turkce notu: ");
        tur = in.nextInt();

        System.out.print("Tarih notu: ");
        tar = in.nextInt();

        System.out.print("Muzik notu: ");
        muz = in.nextInt();

        tp =(mat+fiz+kim+tur+tar+muz)/6;

        System.out.println("not ortalamasi: "+tp);







    }

    
} 
    
    
    

