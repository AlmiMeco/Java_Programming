package day19_array;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {


                                          /* String Array */

        String [] myGroup = new String[4];

        myGroup[0] = "Gulcin";
        myGroup[1] = "Almi";
        myGroup[2] = "Muhtar";
        myGroup[myGroup.length-1] = "Alec"; // config name (value) of last element  [4]

        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------------");


//        Iterating Arrays from beginnig element to ending element

        /* myGroup.fori ---> */

        for (int i = 0; i < myGroup.length; i++) {
            System.out.println(myGroup[i]);
        }


        System.out.println("-------------------------------------");


//        Iterating Arrays from ending element to beginning element

        /* myGroup.forr ---> ... forr (for loop in reverse) */

        for (int i = myGroup.length - 1; i >= 0; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("----------------------------");



//        |Create an array that can store the numbers 1 - 100|            {My way of solving it}

        int [] oneHunnid = new int[101]; // 100 imcluding '0'

        for (int i = 1; i < oneHunnid.length; i++) {
            oneHunnid[i] = i;
            System.out.println(oneHunnid[i]);

        }

        System.out.println("------------------------------------------------");


//       |Create an array that can store the numbers 100 - 1|

        for (int i = oneHunnid.length - 1; i >= 1; i--) {
            oneHunnid[i] = i;
            System.out.println(oneHunnid[i]);

        }

        System.out.println("--------------------------------------------------");

//        |Muhtar' way of solving this task|

        for (int i = 0, j = 1; i < oneHunnid.length; i++, j++) {
            oneHunnid[i] = j;

        }

        System.out.println(Arrays.toString(oneHunnid));

//        some cool tweaks to this code
        System.out.println("--------------------------------------------------------");

//        100 itirations of of multiple of 10: (10,20,30,40,50,60,70...1000)

        for (int i = 0, j = 10; i < oneHunnid.length; i++, j+=10) {
            oneHunnid[i] = j;

        }

        System.out.println(Arrays.toString(oneHunnid));
    }



}
