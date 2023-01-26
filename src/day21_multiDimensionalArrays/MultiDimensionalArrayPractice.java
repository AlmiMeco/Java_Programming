package day21_multiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        String [] group1 = {"Almi", "Alex", "Damien", "Diezel"};
        String [] group2 = {"JB", "Farrah", "Stetson"};
        String [] group3 = {"Liam", "Koko", "Gabe", "Bajram", "Jack"};
        String [] group4 = {"Lytfije", "Arjan"};

        String[][] groups = { group1, group2, group3, group4};

//        |Iterate the Multi Dimensional Array using For Each Loop|

        for (String[] each1D : groups) {
            System.out.println(""); // used for cleanliness (readability)
            System.out.println(Arrays.toString(each1D));
            System.out.println(""); // used for cleanliness (readability)

            for (String eachElement: each1D){
                System.out.println(eachElement);

            }
        }

        /* [Almi, Alex, Damien, Diezel]

            Almi
            Alex
            Damien
            Diezel

            [JB, Farrah, Stetson]

            JB
            Farrah
            Stetson

            [Liam, Koko, Gabe, Bajram, Jack]

            Liam
            Koko
            Gabe
            Bajram
            Jack

            [Lytfije, Arjan]

            Lytfije
            Arjan
*/

        System.out.println("--------------------------------------------------------");

        System.out.println(Arrays.deepToString(groups)); // Java util method to print Multi Dimensional Arrays
//      --->  [[Almi, Alex, Damien, Diezel], [JB, Farrah, Stetson], [Liam, Koko, Gabe, Bajram, Jack], [Lytfije, Arjan]]

    }

}
