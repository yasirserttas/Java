import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String username, parola;
        int cevap;

        System.out.print("kullanici adi:");
        username = inp.nextLine();
        
        System.out.print("parola:");
        parola = inp.nextLine();

        if(parola.equalsIgnoreCase("java123")){
         System.out.print("hosgeldiniz bilgiler dogru.");
        }
        else{
             System.out.println("sifreniz yalnis degistirmek istermisiniz ?(degistirmek icin 1 e basin)");
              cevap = inp.nextInt();

             switch (cevap) {
                case 1:
                System.out.print("yeni sifreniz: ");
                parola = inp.nextLine();
                System.out.print("\n");
                System.out.print("sifreniz basariyla değiştirildi");


 
                    break;
             
                default:
                    break;
             }

                
        }







    }
}
