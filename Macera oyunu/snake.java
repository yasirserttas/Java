import java.util.Random;

public class snake extends obstacle {

    public snake()
    {
        super(4, "Yılan", randomDamage(), 12,0);
    }
    

    public static int randomDamage(){
        int damage= new Random().nextInt(6)+3;
        return damage;
    }

     
}
