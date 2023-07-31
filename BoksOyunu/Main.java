import java.util.random.RandomGenerator;
public class Main {
    public static void main(String[] args) {
        Fighter kutbettin = new Fighter("kutbettin" , 15 , 100, 90, 0);
        Fighter carl = new Fighter("carl" , 10 , 95, 100, 0);
        Ring r = new Ring(kutbettin,carl , 90 , 100);
        r.run();
    }
}