package GuidedLAB303115;

import java.util.HashSet;

public class InsertElementstoHashSetusingaddAll {
    public static void main(String[] args) {
        HashSet<Integer>  evenNumber = new HashSet<Integer>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);
        System.out.println(evenNumber);

        // Using addAll() method
        HashSet<Integer> numbers = new HashSet<>();
        numbers.addAll(evenNumber);
        numbers.add(5);

        System.out.println("New HashSet: " + numbers);

    }
}
