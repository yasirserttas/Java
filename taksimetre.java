import java.util.Scanner;



public class taksimetre {
    public static void main(String[] args) {
        int acilis=10,km;
        double kmu=2.2,tp;
        Scanner in = new Scanner(System.in);
        System.out.println("yol kac km? ");
        km = in.nextInt();

        if(km <4) {

            System.out.println("taksi ucreti:20 TL");

        }
        else if(km>4) {
            tp = acilis+(km*kmu);
            System.out.println("taksi ucreti:"+tp);



        }
        else{
            System.out.println("km girdisi 0 dan kucuk olamaz");
        }

        
        

    
    }
}
