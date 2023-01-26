package day21_multiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {


//        |Single Dimensional Arrays|
        int[] arr1 = {10, 20, 30, 40, 50};
        int[] arr2 = {60, 70, 80, 90, 100};
        int[] arr3 = {1000, 10000, 1000000};

        System.out.println("---------------------------------------------------------------");

//        |Multi Dimensional Arrays|
        int[][] arr2D = {{10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}, {1000, 10000, 1000000}};

//        ... or declare using variable neames
        int[][] arr2D2 = {arr1, arr2, arr3};

//        ... or declare via "new" keyword
        int[][] arr2D3 = new int[3][];
        //                       ^ <--- number of arrays to be stored in Multi Dimensional array


        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");
        System.out.println("---------------------------------------------------------------");


//        |Index # of Multi Dimensional Arrays|

//   index # of Arrays--->         0                 1                   2
        int[][] array2D = {{10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}, {1000, 10000, 1000000}};
// index # of elements--->   0  1  2  3  4     0  1  2  3  4       0     1      2

        System.out.println("---------------------------------------------------------------");


//        |Accessing Single Arrays from Multi Dimensional Arrays|

        System.out.println(Arrays.toString(array2D[0])); // array [0]
//        ---> [10, 20, 30, 40, 50]
        System.out.println(Arrays.toString(array2D[1])); // array [1]
//        ---> [60, 70, 80, 90, 100]
        System.out.println(Arrays.toString(array2D[2])); // array [2]
//        ---> [1000, 10000, 1000000]

        System.out.println("---------------------------------------------------------------");

//        |Accessing elements from Multi Dimensional Arrays|

        System.out.println(array2D[0][3]); // array [0] : index # [3]
//        ---> 40
        System.out.println(array2D[2][2]); // array [2] : index # [2]
//        ---> 1000000


    }

}
