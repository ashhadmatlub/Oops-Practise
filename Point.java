package Practice;

// Here we are making the point class using three constructors and getters and
// setters and using to string mehtod also

public class Point {

    // First we will declare the value of our points
    private int x;
    private int y;

    // Now we will make Three constructors null , para, copy
    // NULL
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // PARA...
    public Point(int x, int y) {
        this.x = x; // ye phela wala x uper diye gaye object ka ha aur second wala PARAMETER (
                    // ARGUMENT ka )
        this.y = y;
    }

    // COPY
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    // SETTERS AND GETTERS
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // public void showXY() {
    //     System.out.println("The value of x and y are respectively : " + x + " , " + y);
    // }

    // TOSTRING

    @Override
    public String toString() { // ye use krne se object directly print hoga like this SOUT(object name)
        return "(" + x + " , " + y + " ) ";
    }
}