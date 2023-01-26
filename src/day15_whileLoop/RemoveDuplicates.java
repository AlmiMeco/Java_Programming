package day15_whileLoop;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str = "aaabbbcc";
        String result = "";  // contains new string "abc"

        for (int i = 0; i < str.length()  ; i++) {        // this code will retrieve every char of the string
            System.out.println(str.charAt(i));            // print out each char of str

            char each = str.charAt(i);  // each char of str

            if (!result.contains("" + each)){             // if the result DOESN'T contain each (char being examined)
                result += each;                           // result will be saved char + new char
            }                                             //    char each = aaabbbbbcc
        }                                                 //String result = a**b****c*

        System.out.println("result = " + result);  // ---> abc
    }

}
/*
Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */