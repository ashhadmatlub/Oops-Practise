package java_collections.memoryOccupation;

import java.util.*;

public class MemoryDemo {
    public static void main(String[] args) {
        measurSetMemory("HashSet", new HashSet<>());
        measurSetMemory("LinkedHashSet", new LinkedHashSet<>());
        measurSetMemory("TreeSet", new TreeSet<>());
    }

    static void measurSetMemory(String name, Set<String> set) {
        Runtime rt = Runtime.getRuntime();
        rt.gc(); // encouraging garbage collector by ourseleves

        long before = rt.totalMemory() - rt.freeMemory();

        for (int i = 0; i < 100000; i++) {
            set.add("Item " + i);
        }

        long after = rt.totalMemory() - rt.freeMemory();

        System.out.printf("%-15s memory used ≈ %,d bytes%n ", name, (after - before));

        // printf is used for formating not for simple text
    }
}
