package java_collections;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {

        // HASHSETS IN JAVA COLLECTION FRAMEWORK ( JCF )
        // HashSet<Integer> set = new HashSet<>();
        // Complexity: O(1) average for put, get, remove

        // Insert
        // set.add(1);
        // set.add(2);
        // set.add(null); // this null will be at the beginning all the time
        // it takes only one null in the first rest will be ignored
        // set.add(3);
        // set.add(1); // it would'nt be added because it's the duplicate element and
        // HashSet or duplicate elements are ignored
        // // do not contains duplicate

        // Iterator
        // Iterator iterator = set.iterator();
        // Iterator func ( hasNext , Next) // doesn't guarntee the order
        // while (iterator.hasNext()) {
        // System.out.println("Iterator set " + iterator.next());
        // }

        // // search
        // if (set.contains(1)) {
        // System.out.println("Contains 1 ");
        // }
        // if (!set.contains(5)) {
        // System.out.println("Doesnt contains 5 ");
        // }

        // // delete
        // set.remove(1);

        // if (!set.contains(1)) {
        // System.out.println("Removed 1 ");
        // }

        // // size
        // System.out.println("Size " + set.size());

        // // printing all elements
        // System.out.println("set" + set);

        // --------------------------- HASHMAP--------------
        // Country , population ---> Country is key while population is value
        // we use HASHMAP for key <-> value pairs , key must be unique , while value can
        // be same

        HashMap<String, Integer> hashMap = new HashMap<>();

        // INSERTIONS
        hashMap.put("Pakistan", 25);
        hashMap.put("Usa", 80);
        hashMap.put("China", 125);

        System.out.println(hashMap);

        hashMap.put("Pakistan", 100);

        // the key Pakistan already exists so it will change the value of Pakistan and
        // puts in the new updated value which is 100
        // conclude if any key exists already then the value of that key would be
        // updated

        System.out.println(hashMap);

        // SEARCH
        if (hashMap.containsKey("China")) {
            System.out.println("Exists ");
        } else {
            System.out.println("Doesn't Exist");
        }

        // check the value of that key
        System.out.println(hashMap.get("Pakistan")); // returns Pakistan
        System.out.println(hashMap.get("Srilanka")); // returns NULL

        // Iterator
        // for ( int val : arr) similiar to below line
        for (Map.Entry<String, Integer> e : hashMap.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // REMOVE
        hashMap.remove("Pakistan"); // just write the key of the pair you wanna remove
        System.out.println(hashMap);
    }
}