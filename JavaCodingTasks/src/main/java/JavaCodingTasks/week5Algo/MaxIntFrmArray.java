package JavaCodingTasks.week5Algo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class MaxIntFrmArray {

    /** Write a function that can find the maximum number from an int Array.
     input: int[] array = {6, 8, 3, 5, 1, 9}; output: 9
     **/

    public static void main(String[] args) {


        int[] array = {6, 8, 3, 5, 1, 9};

        System.out.println(Arrays.stream(array).max().getAsInt());





    }


}
