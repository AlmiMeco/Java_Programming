package day20_forEach;

import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {

                                        /* .sort() method */

        int[] scores = {75,94,100,67,89};
        int[] scores2 = {75,94,100,89,67};

        Arrays.sort(scores);// sorts the array in ascending order ( LEAST TO GREATEST)

                                       /* .toString method */

        System.out.println(Arrays.toString(scores));
//       ---> [67, 75, 89, 94, 100]

                                        /* .equals() method */

        boolean b = Arrays.equals(scores, scores2);
        System.out.println(b);// false : arrays MUST have equal elements in the SAME order to ---> true

        Arrays.sort(scores2);

        boolean b2 = Arrays.equals(scores, scores2);

        System.out.println(b2);// true

                                       /* .copyOf() method */

        System.out.println("-------------------------------------");


        int [] array = {100,200,300,400,500,600};
//        index --->     0   1   2   3   4   5
        int [] array2 = Arrays.copyOf(array , 3);
//      (array2) new array ID : (array) array ID to be copied : length of new array (by element not index)
        int [] array3 = Arrays.copyOf(array, array.length);
//        full array will be copied (array.length)
        int [] array4 = Arrays.copyOf(array, 10);
//        full array plus remaining elements (10 - 6 = 4) stored as default (null or '0')

        System.out.println(Arrays.toString(array2));
//        ---> [100, 200, 300]
        System.out.println(Arrays.toString(array3));
//        ---> [100, 200, 300, 400, 500, 600]
        System.out.println(Arrays.toString(array4));
//        ---> [100, 200, 300, 400, 500, 600, 0, 0, 0, 0]

        System.out.println("-------------------------------------");

                                   /* .copyOfRange() method */

        int [] array5 = Arrays.copyOfRange(array, 2 , 5);
//        copy 'array' from INDEX 2 - INDEX 5 (excluding last index)
//        reality :  from 2, to 5 ---> from index 2 to index 4

        System.out.println(Arrays.toString(array5));
//        ---> [300, 400, 500]


//         2:41 DAY 20







    }

}
