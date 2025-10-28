package java_collections.pdf_Qs;

import java.util.*;

public class sorting {

    public static void main(String[] args) {

        // Let’s explore the sorting nature of HS, LHS, TS and HM? Output ?

        Set<String> hashSet = new HashSet<>(); // All these lines are polymorphic
        Set<String> linkedHashSet = new LinkedHashSet<>(); // we use this to have more control
        Set<String> treeSet = new TreeSet<>(); // as we have the power to switch to different child
        Map<String, Integer> treeMap = new TreeMap<>(); // later on

        List<String> list = Arrays.asList("Zara", "Ali", "Bilal", "Nabeel");

        for (String value : list) {
            hashSet.add(value);
            linkedHashSet.add(value);
            treeSet.add(value);
            treeMap.put(value, value.length());
        }

        System.out.println("HashSet : " + hashSet);
        System.out.println("LinkedHashSet : " + linkedHashSet);
        System.out.println("TreeSet : " + treeSet);
        System.out.println("TreeMap" + treeMap);
    }

}
