package day22_arrayList;

import java.util.ArrayList; // import statement for ArrayList

public class ArrayListIntro {
    public static void main(String[] args) {

//        |Syntax for creating ArrayList|

        ArrayList<Integer> arrayList = new ArrayList<>();
//                    ^---dataType (non-primitive only)

//        |.add() method|
        arrayList.add(10); // index : 0
        arrayList.add(20); // index : 1
        arrayList.add(30); // index : 2
        arrayList.add(40); // index : 3

        System.out.println(arrayList);
//        ---> [10, 20, 30, 40]


        arrayList.add(1, 15); // can also insert element to any EXISTING index #
//        ---> inserts '15' to index 1 : pushes all subsequent elements 1 index to the right

        System.out.println(arrayList);
//        ---> [10, 15, 20, 30, 40]

        System.out.println("------------------------------------------------------");

//        |.get() method|
        System.out.println(arrayList.get(0)); // outputs element via index number
        System.out.println(arrayList.get(arrayList.size() - 1)); // syntax for 'getting' element of last index


    }

}
