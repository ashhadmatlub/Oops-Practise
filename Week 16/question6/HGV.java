package question6;

public class HGV extends Garbage {
    @Override
    public void load(String payload) {
        System.out.println("We are transporting " + payload + " on our good heavy vehicle ");
    }
}
