package day17_customClass;

import day14_forLoop.StringReverse;

public class UniqueChar1 {
    public static void main(String[] args) {


        String str = "aaabaccd";

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){
                unique += each;
            }
        }

        System.out.println(unique); // bd


        System.out.println("-----------------------------------------------------------------------------");

        String str2 = "aabcccd";

        String unique2 = "";

//        |TASK 2| (universal way for solving a "unique times" task)
        for (int j = 0; j < str2.length(); j++) {


            char ch = str2.charAt(j);
            int frequency = 0;
            for (int i = 0; i < str2.length(); i++) {
                if (str2.charAt(i) == ch) {
                    frequency++;
                }
            }


            if (frequency == 1) {
                unique2 += ch;
            }

        }


        System.out.println(unique2);

    }

}
/*  |TASK 1|
 Write a program that can find the unique characters from a String
			Ex:
				str = "aabcccd"
				output:
					bd


	|TASK 2|
Write a program that can find the unique characters from a String (using nested loops)
			Ex:
				str = "aabcccd"
				output:
					bd
 */