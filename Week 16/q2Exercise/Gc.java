package q2Exercise;

public class Gc extends Sinc {
    public Gc() {
    }

    public Gc(int v) {
        System.out.println("GC " + v);
    }

    @Override
    public String toString() {
        return "GC ";
    }
}
