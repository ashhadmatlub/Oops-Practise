package question6;

public class Garbage extends Truck {
    @Override
    public void load(String payload) {
        System.out.println("Our garbage truck eats " + payload);
    }
}
