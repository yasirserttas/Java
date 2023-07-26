import java.util.Scanner;

public class hipotenus {
    public static void main(String[] args) {
        int kenar,kenar1;
        double hipo;
        Scanner inp = new Scanner(System.in);
        System.out.print("birinci kenari gir: ");
        kenar = inp.nextInt();
        System.out.print("\n");
        System.out.print("birinci kenari gir: ");
        kenar1 = inp.nextInt();

        hipo = Math.sqrt((kenar*kenar)+(kenar1*kenar1));
        System.out.print("\n");
        System.out.print("hipotenusu :"+hipo);

        



        

    }
    
}
