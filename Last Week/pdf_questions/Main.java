package pdf_questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// Q1 ) Write the output of following program along with reasoning

// import java.util.ArrayList;

// class Point {
// int x;
// int y;

// Point(int x, int y) {
// this.x = x;
// this.y = y;
// }
// }

// public class Main {
// public static void main(String[] args) {
// ArrayList<Point> pArrayList = new ArrayList<>(); // must needs to define the
// type of list
// pArrayList.add(new Point(10, 20));
// pArrayList.add(new Point(5, 10));
// // Print the x-coordinate of the 2nd element (index 1)
// System.out.println("X-coordinate of 2nd element: " + pArrayList.get(1).x);
// }
// }

// Q2 ) Write the output of following program along with reasoning

// public class Main {
// public static void main(String[] args) {

// int[] xarray = { 4, 2, 1, 3, 5 };

// int y = xarray[1] + 1; // y = 3 output

// System.out.print(y + ", "); // 3 ,
// xarray[4] = 1;
// System.out.print(xarray[xarray[4]] + ","); // 2 output
// y--; // y = 2 ;
// System.out.print(xarray[y]); // 1 output

// }
// }

// Q3 ) Arrays.asList vs. String[ ] Output ? Which one to prefer and Why ?

// public class Main {
// public static void main(String[] args) {

// String[] arr = { "Zara", "Ali", "Bilal", "Nabeel" };
// List<String> names = Arrays.asList(arr);

// // Now you can do this:
// System.out.println(names.contains("Ali"));
// System.out.println(names.indexOf("Bilal"));
// // Collections.sort(arr); // this line will gives an error because
// // Collections.sort we cant works on an array
// Collections.sort(names);
// System.out.println(names);
// }
// }
