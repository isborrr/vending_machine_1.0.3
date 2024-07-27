package GuidedLAB303115;

import java.util.TreeSet;

public class firstlastMethods {
    public static void main(String[] args) {


        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);
// first method
        System.out.println(numbers.first());
        // last method
        System.out.println(numbers.last());
    }
}
