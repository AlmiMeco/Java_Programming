package day10_string;

public class StringMethods1 {
    public static void main(String[] args) {


        String str = "Cydeo";
        //index :   01234

        // charAt() method -

        char firstChar = str.charAt(0);  // 0 is C according to the index numb
        char secondChar = str.charAt(1);

        System.out.println(firstChar);// ----> C
        System.out.println(secondChar);//----> y

        // length() method -

        String sentence = "Java Programming Language";
        //index         :  0123456789.....

       int indexTotal = sentence.length();// index length stored as an integer value
        System.out.println(indexTotal); // ---> 25 (25 total index numbers in "Sentence" string (25 - 1 = 24) 24 is the
        // last index number ( e )

        System.out.println("--------------------------------------------------------------");
        //equals() method -
        String word1 = "Java";
        String word2 = new String("Java");

        System.out.println( word1 == word2 );// false (even tho they are the same word they are stored separately)
        System.out.println( word1.equals(word2) );// true (using the equals method you will get the TRUE boolean result)

        // this is why using the equals() method is preferred over (==)







    }


}
