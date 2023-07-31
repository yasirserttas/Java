import java.util.Scanner;

public class havaDurumunaGoreEtkinlik {
    public static void main(String[] args) {
        Scanner yasir = new Scanner(System.in);
        int derece ;

        System.out.print("hava kac derece: ");
        derece =yasir.nextInt();

        if(5>=derece){
            System.out.print("kayak yapabilirsin.");
            if(derece==5){
                System.out.print("sinemaya gitmeyide dusunebilirsin ");

            }
            
        }
        else if(5<=derece && 15>=derece){
                
                System.out.print("sinemaya gidebilirsin");
                if(5==derece){
                    System.out.print("kayak yapmayida dusunebilirsiniz ");
                }
                else if(15==derece){
                    System.out.print("piknik yapmayide dusunebilirsiniz");
                }
            }
            else if(15<=derece && 25>=derece){

                System.out.print("piknige gidebilirsin");
                if(15==derece){
                    System.out.print("sinemaya gitmeyi dusunebilirsiniz ");
                }
                else if(25==derece){
                    System.out.print("yuzmeye gitmeyi dusunebilirsiniz");
                }


            }
            else if(derece>25){
                System.out.print("kesinlikle yuzmeye gitmelisin");

            }

        






    }
    
}
