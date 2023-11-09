import java.util.Random;
import java.util.Scanner;

public abstract class battleLocation extends Location {
     private obstacle obstacle;
     
     private int id;
     private int maxObstacle;
     public Scanner input= new Scanner(System.in);
     private boolean prize;

    public battleLocation(player player, String name,obstacle obstacle,int maxObstacle,boolean prize,int id){
        
        super(player, name);
        this.obstacle=obstacle;
        this.prize = prize;
       this.maxObstacle=maxObstacle;
       this.id=id;
    }

    


    public int getId() {
        return id;
    }




    public void setId(int id) {
        this.id = id;
    }




    public boolean isPrize() {
       
        return prize;
    }




    public void setPrize(boolean prize) {
        this.prize = prize;
    }




    @Override
    public boolean onLocation() {
        int obsNumber = this.randomObstacle();
        
            if(getName().equals("Maden")){
             System.out.println("Şuan buradasınız: "+this.getName());
        System.out.println("Dikkatli ol burada "+obsNumber+" tane "+this.getObstacle().getName()+" yaşıyor!");
        System.out.println("Savaşmak istiyorsan -S "+"Topuklamak istiyorsan- K "+"tuşuna basınız:");
        String selectCase = input.nextLine().toUpperCase();
        if(selectCase.equals("S") && combat(obsNumber))
        {
                System.out.println(this.getName()+" Düşmanlar temizlendi.");

                
                System.out.println();
                
                return true;
        }

        if(this.getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz");
            return false;
        }
        
        return true;

        }
        


        
        if(!isPrize()){
            System.out.println("Şuan buradasınız: "+this.getName());
        System.out.println("Dikkatli ol burada "+obsNumber+" tane "+this.getObstacle().getName()+" yaşıyor!");
        System.out.println("Savaşmak istiyorsan -S "+"Topuklamak istiyorsan- K "+"tuşuna basınız:");
        String selectCase = input.nextLine().toUpperCase();
        if(selectCase.equals("S") && combat(obsNumber))
        {
                System.out.println(this.getName()+" Düşmanlar temizlendi.");
                getAward(); System.out.print(" kazandınız!!");
                
                switch (getId()) {
                    case 1:
                    getPlayer().getInventory().getFood().setAward(true);
                        break;
                    case 2:
                    getPlayer().getInventory().getFirewood().setAward(true);
                        break;
                    case 3:
                    getPlayer().getInventory().getWater().setAward(true);    
                        break;
                
                    default:
                        break;
                }
                
                
                System.out.println();
                
                return true;
        }

        if(this.getPlayer().getHealth() <= 0){
            System.out.println("Öldünüz");
            return false;
        }
        
        return true;


        }
        else{
            System.out.println("Buraya daha önceden girdiniz!");
            return true;
        }
        

        
        

        

    }
    

    public boolean combat(int obsNumber){
        
        
        for (int i=1;i<=obsNumber;i++){
            this.getObstacle().setHealth(this.getObstacle().getOrginalHealth());
            playerStats();
            obstacleStats(i);
            int chance = new Random().nextInt(2);

            while(this.getPlayer().getHealth()>0 && this.getObstacle().getHealth()>0){
                
                
                if(chance==0){
                System.out.println("V-tuşu ile vur K-tuşu ile kaçabilirsin");
                String selectCombat= input.nextLine().toUpperCase();
                
                if(selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz!");
                    this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getDamage());
                    afterHit();
                    if(this.getObstacle().getHealth()>0){
                        System.out.println(i+" Canavar size vurdu!");
                        afterHit();

                        int obstacleDamage = this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage<0){

                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                        
                    }
                    
                }
                else{ 
                    return false;
                }


                    
                }
                else{
                    if(this.getObstacle().getHealth()>0){
                        System.out.println(i+".Canavar size vurdu!");

                        int obstacleDamage = this.getObstacle().getDamage()-this.getPlayer().getInventory().getArmor().getBlock();
                        if(obstacleDamage<0){

                            obstacleDamage = 0;
                        }
                        this.getPlayer().setHealth(this.getPlayer().getHealth()-obstacleDamage);
                        afterHit();
                    }
                System.out.println("V-tuşu ile vur K-tuşu ile kaçabilirsin");
                 String selectCombat= input.nextLine().toUpperCase();
                
                if(selectCombat.equals("V")){
                    System.out.println("Siz vurdunuz!");
                    this.getObstacle().setHealth(this.getObstacle().getHealth()-this.getPlayer().getDamage());
                    afterHit();
                    
                    
                }
                else{ 
                    return false;
                }
                } 
                
                
            }
            if(this.getObstacle().getId()==4){
                if(this.getPlayer().getHealth()>this.getObstacle().getHealth()){
                    System.out.println("Düşmanı yendiniz!");
                    getSnakeAward();
                    playerStats();
                }
                else{
                    return false;
                }
            }

                if(this.getPlayer().getHealth()>this.getObstacle().getHealth()){
                    System.out.println("Düşmanı yendiniz!");
                    getObstacleAward();
                    playerStats();  
                }
                else{
                    return false;
                }

             

        }

