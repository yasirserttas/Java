public class forest extends battleLocation {

    @Override
    public void getAward(){
        System.out.print("Odun");
        
    }

    public forest(player player){
        super(player, "Orman", new vampire(), 3,player.getInventory().getFirewood().isAward(),2);
        

    }

    
    
}
