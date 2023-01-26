package day23_arrayListCont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 56, 6, 4, 5, 65, 53, 444, 263, 3));

//        |.max() method|            (returns max value element of collection)   *int/double only*
        System.out.println(Collections.max(list)); // ---> 444

//        |.min() method|            (returns min value element of collection)   *int/double only*
        System.out.println(Collections.min(list));//  ---> 1

//        |.sort() method|           (sorts collection in ascending order {min ---> max} {A-Z}
        Collections.sort(list);
        System.out.println(list);
//        ---> [1, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 53, 56, 65, 263, 444] {min - max }

        System.out.println("-------------------------------------------------------------------");

//        |.reverse() method|        (reverses the order of the collection)
        Collections.reverse(list);
        System.out.println(list);
//        ---> [444, 263, 65, 56, 53, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 1]

        System.out.println("-------------------------------------------------------------------");

//        |.swap() method|           (swaps elements of method via index #)
        Collections.swap(list, 0, 2); // swaps index 0 (444) w/ index 2 (65)
        System.out.println(list);
//        ---> [65, 263, 444, 56, 53, 7, 6, 6, 5, 5, 4, 4, 3, 3, 2, 1]

        System.out.println("-------------------------------------------------------------------");

//        |.replaceAll() method|     (replaces all occurences of specified element with a given element)

        Collections.replaceAll(list, 5, 69);
        System.out.println(list); // replaces all 5s with 69
//        ---> [65, 263, 444, 56, 53, 7, 6, 6, 69, 69, 4, 4, 3, 3, 2, 1]

        System.out.println("-------------------------------------------------------------------");

//        |.frequency() method|      (returns frequency of specified element within collection)

        System.out.println(Collections.frequency(list, 69)); // how many instances of '69' are contained in "list"
//        ---> 2


    }

}
