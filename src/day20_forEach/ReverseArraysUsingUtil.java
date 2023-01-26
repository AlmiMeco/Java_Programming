package day20_forEach;

import utilities.ArrayUtility;

import java.util.Arrays;

public class ReverseArraysUsingUtil {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,3};

        int[] reverse = ArrayUtility.reverseArrays(numbers);

        System.out.println(Arrays.toString(reverse));



    }

}
