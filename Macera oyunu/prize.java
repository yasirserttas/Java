public class prize {

    private int id;
    private String name;
    private boolean award;
    public prize(int id, String name,boolean award) {
        this.id = id;
        this.name = name;
        this.award = award;
    }
    public int getId() {
        return id;
    }
    public boolean isAward() {
        return award;
    }
    public void setAward(boolean award) {
        this.award = award;
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
    

    
}
