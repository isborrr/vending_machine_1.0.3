package GuidedLAB303115;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExampleone {
    public static void main(String[] args) {
        TreeSet<Integer> num_Treeset = new TreeSet<>();
        num_Treeset.add(20);
        num_Treeset.add(5);
        num_Treeset.add(15);
        num_Treeset.add(25);
        num_Treeset.add(10);
        // Call iterator() method to define Iterator for TreeSet
        Iterator<Integer>  it = num_Treeset.iterator();
       while(it.hasNext()){
           System.out.print(it.next());
           System.out.print(", ");

       }

        }
    }

