package pdf_questions;

public class Kitchen {
    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}

class Table {
    Table(int i) {
        System.out.println("Table constructor");
    }
}

class Utensils {
    Utensils(int i) {
        System.out.println("Utensils Constructor");
    }
}

class Spoon extends Utensils {

    Spoon(int i) {
        super(i);
        System.out.println("Spoon Constructor");
    }
}

class Fork extends Utensils {

    Fork(int i) {
        super(i);
        System.out.println("Fork Constructor");
    }
}

class Knife extends Utensils {

    Knife(int i) {
        super(i);
        System.out.println("Knife Constructor");
    }
}

class Plate {
    Plate(int i) {
        System.out.println("Plate Constructor");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate Constructor");
    }
}

class PlaceSetting extends Table {
    private Spoon sp;
    private Fork frk;
    private Knife kf;
    private DinnerPlate dp;

    PlaceSetting(int i) {
        super(i + 1); // this will prints Table Cons
        sp = new Spoon(i + 2); // Utensils then Spoon Cons
        frk = new Fork(i + 3); // Utensils then Fork cons
        kf = new Knife(i + 4); // Utensils then Knife cons
        dp = new DinnerPlate(i + 5); // Plate then DinnerPlate

        System.out.println("PlaceSetting Constructor"); // this will prints in last
    }
}