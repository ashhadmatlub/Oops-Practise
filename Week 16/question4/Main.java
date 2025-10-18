public class Main {
    public static void main(String[] args) {

        RationalNumber r1 = new RationalNumber(10, 5);
        RationalNumber r2 = new RationalNumber(10, 5);

        Object o1 = r1;
        Object o2 = r2;

        System.out.println(r1.equals(r2)); // true check the actual value
        System.out.println(o1.equals(o2)); // false, just check the references points to same
        // object in memory or not
        System.out.println(r1.equals(o2)); // false becuase of similiar reason
        System.out.println(o1.equals(r2)); // false similiar reason
        System.out.println(r1.equals(o1)); // true because both point to the same object in heap
    }
}
