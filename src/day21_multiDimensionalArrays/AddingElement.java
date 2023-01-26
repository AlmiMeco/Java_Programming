package day21_multiDimensionalArrays;

import utilities.ArrayUtility;

import java.util.Arrays;

public class AddingElement {
    public static void main(String[] args) {




        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8};
        int[] arr3 = {9,10}; // add {11,12}


        arr3 = ArrayUtility.addElement(arr3, 11);
        arr3 = ArrayUtility.addElement(arr3, 12);  // added using our custom method (utilities > ArrayUtility > addElement)

        System.out.println(Arrays.toString(arr3));


    }

}
