package question3;

public class Stuff {
    private static final int n = 2;
    private String string;
    private int num;

    public Stuff(String s, int num) {
        this.num = num;
        string = s;
    }

    public void doSomething(double d) {
        d = d - num;
        System.out.println(this);
    }

    public double changeSomething(String s) {
        s = string;
        return num * n;
    }

    @Override
    public String toString() {
        return string + "has" + num;
    }
}
