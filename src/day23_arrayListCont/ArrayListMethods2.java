package day23_arrayListCont;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Apples");
        groceriesList.add("Chicken");
        groceriesList.add("Paper Towels");
        groceriesList.add("Olive Oil");

        System.out.println(groceriesList);
//        ---> [Eggs, Apples, Chicken, Paper Towels, Olive Oil]

        System.out.println("-------------------------------------------------");

//        |.indexOf() method|     (outputs what index # the given element holds)
        System.out.println(groceriesList.indexOf("Chicken"));
//        ---> 2    {"Chicken" is at index 2}


        System.out.println("-------------------------------------------------");

//        |.contains() method|    (boolean method that returns true/false if ArrayList contains given element)
        System.out.println(groceriesList.contains("Chicken")); // ---> true


        System.out.println("-------------------------------------------------");

//        |.removeIf() method|    (creates loop that uses predicator to remove element from ArrayList {using condition})
        groceriesList.removeIf(p -> p.startsWith("A") ); // ---> removes ALL elements starting with 'A' ("Apple")
        System.out.println(groceriesList);

    }

}
