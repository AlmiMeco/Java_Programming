package utilities;

import java.util.Arrays;

public class ArrayUtility {


                            /* Method for merging two int[] Arrays */


    public static int[] mergeArrays(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length + arr2.length];// arr3 element length equal to arr1 + arr2

        int k = 0;  // arr3 index numbers

//        |Iteration for arr1 ---> arr3|
        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k] = arr1[i];
        }

//        |Iteration for arr2 ---> arr3|
        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k] = arr2[i];
        }

        return arr3;
    }


                            /* Method for reversing given int[] Array */


    public static int[] reverseArrays(int[] arr1){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,3};
        int[] reverseArray = new int[numbers.length];

        for (int i = numbers.length-1 , j = 0; i >= 0; i--, j++) {
            //reverseArray[i] = j;  ---> my OG code (the only code that changed b/w mine & Muhtar)
            reverseArray[j] = numbers[i];

        }
        return reverseArray;
    }


                          /* Method for adding element into existing Array */


    public static int[] addElement(int[] array, int element){
        int[] new_array = Arrays.copyOf(array, array.length + 1);
        new_array[new_array.length-1] = element;
        return new_array;
    }


                 /* Method for Determining if an Element is contained in an Array */


    public static boolean contains(int[] array, int element){

        for (int each : array){
            if (each == element) {
                return true;
            }
        }
        return false;
    }











}
