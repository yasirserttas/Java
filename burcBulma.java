import java.util.Scanner;
public class burcBulma {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int ay,gun;

    System.out.print("dogdugun ay yilin kacinci ayi:");
    ay = input.nextInt();

    System.out.print("dogdugun gun ayin kacinci gunu:");
    gun = input.nextInt();

    if(ay==1){
        if(gun>=1 &&  21>=gun){
            System.out.print("burcunuz oglak burcudur.");
        }
        else if(gun>=22 &&  31>=gun){
            System.out.print("burcunuz kova burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
    }
    else if(ay==2){
        if(gun>=1 &&  19>=gun){
            System.out.print("burcunuz kova burcudur.");
        }
        else if(gun>=20 &&  28>=gun){
            System.out.print("burcunuz balik burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }

    }
    else if(ay==3){

        if(gun>=1 &&  20>=gun){
            System.out.print("burcunuz balik burcudur.");
        }
        else if(gun>=21 &&  31>=gun){
            System.out.print("burcunuz koc burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==4){
        if(gun>=1 &&  20>=gun){
            System.out.print("burcunuz koc burcudur.");
        }
        else if(gun>=21 &&  30>=gun){
            System.out.print("burcunuz boga burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==5){
        if(gun>=1 &&  21>=gun){
            System.out.print("burcunuz boga burcudur.");
        }
        else if(gun>=22 &&  31>=gun){
            System.out.print("burcunuz ikizler burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==6){
        if(gun>=1 &&  22>=gun){
            System.out.print("burcunuz ikizler burcudur.");
        }
        else if(gun>=23 &&  30>=gun){
            System.out.print("burcunuz yengec burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==7){
        if(gun>=1 &&  22>=gun){
            System.out.print("burcunuz yengec burcudur.");
        }
        else if(gun>=23 &&  31>=gun){
            System.out.print("burcunuz aslan burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==8){
        if(gun>=1 &&  22>=gun){
            System.out.print("burcunuz aslan burcudur.");
        }
        else if(gun>=23 &&  31>=gun){
            System.out.print("burcunuz basak burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==9){
        if(gun>=1 &&  22>=gun){
            System.out.print("burcunuz basak burcudur.");
        }
        else if(gun>=23 &&  31>=gun){
            System.out.print("burcunuz terazi burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==10){
        if(gun>=1 &&  22>=gun){
            System.out.print("burcunuz terazi burcudur.");
        }
        else if(gun>=23 &&  31>=gun){
            System.out.print("burcunuz akrep burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==11){
        if(gun>=1 &&  21>=gun){
            System.out.print("burcunuz akrep burcudur.");
        }
        else if(gun>=22 &&  31>=gun){
            System.out.print("burcunuz yay burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else if(ay==12){
         if(gun>=1 &&  21>=gun){
            System.out.print("burcunuz yay burcudur.");
        }
        else if(gun>=22 &&  31>=gun){
            System.out.print("burcunuz oğlak burcudur.");
        }
        else{
            System.out.print("gecersiz bir gun girdiniz");
        }
        
    }
    else{
        System.out.print("gecersiz bir ay girdiniz.");
    }




    
}
}

