package day23_arrayListCont;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {


        ArrayList<String> groceriesList = new ArrayList<>();

        groceriesList.add("Eggs");
        groceriesList.add("Apples");
        groceriesList.add("Chicken");
        groceriesList.add("Paper Towels");
        groceriesList.add("Olive Oil");

        System.out.println(groceriesList);
//        ---> [Eggs, Apples, Chicken, Paper Towels, Olive Oil]


//        |.set() method|        (edit elements of ArrayList via Index #)
        groceriesList.set(1, "Oranges"); // changes index 1 "Apples" ---> "Oranges"

        System.out.println(groceriesList);
//        ---> [Eggs, Oranges, Chicken, Paper Towels, Olive Oil]

        System.out.println("-------------------------------------------------");

//        |.remove() method|     (removes element from ArrayList via index # or object)
        groceriesList.remove(0);            // removes index 0 ("Eggs")
        groceriesList.remove("Paper Towels"); //  removes object "Paper Towels"

        System.out.println(groceriesList);
//        ---> [Oranges, Chicken, Olive Oil]

        System.out.println("-------------------------------------------------");

//        |.clear() method|      (removes ALL elements from ArrayList)
        groceriesList.clear();
        System.out.println(groceriesList);
//        ---> []    (size is set to 0)


    }

}
