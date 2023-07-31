import java.util.Scanner;

public class sinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner nots= new Scanner(System.in);
        
        int mat,turkce,fizik,kimya,muzik;

        System.out.print("matematik notu:");
        mat = nots.nextInt();
        if(mat<0 && mat>100){
            mat =0;
        }

        System.out.print("turkce notu:");
        turkce = nots.nextInt();
        if(turkce<0 && turkce>100){
            turkce =0;
        }

        System.out.print("fizik notu:");
        fizik = nots.nextInt();
        if(fizik<0 && fizik>100){
            fizik =0;
        }

        System.out.print("kimya notu:");
        kimya = nots.nextInt();
        if(kimya<0 && kimya>100){
            kimya =0;
        }

        System.out.print("muzik notu:");
        muzik = nots.nextInt();
        if(muzik<0 && muzik>100){
            muzik =0;
        }

        double ortalama = (mat+fizik+turkce+kimya+muzik)/5;
        
        if(ortalama>=55 ){
            System.out.print("tebrikler gectiniz.");
        }
        else{
            System.out.println("kaldiniz seneye tekrar deneyin");
        }

        
        









    }
    
}
