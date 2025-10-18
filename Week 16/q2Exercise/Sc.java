package q2Exercise;

public class Sc {
    private int a, b;
    static int totalCount = 0;

    public Sc() {
        totalCount++;
    }

    public static void show() {
        System.out.println("Total Calculators " + totalCount);
    }

    public Sc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Sc(Sc other) {
        this.a = other.a;
        this.b = other.b;
        totalCount++;
    }

    public int add() {
        return this.a + this.b;
    }

    public int sub() {
        return this.a - this.b;
    }

    public String toString() {
        return "Add is : " + add() + " Sub is : " + sub();
    }
}
