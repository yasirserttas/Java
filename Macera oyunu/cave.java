public class cave extends battleLocation {
    @Override
    public void getAward(){
        System.out.print("Yemek");
       

        
        
    }
    

    public cave(player player){
        super(player, "Mağara", new zombie(),3,player.getInventory().getFood().isAward(),1);
        

        
    }
    


    
    
}
