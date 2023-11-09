public class ToolsStore extends normalLoc {

    public ToolsStore(player player ){

        super(player, "Mağaza");


    }

    @Override
    public boolean onLocation(){
          
        
            System.out.println("------- Mağazaya Hoşgeldiniz ! -------");
        System.out.println("1 - Silahlar");
        System.out.println("2 - Zırhlar");
        System.out.println("3 - Çıkış Yap");
        System.out.println("Seçiminiz: ");
         int selectChase = input.nextInt();
         while(selectChase>3 || selectChase<1){
            System.out.println("Yanlış seçim yaptınız tekrar deneyin!!");
            selectChase = input.nextInt();
            
         }

        switch (selectChase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
            printArmor();
            buyArmor();
                break;
            case 3:
            System.out.println("Bir daha bekleriz !");
            return true;
            

            default:
                break;
        }
        return true;
        


        
       
        

    }

    public void printWeapon(){
        System.out.println("--------- Silahlar --------");
        System.out.println();
        System.out.println("----------------------------------------------------");
        for (weapon w: weapon.weapons()){
            System.out.println("Id: "+w.getId()+" İsmi: "+w.getName()+
            " Hasarı: "+w.getDamage()+" Fiyat: "+w.getPrice());
            
        }
        
        System.out.println("0-Çıkış Yap");
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
       
    }

    public void buyWeapon(){
         System.out.println("Bir silah seçiniz: ");
        int selectWeaponId = input.nextInt();
        System.out.println("----------------------------------------------------");

        while(selectWeaponId<0 || selectWeaponId>weapon.weapons().length){
            System.out.println("----------------------------------------------------");

            System.out.println("Yanlis secim lutfen tekrar deneyiniz!!");
            selectWeaponId = input.nextInt();
            System.out.println("----------------------------------------------------");
        }
        if(selectWeaponId!=0){

            weapon selectWeapon = weapon.getWeaponsObjID(selectWeaponId);

        if(selectWeapon.getPrice()> this.getPlayer().getMoney()){
            System.out.println("----------------------------------------------------");
            System.out.println("Yeterli paranız yoktur");
            System.out.println("----------------------------------------------------");   

        }
        else{
            System.out.println("----------------------------------------------------");
            System.out.println(selectWeapon.getName()+" Silahını satın aldınız");
            int balance= this.getPlayer().getMoney()-selectWeapon.getPrice();
           this.getPlayer().setMoney(balance);
           System.out.println("Kalan Paranız: "+this.getPlayer().getMoney());
           System.out.println("Eski silahınız: "+this.getPlayer().getInventory().getWeapon().getName());
           this.getPlayer().getInventory().setWeapon(selectWeapon); 
           System.out.println("Yeni silahınız: "+this.getPlayer().getInventory().getWeapon().getName());
           System.out.println("----------------------------------------------------");
           


        }

        }
        

    }

    public void printArmor(){
        System.out.println("--------- Zırhlar --------");
        for(armor a: armor.armors()){
            System.out.println("Id: "+a.getId()+" İsmi: "+a.getName()+" Zırh: "+
            a.getBlock()+" Fiyat : "+a.getPrice());
        }


    }

    public void buyArmor(){

        System.out.println("Bir Zırh seçiniz: ");
        int selectArmorId = input.nextInt();

        while(selectArmorId<1 || selectArmorId>armor.armors().length){

            System.out.println("Yanlis secim lutfen tekrar deneyiniz!!");
            selectArmorId = input.nextInt();
        }

        if(selectArmorId!=0){

            armor selectedArmor = armor.getArmorObjId(selectArmorId);
        if(selectedArmor!= null){

            if(selectedArmor.getPrice()>this.getPlayer().getMoney()){
                System.out.println("----------------------------------------------------");
                System.out.println("Yeterli paranız bulunmamaktadır!");
                System.out.println("----------------------------------------------------");

            }
            else{
                System.out.println("----------------------------------------------------");
                System.out.println(selectedArmor.getName()+ " zırhını satın aldınız !");
                int balance= this.getPlayer().getMoney()-selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println("Kalan bakiye: "+this.getPlayer().getMoney());
                this.getPlayer().getInventory().setArmor(selectedArmor);
                System.out.println("yeni zırhınız: "+this.getPlayer().getInventory().getArmor().getName());
                System.out.println("----------------------------------------------------");
            }
         

        }

        }

        

        



    }

     

    


    
    
}
