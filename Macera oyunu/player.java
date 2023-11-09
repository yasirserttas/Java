import java.util.Scanner;

public class player {

    private int damage ;
    private int health;
    private int orjinalHealth;
    private int money;
    private String name;
    private String charname;
    private inventory inventory;
    private Scanner input = new Scanner(System.in);



    public player( String name){
        this.name = name;
        this.inventory= new inventory();
    }

   

     public inventory getInventory() {
        return inventory;
    }



    public void setInventory(inventory inventory) {
        this.inventory = inventory;
    }



    public int getOrjinalHealth() {
        return orjinalHealth;
    }



    public void setOrjinalHealth(int orjinalHealth) {
        this.orjinalHealth = orjinalHealth;
    }



    public void selectChar(){
        gameChar[] charList = {new samurai(),new archer(),new knight()};

        
        System.out.println("///////////////////////////////////////////////////////////");

        for(gameChar gameChar: charList){
            System.out.println("ID: "+gameChar.getId()+"\tKarakter: "+gameChar.getName()+"\t Hasar: "+gameChar.getDamage()+"\t Sağlık: "+gameChar.getHealth()+"\t para: "+gameChar.getMoney());
        }
         System.out.println("///////////////////////////////////////////////////////////");
         System.out.println("Lütfen bir karakter seçiniz");

         int selectChar = input.nextInt();

         switch (selectChar) {
            case 1:
            initPlayer(new samurai());
            break;
            case 2:
            initPlayer(new archer());
            break;
            case 3: 
            initPlayer(new knight());
                
                break;
         
            default:
            initPlayer(new samurai());
            
                break;
         }
         


    }

    public void initPlayer(gameChar gameChar){
        this.setHealth(gameChar.getHealth());
        this.setOrjinalHealth(gameChar.getHealth());
        this.setDamage(gameChar.getDamage());
        this.setMoney(gameChar.getMoney());
        this.setCharname(gameChar.getName());
    }



    

     



    public int getDamage() {
        return damage+getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharname() {
        return charname;
    }

    public void setCharname(String charname) {
        this.charname = charname;
    }

   

    


    
}
