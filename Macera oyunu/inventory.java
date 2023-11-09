public class inventory {

    private weapon weapon;
    private armor armor;
    private prize food;
    private prize firewood;
    private prize water;
    
   
   
    public inventory(){
        this.weapon= new weapon("Yumruk", -1, 0, 0);
        this.armor = new armor(-1, "Paçavra", 0, 0);
        this.food = new prize(1, "Yemek",false);
        this.firewood = new prize(2, "Odun",false);
        this.water = new prize(3, "Su",false);
    }
    
    

    public prize getFood() {
        return food;
    }



    public void setFood(prize food) {
        this.food = food;
    }



    public prize getFirewood() {
        return firewood;
    }



    public void setFirewood(prize firewood) {
        this.firewood = firewood;
    }



    public prize getWater() {
        return water;
    }



    public void setWater(prize water) {
        this.water = water;
    }



    public weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(weapon weapon) {
        this.weapon = weapon;
    }

    public armor getArmor() {
        return armor;
    }

    public void setArmor(armor armor) {
        this.armor = armor;
    }
    
    
}
