package GuidedLAB303115;

import java.util.HashSet;

public class DifferenceofSets {
    
        public static void main(String[] args) {
            HashSet<Integer>  primeNumbers = new HashSet<Integer>();
            primeNumbers.add(5);
            primeNumbers.add(1);
           // primeNumbers.add(7);
            primeNumbers.add(2);
            System.out.println("HashSet1: " + primeNumbers);

            // Using addAll() method
        HashSet<Integer>  oddNumbers = new HashSet<>();
         oddNumbers.add(5);
            oddNumbers.add(1);
           oddNumbers.add(7);

            System.out.println("HashSet2: " + oddNumbers);
            // Difference between HashSet1 and HashSet2

            oddNumbers.removeAll(primeNumbers);


            System.out.println("Difference: " + oddNumbers);

        }
    }