        return true;

    }

    public void afterHit()
    {
        System.out.println("----------------------------------------------------");
        System.out.println("Canınız: "+this.getPlayer().getHealth());
        System.out.println(this.getObstacle().getName()+" Canı: "+this.getObstacle().getHealth());
        System.out.println("----------------------------------------------------");
    }


    public void playerStats(){
        System.out.println("----------------------------------------------------");
        System.out.println("Oyuncu değerleri");
        System.out.println("----------------------------------------------------");
        System.out.println("Sağlık: "+this.getPlayer().getHealth());
        System.out.println("Silah: "+this.getPlayer().getInventory().getWeapon().getName());
        System.out.println("Hasar: "+this.getObstacle().getDamage());
        System.out.println("Zırh: "+this.getPlayer().getInventory().getArmor().getName());
        System.out.println("Bloklama: "+this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println("Para: "+this.getPlayer().getMoney());
        System.out.println("----------------------------------------------------");
        
    }

    public void obstacleStats(int i){
        System.out.println("----------------------------------------------------");
        System.out.println(i+". "+this.getObstacle().getName()+" Değerleri");
        System.out.println("----------------------------------------------------");
        System.out.println("Sağlık: "+this.getObstacle().getHealth());
        System.out.println("Hasar: "+this.getObstacle().getDamage());
        System.out.println("Ödül: "+this.getObstacle().getAward());
        System.out.println("----------------------------------------------------");

        


    }

    public int randomObstacle(){
        Random r= new Random();
        return r.nextInt(this.getMaxObstacle())+1;
    }

    public obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(obstacle obstacle) {
        this.obstacle = obstacle;
    }



    public int getMaxObstacle() {
        return maxObstacle;
    }



    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
    public void getObstacleAward(){
        this.getPlayer().setMoney(this.getPlayer().getMoney()+this.getObstacle().getAward());
                    System.out.println("Güncel paranız: "+this.getPlayer().getMoney());
                    System.out.println(this.getObstacle().getAward()+" para kazandınız!");

    }
    public void getSnakeAward(){
        int id=0;
        weapon selectWeapon = weapon.getWeaponsObjID(id);
        armor selectArmor = armor.getArmorObjId(id);
         int randomAward1 = new Random().nextInt(20)+1;
                    if(randomAward1>=1 && randomAward1 <=3){
                        int randomAward2 = new Random().nextInt(10)+1; 
                        if(randomAward2>=1 && randomAward2 <=5){
                            id=1;
                             this.getPlayer().getInventory().setWeapon(selectWeapon);
                             System.out.println("Yeni bir tabanca kazandınız!");
                        }
                        else if(randomAward2>=6 && randomAward2<=8){
                            id=2;
                            this.getPlayer().getInventory().setWeapon(selectWeapon);
                            System.out.println("Yeni bir kılıç kazandınız!");
                        }
                        else{
                            id=3;
                            this.getPlayer().getInventory().setWeapon(selectWeapon);
                             System.out.println("Yeni bir tÜfek kazandınız!");
                            
                        }

                    }
                    else if(randomAward1>=4 && randomAward1<=6){
                        int randomAward2 = new Random().nextInt(10)+1; 
                        if(randomAward2>=1 && randomAward2 <=5){
                            id=1;
                            this.getPlayer().getInventory().setArmor(selectArmor);
                            System.out.println("Hafif zırh kazandınız!");
                        }
                        else if(randomAward2>=6 && randomAward2<=8){
                            id=2;
                            this.getPlayer().getInventory().setArmor(selectArmor); 
                            System.out.println("Orta zırh kazandınız!");
                        }
                        else{
                            id=3;
                            this.getPlayer().getInventory().setArmor(selectArmor);
                            System.out.println("Orta zırh kazandınız!");
                            
                        }
                        

                    }
                    else if(randomAward1>=7 && randomAward1<=11){
                        int randomAward2 = new Random().nextInt(10)+1; 
                        if(randomAward2>=1 && randomAward2 <=5){
                            this.getPlayer().setMoney(this.getPlayer().getMoney()+1);
                            System.out.println("1 Para kazandın!");
                        }
                        else if(randomAward2>=6 && randomAward2<=8){
                            this.getPlayer().setMoney(this.getPlayer().getMoney()+5);
                            System.out.println("5 Para kazandın!");
                        }
                        else{
                            this.getPlayer().setMoney(this.getPlayer().getMoney()+10);
                            System.out.println("10 Para kazandın!");
                            
                        }

                    }
                    else{
                        System.out.println("Hiçbişey Kazanamadınız!");

                    }
    }

    
    public abstract void getAward();
    
}
