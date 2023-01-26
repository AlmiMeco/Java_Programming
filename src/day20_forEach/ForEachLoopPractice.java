package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11}; // print odd numbers

        for (int each : numbers){

            if(each % 2 != 0){
                System.out.println(each);
            }
        }

//        ---> 1,3,5,7,9,11

        System.out.println("--------------------------");


        int[] nums = {1,4,13,66,453,34,2,-4};

        int max = nums[0];
        int min = nums[0];

        for (int each : nums) { // get max number

            if (each > max){
                max = each;
            }

        }

        System.out.println(max);
//        ---> 453

        for (int each : nums) { // get min number
            if (each < min) {
                min = each;
            }

        }

        System.out.println(min);
//        ---> -4

        System.out.println("--------------------------");


    }

}
