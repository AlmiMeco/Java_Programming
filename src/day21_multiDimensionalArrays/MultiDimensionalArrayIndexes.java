package day21_multiDimensionalArrays;

public class MultiDimensionalArrayIndexes {
    public static void main(String[] args) {


//        |2 Dimensional Arrays|

        int[][] arr2D1 = { {1,2}, {3,4,5} };
        int[][] arr2D2 = { {6,7,8,9}, {10,11}, {12,13,14} };
        int[][] arr2D3 = { {15,16,17,18,19}, {20} };

//        |3 Dimensional Array|

//        int [index of 2D array] [index of 1D array] [index of elements]
            int[][][] arr3D = { {{1,2}, {3,4,5}} , { {6,7,8,9}, {10,11}, {12,13,14} } , { {15,16,17,18,19}, {20} } };
//  [/][][]index of 2D array :         0                               1                               2

//  [][/][]index of 1D array :     0        1            0         1          2                   0           1

//  [][][/]index of elements :    0 1    0 1 2        0 1 2 3    0   1    0   1  2          0  1  2  3  4     0

        System.out.println(arr3D[0][1][1]); // ---> 4
        System.out.println(arr3D[2][0][3]); // ---> 18
//        [2D Array : 2] [1D Array : 0] [element : 3]

        /* ^^^ .toString not required because we are printing elements not arrays */





    }

}
