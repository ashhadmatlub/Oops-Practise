package Practice;

public class main {
    public static void main(String[] args) {
        try {
            // Default
            Square s1 = new Square();
            System.out.println(s1);
            System.out.println("------------");

            Square s2 = new Square(2.0);
            System.out.println(s2);
            System.out.println("-----------");

            Square s3 = new Square(s2);
            System.out.println(s3);

            s3.setAllSides(4.0);
            System.out.println(s3);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
