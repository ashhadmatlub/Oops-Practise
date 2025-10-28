package java_collections;

import java.util.*;

public class Tree {
    public static void main(String[] args) {

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("l");
        treeSet.add("B");
        treeSet.add("A");
        treeSet.add("b");
        // treeSet do not takes null elements
        // it always gives in ascending order
        // or custom order

        System.out.println("TreesSet : " + treeSet);
        System.out.println("Custom order " + treeSet.subSet("b", "l"));

        Iterator<String> it = treeSet.descendingIterator();
        // change the order from least to first

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(treeSet.size());

        // ------------------ TreeMap ------------------
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Ali");

    }
}
