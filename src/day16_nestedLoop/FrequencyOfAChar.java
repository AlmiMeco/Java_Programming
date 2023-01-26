package day16_nestedLoop;

public class FrequencyOfAChar {
    public static void main(String[] args) {

        String str = "aaabbbbcc";
        char ch = 'b';

        int count = 0;

        for (int i = 0; i < str.length()-1; i++) { // i is the index number of str

            if (str.charAt(i) == ch) {
                count++;
//               every time the given char [str] is matching the desired char [ch] the index [count] goes up by +1
            }
        }
        System.out.println(count); // 4 ---> b b b b in (str)


    }

}
/*
write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'
		     output:
		     	5
*/