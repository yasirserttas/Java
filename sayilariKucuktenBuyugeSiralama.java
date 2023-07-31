import java.util.Scanner;

public class sayilariKucuktenBuyugeSiralama {

    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        int x,y,z;

        System.out.print("1.sayiyi gir: ");
        x= abc.nextInt();
        System.out.print("2.sayiyi gir: ");
        y= abc.nextInt();
        System.out.print("3.sayiyi gir: ");
        z= abc.nextInt();

        if(x>y && x>z){
            if(y>z){
                System.out.print("z<y<x");
            }
            else{
                System.out.print("y<z<x");

            }

        }
        else if(y>x && y>z){
            if(x>z){
                System.out.print("z<x<y");
            }
            else{
                System.out.print("y<z<x");

            }


        }

        else if(z>x && z>y){
            if(x>y){
                System.out.print("y<x<z");
            }
            else{
                System.out.print("x<y<z");

            }


        }

        




    }
}
