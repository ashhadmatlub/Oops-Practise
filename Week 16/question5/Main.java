package question5;

public class Main {
    public static void main(String[] args) {
        RationalNumber2 r1 = new RationalNumber2(10, 5);
        RationalNumber2 r2 = new RationalNumber2(10, 5);

        Object o1 = r1;
        Object o4 = new Object(); // plane object
        Object o2 = r2;

        System.out.println(r1.equals(r2)); // true
        System.out.println(o1.equals(o2)); // true because o1 has the acces to the value at the
        // runtime because of overridden method and o1 have access due to type casting
        System.out.println(r1.equals(o2)); // true becasue o2 is typecasted
        System.out.println(o1.equals(r2)); // true because o1 have access by overriden method
        System.out.println(r1.equals(o1)); // easy same pointing and identical value
        // because same

        System.out.println("Object check " + r1.equals(o4)); // the other(o4) is not instanceOf
        // rational Number so the logic will return false because it will not e type
        // casted becuase
        // in the end when we type cast it the JVM will through an error at run time
        // ✅ If other → RationalNumber2 → go inside and compare fields.
        // ❌ If other → anything else → return false safely.
        // ❌ If other → null → return false safely.

        Object o3 = null;

        System.out.println(r1.equals(o3));
    }
}
