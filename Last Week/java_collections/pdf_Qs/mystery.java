package java_collections.pdf_Qs;

import java.util.*;

public class mystery {
    public static void main(String[] args) {
        // Null element Mystery? Output ?
        // HashSet Allows one null only
        Set<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add("ALi");
        hashSet.add(null);

        System.out.println("Hashset : " + hashSet);
        // LinkedHashset allows one null and remember that place of the null and
        // works in insertion order
        Set<String> linkHashSet = new LinkedHashSet<>();
        linkHashSet.add("ali");
        linkHashSet.add("Zaid");
        linkHashSet.add(null);
        linkHashSet.add("Zaid");

        System.out.println("Hashset : " + hashSet);
        Set<String> treeSet = new TreeSet<>();
        hashSet.add("ALi");

        try {
            treeSet.add(null);

        } catch (NullPointerException e) {
            System.out.println("deosnt allows null throws null pointer exception");
        }

        System.out.println("Hashset : " + hashSet);
    }
}
