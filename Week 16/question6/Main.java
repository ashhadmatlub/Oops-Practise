package question6;

public class Main {
    public static void main(String[] args) {
        Truck[] truck = new Truck[2];
        truck[0] = new HGV();
        truck[1] = new Garbage();

        for (int i = 0; i < truck.length; i++) {
            truck[i].load("-----stuff----");
        }
    }
}
// same as the last question
// compile time check does the method exists in parent if yes then ok
// at runtime call the childs overidden load methods