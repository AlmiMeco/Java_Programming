package day21_multiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalArrays {
    public static void main(String[] args) {

//  index # of Arrays--->         0                 1                   2
        int[][] array2D = {{10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}, {1000, 10000, 1000000}};
// index # of elements--->   0  1  2  3  4     0  1  2  3  4       0     1      2


        for (int i = 0; i < array2D.length; i++) { // i: index # of Single Dimensional Array in array2D

            System.out.println(Arrays.toString(array2D[i]));
        }

        /* [10, 20, 30, 40, 50]
           [60, 70, 80, 90, 100]
           [1000, 10000, 1000000] */

        System.out.println("----------------------------------------------------------------");


//        |Iterating each individual element using For Each Loop|

        for (int[] each1DArray : array2D) {
            System.out.println(Arrays.toString(each1DArray)); // iterating 1D arrays

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);              // iterating elements of 1D arrays
            }
        }

        /*  [10, 20, 30, 40, 50]
            10
            20
            30
            40
            50

            [60, 70, 80, 90, 100]
            60
            70
            80
            90
            100

            [1000, 10000, 1000000]
            1000
            10000
            1000000 */


    }

}
