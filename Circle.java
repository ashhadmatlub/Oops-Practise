package Practice;

public class Circle {
    private double radius;
    private Point centerPoint;

    // NULL CONS
    public Circle() {
        this.radius = 0.0;
        this.centerPoint = new Point(0, 0);
    }

    // PARA CONS
    public Circle(double radius, Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    // COPY CONS
    public Circle(Circle c3) {
        this.radius = c3.radius;
        this.centerPoint = new Point(c3.centerPoint);
        // ---------- IMPORTANT ------------
        // this is called the deep copy , it's will not change the value of the c3 if we
        // change the value of c2 for e.g
        // if Circle c3 = new Circle ( c2 ) then c2 is being copied in c3 also and if we
        // change c2 then c2 will not gonna be change because it is a DEEP COPY
        // this.centerPoint = c3.centerPoint this is the shallow copy which will change
        // the value of c3 if we change c2 .
    }
    // GETTERS AND SETTERS

    // basically setters and parameterized constructors look same but it is different cuz PARA CONS give birth to the object and if someone wants to make changes in it then we use setters 
    // e.g. PARA CONS gives BIRTH and SETTERS changes clothes 

    public void setCircle(double radius, Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }
    public Point getCenterPoint() {
        return centerPoint;
    }
    public double getRadius() {
        return radius;
    }
    // TOSTRING 

    @Override
    public String toString(){
        return " Center point of circle is : " + centerPoint + " and the radius is : " + radius ;
    }
}
