package Practice;

public class Main {
    public static void main(String[] args) {

        // --------------------THIS IS FOR POINT CLASS----------------------------

        Point p1 = new Point();
        Point p2 = new Point(3, 4);
        Point p3 = new Point(p2);

        // this is for practice and it is working
        // p1 = p2 ;
        // System.out.println(p1);

        // p1.showXY(); this will print the value 0 , 0
        System.out.println(p2); // 3 , 4
        System.out.println(p3); // 3 , 4

        // now we will set the value of p1 by using setters
        p1.setXY(8, 10);
        System.out.println(p1); // now the value of x and y changes to 8 nd 10 for point p1

        System.out.println("-----------------------------------------------");

        // -----------------------THIS IS FOR PEN CLASS-----------------------------

        Pen pen_1 = new Pen(); // NULL
        System.out.println(pen_1); // this will print default pen

        // PARA CONS
        Pen pen_2 = new Pen("Dollar", "Blue", "Ballpoint", (float) 1.2, new Point(5, 6));
        System.out.println(pen_2); // this will print the pen acc. to the above info

        pen_2.write();

        // COPY CONS
        Pen pen_3 = new Pen(pen_2);
        System.out.println(pen_3); // pen_3 will print same as pen_2
        pen_3.write();

        // SETTERS AND GETTERS
        pen_2.set_Pen_Info("Picasso", "Black", "gelpen", 0.8f, new Point(2,
                10));
        System.out.println(pen_2); // this will print acc. to the above info but the pen3 will remain the same as
                                   // last pen_2 .
        pen_2.write();

        System.out.println("-----------------------------------------------");

        // ------------------ THIS IS FOR LINE CLASS --------------------

        // NULL CONS
        Line line_1 = new Line();
        System.out.println(line_1);

        // PARA CONS
        Line line_2 = new Line(4.0f, new Point(2, 3), new Point(-8, -4), 1);
        System.out.println(line_2);

        // COPY CONS
        Line line_3 = new Line(line_2);
        System.out.println(line_3);

        line_2.set_Line_Info(10, new Point(10, 10), new Point(-13, -1), 2);
        System.out.println(line_2);

        System.out.println("----------------------------------------------------");

        // ------------------ THIS IS FOR CIRLCE CLASS --------------------

        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle(2.5, new Point(10, 5));
        System.out.println(c2);

        Circle c3 = new Circle(c2);
        System.out.println(c3);

        c2.setCircle(8, new Point(23, 4));
        System.out.println(c2);

        // c3 = c2 ;
        // System.out.println(c3);
    }
}