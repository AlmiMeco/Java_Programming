package day22_arrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {


        ArrayList <Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        list.add(600);

        System.out.println(list);
//        ---> [100, 200, 300, 400, 500, 600]

        System.out.println("-------------------------------");

//        |Using For Each Loop to iterate ArrayList {list}|
        for (Integer each : list) {
            System.out.println(each);
        }

        System.out.println("-------------------------------");

//        |Using For Loop to iterate ArrayList {list}|  *inefficient method*
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("-------------------------------");

//        |Using For Loop to iterate ArrayList in reverse {list}|
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }





    }

}
