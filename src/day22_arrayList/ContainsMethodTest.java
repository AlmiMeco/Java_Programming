package day22_arrayList;

import utilities.ArrayUtility;

public class ContainsMethodTest {
    public static void main(String[] args) {




        int[] arr1 = { 10,20,30,40,50};


        System.out.println(ArrayUtility.contains(arr1, 10)); // ---> true
        System.out.println(ArrayUtility.contains(arr1, 69)); // ---> false

    }

}
