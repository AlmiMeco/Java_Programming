package day39and40_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class ListDemo {


    public static void main(String[] args) {

        /* Array List (implements "List" interface) */

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(200);
        list1.add(300);
        list1.add(400);
        list1.add(500);

        System.out.println(list1.get(0 ));

        /* Linked List (implements "List" interface) */

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(600);
        list2.add(700);
        list2.add(800);
        list2.add(900);
        list2.add(1000);

        System.out.println(list2.get(0));

        /* Vector (implements "List" interface) */

        Vector <Integer> list3 = new Vector<>();
        list3.add(20);
        list3.add(40);
        list3.add(60);
        list3.add(80);
        list3.add(100);



        /* Vector is Synchronized (thread safe) {one thread at a time} */




    }


}
