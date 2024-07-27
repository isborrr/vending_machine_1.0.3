package GuidedLAB303115;

import java.util.HashSet;

public class UnionOfSets {

        public static void main(String[] args) {
            HashSet<Integer>  evenNumber = new HashSet<Integer>();
            evenNumber.add(2);
            evenNumber.add(4);
            evenNumber.add(6);
            evenNumber.add(8);
            System.out.println("HashSet1: " + evenNumber);

            // Using addAll() method
            HashSet<Integer> numbers = new HashSet<>();
            numbers.add(5);
            numbers.add(1);
            numbers.add(7);

            System.out.println("HashSet2: " + numbers);

            numbers.addAll(evenNumber);


            System.out.println("Union is: " + numbers);

        }
    }


