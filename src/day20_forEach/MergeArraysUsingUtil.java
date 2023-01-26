package day20_forEach;
import utilities.ArrayUtility;

import java.util.Arrays;

public class MergeArraysUsingUtil {
    public static void main(String[] args) {

        /* Using pre-made class (mergeArrays) [Java Programming > utilities > ArrayUtility]*/


        int[] a1 = {10, 20, 30};
        int[] a2 = {40, 50, 60};

        int[] a3 = ArrayUtility.mergeArrays(a1, a2);

        System.out.println(Arrays.toString(a3));
    }



}
