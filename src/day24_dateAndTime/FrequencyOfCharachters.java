package day24_dateAndTime;

import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharachters {
    public static void main(String[] args) {


        String str = "aaabbbbccccc";
//        return freq of each char

        String result = "";

        for (String each : str.split("")) {

            int frequency = Collections.frequency(Arrays.asList(str.split("")), each);

            if (!result.contains(each)) {
                result += each + frequency;
            }

        }

        System.out.println(result);
//        ---> a3b4c5




    }

}
