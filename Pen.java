package Practice;

public class Pen {
    private String brand;
    private String type;
    private float nibsize;
    private String color;
    private Point position;

    // NULL CONS
    public Pen() {
        this.brand = "Unknown";
        this.color = "Unknown";
        this.type = "Unknown";
        this.nibsize = (float) 0.0;
        this.position = new Point(0, 0);
    }

    // PARA... CONS..
    public Pen(String brand, String color, String type, float nibsize, Point position) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.nibsize = nibsize;
        this.position = position;
    }

    // COPY ... CONS..
    public Pen(Pen pen_3) {
        this.brand = pen_3.brand;
        this.color = pen_3.color;
        this.type = pen_3.type;
        this.nibsize = pen_3.nibsize;
        this.position = new Point(pen_3.position);
    }

    // GETTERS AND SETTERS FOR IF WE WANTS TO CHANGE THE VALUE MANUALLY

    public void set_Pen_Info(String brand, String color, String type, Float nibsize, Point position) {
        this.brand = brand;
        this.color = color;
        this.type = type;
        this.nibsize = nibsize;
        this.position = new Point(position);
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public float getNibsize() {
        return nibsize;
    }

    public Point getPosition() {
        return position;
    }

    public String getType() {
        return type;
    }

    public void write() {
        System.out.println(" The " + color + " " + brand + " " + type + " of " + nibsize + " mm is writing at position "
                + position + " on Board ");
    }

    // to print the object directly
    @Override
    public String toString() {
        return "Pen { brand = " + brand + " , type = " + type + " , color = " + color + " , nibsize = " + nibsize
                + " , Points = " + position + "}";
    }
}
