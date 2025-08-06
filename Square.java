package Practice;

public class Square {
    // using triangle scenario for making the square

    private double allSides;

    private static int object;

    // NULL CONS
    public Square() {
        this.allSides = 1.0;
        object++;
    }

    // PARA CONS
    public Square(double allSides) {
        this.allSides = allSides;
        object++;
    }

    // COPY CONS
    public Square(Square other) {
        this.allSides = other.allSides;
        object++;
    }

    // Getters and Setters
    public void setAllSides(double allSides) {
        this.allSides = allSides;
        
    }

    public double getAllSides() {
        return allSides;
    }

    public static int objectCount() {
        return object;
    }

    public double perimeter() {
        return 4 * allSides;
    }

    @Override
    public String toString() {
        return "For Square : " + objectCount() +
                " \n All sides are equal to : " + allSides +
                "\n Perimeter of this triangle is " + perimeter();
    }
}
