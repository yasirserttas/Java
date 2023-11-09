import java.util.Scanner;

public abstract class Location {

    private player player;
    private String name;
    public static Scanner input= new Scanner(System.in);

    public Location(player player, String name) {
        this.player = player;
        this.name = name;
        
    }

    public abstract boolean onLocation();

    public player getPlayer() {
        return player;
    }

    public void setPlayer(player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}
