public class armor {
    private int id;
    private String name;
    private int block;
    private int price;

    public armor(int id, String name, int block, int price) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.price = price;
    }
    public static armor[] armors(){
        armor[] armorList = new armor[3];
        armorList[0]= new armor(1, "hafif", 1, 15);
        armorList[1]= new armor(2, "orta ", 3, 25);
        armorList[2]= new armor(3, "Ağır ", 5, 40);

        return armorList;

    }

     public static armor getArmorObjId(int id){

        for(armor a: armor.armors()){
            if(a.getId()== id){
                return a;

            }
        }
        return null;


    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlock() {
        return block;
    }
    public void setBlock(int block) {
        this.block = block;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}


