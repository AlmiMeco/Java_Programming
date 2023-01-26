package day19_array;

import java.util.Arrays;  // import of Arrays util pkg ; allowing Array to be
//... converted from hash to String (Line 28)

public class ArrarysIntro {
    public static void main(String[] args) {



        /*  Creating an Array & assigning a variable to it (2 ways) */

//        |Method 1|
        int[] scores;
        scores = new int[4];

//        |Method 2|
        double[] scores2 = new double[5];

        /* [x] is used to establish how many elements (values) will be stored in given array
        ... fex: new int [4] ---> 4 int values will be stored */

        System.out.println(Arrays.toString(scores));
        // ---> [0, 0, 0, 0]  : [4] values being stored in "scores" (default value '0')
//index number   0  1  2  3


        /* How to change values of array element */

        scores[0] = 12;      //  [0] ---> index number : 12 ---> value
        scores[2] = 10;

        System.out.println(Arrays.toString(scores));
//  --->  [12, 0, 10, 0]

        System.out.println("------------------------------------------------------");

        /* Loops using arrays */

        for (int i = 0; i < 4; i++) {        // i ---> index number of 'scores'
            System.out.println(scores[i]);
        }


    }

}
