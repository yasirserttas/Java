public class normalLoc extends Location {

    public normalLoc(player player,String name){
        super(player, name);
    }
    @Override

    public boolean onLocation(){
        return true;
    }

    
}
