package GuidedLAB303116;

import java.util.TreeMap;

public class exampleTreemapTwo {
    public static void main(String[] args) {
        TreeMap<String, Integer> numbers = new TreeMap<>();
        numbers.put("First", 1);
        numbers.put("Second", 2);
        numbers.put("Third", 3);
        System.out.println("TreeMap: " + numbers);

        // Using the firstKey() method
        System.out.println("TreeMap firstKey() method: " + numbers.firstKey());

        // Using the LastKey() method
        System.out.println("TreeMap lastKey() method: " + numbers.lastKey());

        // Using firstEntry() method
        System.out.println("TreeMap lastKey() method: " + numbers.firstEntry());

        // Using LastEntry() method
        System.out.println("TreeMap lastKey() method: " + numbers.lastEntry());

    }
}
