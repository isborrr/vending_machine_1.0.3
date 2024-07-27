package GuidedLAB303115;

import java.util.TreeSet;

public class TreesetExampletwo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);

       // remove method shown boolean vlaue
        System.out.println("Is 5 removed? " + numbers.remove(5));

        // remove all show boolean value
        System.out.println("remo0ve all element " + numbers.removeAll(numbers));



    }
}
