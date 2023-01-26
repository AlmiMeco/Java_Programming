package day15_whileLoop;

public class RemoveDuplicatesWithContState {
    public static void main(String[] args) {

        String str ="zzzyyyzzzzzyzzzzyxxxxyyyr";
        String result = "";

        /*                                                       Breakdown of what each line is doing*/

        for (int i = 0; i < str.length(); i++) {  //        ---> continues the loop until the string has ended

            char each = str.charAt(i);    //      ---> each time a char is extracted it is stored under [each] variable

            if (!result.contains("" +each)){    // ---> if [result] variable doesn't (!) contain the char being examined (each)
                result += each;                  //             --->  [result] will inherit the char of [each]
            }else {                   //  ---> if if [result] variable does (!) contain the char being examined (each)
                continue;               //  --->         skip the rest of the code block
            }
        }

        System.out.println(result);       // ---> the rest of the code block (code being skipped by continue;)




    }

}
/*
Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
*/