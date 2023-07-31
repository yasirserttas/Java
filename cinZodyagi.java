import java.util.Scanner;


public class cinZodyagi {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        int yil,zdk;
        System.out.print("dogum yilinizi giriniz:");
        yil = abc.nextInt();

        zdk= yil%12;
        if(zdk==0){
             System.out.print("zodiakin Maymun");
 
        }
        else if(zdk==1){
            System.out.print("zodiakin Horoz");

        }
        else if(zdk==2){
            System.out.print("zodiakin kopek");
            
        }
        else if(zdk==3){
            System.out.print("zodiakin domuz");

        }
        else if(zdk==4){
            System.out.print("zodiakin fare");
            
        }
        
        else if(zdk==5){
            System.out.print("zodiakin okuz");

        }
        else if(zdk==6){
            System.out.print("zodiakin  kaplan");
            
        }
        else if(zdk==7){
            System.out.print("zodiakin tavsan");

        }
        else if(zdk==8){
            System.out.print("zodiakin ejderha");
            
        }
        else if(zdk==9){
            System.out.print("zodiakin yilan");

        }
        else if(zdk==10){
            System.out.print("zodiakin at");
            
        }
        else if(zdk==11){
            System.out.print("zodiakin koyun");

        }
        



    }
}
