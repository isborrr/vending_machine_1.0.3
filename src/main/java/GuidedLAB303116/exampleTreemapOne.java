package GuidedLAB303116;

import java.util.TreeMap;

public class exampleTreemapOne {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        System.out.println("TreeMap: " + numbers);
        // remove method with single parameter
        int value = numbers.remove("Two");
        System.out.println("Removed value: " + value);
        numbers.remove("Three", 3);

        System.out.println("Updated TreeMap: " + numbers);


    }
}
