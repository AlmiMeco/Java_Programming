package day23_arrayListCont;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {


        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(67);
        scores.add(75);
        scores.add(93);
        scores.add(100);
        System.out.println(scores);
//        ---> [67, 75, 93, 100]


        System.out.println("----------------------------------------------------------------------------");


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
//        ---> [1, 2, 3, 4, 5]


        System.out.println("----------------------------------------------------------------------------");


//        |.addAll() method|      (allows you to add elements to an array via 'list')
//        *ONLY ACCEPTS COLLECTIONS (list , queue, set)*
        list.addAll(scores); // add all elements of scores (list) to ArrayList
        System.out.println(list);
//        ---> [1, 2, 3, 4, 5, 67, 75, 93, 100]


        System.out.println("----------------------------------------------------------------------------");


        list.clear();
        System.out.println(list);
//        ---> []

//        |.asList() method|      (creates a list of elements... to be added to an ArrayList)
        list.addAll(Arrays.asList(10, 20, 30, 40, 50));
        System.out.println(list);
//        ---> [10, 20, 30, 40, 50]


        System.out.println("----------------------------------------------------------------------------");


//        |.containsAll() method|  (verifies if ArrayList contains ALL given elements
//        *ONLY ACCEPTS COLLECTIONS (list , queue, set)*

        boolean contains = list.containsAll(Arrays.asList(10, 20, 30)); // [10,20,30] contained in list ---> true/false
        System.out.println(contains);
//        ---> true


        System.out.println("----------------------------------------------------------------------------");


//        |removeAll() method|    (removes all instances of an element from ArrayList)
//        *ONLY ACCEPTS COLLECTIONS (list , queue, set)*
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 80, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20));
        System.out.println(list);
//        ---> [10, 20, 30, 40, 50, 10, 10, 20, 30, 40, 50, 60, 70, 80, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20]

        list.removeAll(Arrays.asList(10, 20)); // removes all 10s & 20s
        System.out.println(list);
//        ---> [30, 40, 50, 30, 40, 50, 60, 70, 80]


        System.out.println("----------------------------------------------------------------------------");


//        |retainAll() method|   (removes all elements that are NOT matching given elements from ArrayList)
//        *ONLY ACCEPTS COLLECTIONS (list , queue, set)*
        list.addAll(Arrays.asList(10, 10, 20, 30, 40, 50, 60, 70, 80, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20));
        System.out.println(list);
//        ---> [30, 40, 50, 30, 40, 50, 60, 70, 80, 10, 10, 20, 30, 40, 50, 60, 70, 80, 10, 10, 10, 10, 10, 10, 20, 20, 20, 20]

        list.retainAll(Arrays.asList(70, 80)); // removes every element BESIDES 70 & 80
        System.out.println(list);
//        ---> [70, 80, 70, 80]


    }

}
