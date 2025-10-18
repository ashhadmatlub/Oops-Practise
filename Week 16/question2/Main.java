package question2;

public class Main {
    public static void main(String[] args) {

        Parent a1 = new Parent();
        Child a2 = new Child();

        Parent a3 = a2;
        // this above line is a polymorphic line

        // in this line we are copying the reference from child to Parent type which
        // means in Memory, Child object is in heap, which is pointed by 2 references in
        // stack a2
        // and a3, so now the problem accors that can we access the child variables and
        // methods from a3 ? so the answer is no, because the compiler is reading it
        // like
        // a reference type thats why it doesnt show an error at compile time but in the
        // run time the
        // parent type reference cant access the child type due to the compile time
        // checking but still this a3 can
        // access the Parent type through child type like a3 have the full access to
        // Parent members

        // NOTE : if the method is overriden in the child class from its parrent then
        // it can be acces through the polymorphic line ( Parent Object -> CHild ref)
        // compiler checks the mehtod exists in Parent, yes then JVM call the child
        // method because it's pointing to child obj

        a2.r(0);
        a3.q(10);
        a3.show(); // this will successfully run the child show because it is
        // ok to compiler and JVM will execute the overridden method

        // NOTE : During compile time, the compiler checks method existence in
        // Parent.
        // During runtime, the JVM executes the version based on the actual object type
        // (Child).

    }
}
