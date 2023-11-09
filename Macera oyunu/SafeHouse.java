public class SafeHouse extends normalLoc{

    public SafeHouse(player player){
        super(player, "Güvenli ev");


    }

    @Override

    public boolean onLocation(){

        System.out.println("Güvenli evdesiniz !");
        System.out.println("Canınız Yenilendi !");
        this.getPlayer().setHealth(getPlayer().getOrjinalHealth());
        return true;


        
       
    
    }

    
}
