public class river extends battleLocation {
    @Override
    public void getAward(){
        System.out.print("Su");
        
        

    }
    

    public river(player player){
        super(player, "Nehir",new bear(),2,player.getInventory().getWater().isAward(),3);


    }

    
    
}
