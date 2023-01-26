package day14_forLoop;

public class WarmupTasks {
    public static void main(String[] args) {
//    3 ways of printing |TASK 1|

        System.out.println(combine("one", "eight"));
        System.out.println(combine("kari", "pidhe"));
        String strOut = combine("that's ", "myBoi");
        System.out.println(strOut);

        System.out.println("-------------------------------------------------------------------------------");

//                       |TASK 2|
        System.out.println(sumOf2Numbers(10,2));//   ( 10 + 2 )
        System.out.println(sum0f3Numbers(100));// ( 10 + 2 + 100 )


    }

//    |TASK 1|
    public static String combine (String str1, String str2)
    {
        String result;

        if (str1.endsWith("" + str2.charAt(0))){
            result = str1 + str2.substring(1);
    }else{
            result = str1 + str2;
        }

       return result;
    }


//    |TASK 2|
    public static  int sumOf2Numbers( int n1, int n2 ){
        return n1 + n2;
    }

    public static int sum0f3Numbers( int n3 ){
        int r = sumOf2Numbers(10,2);             // this method is "ok" but the source code must be changed..
        return r + n3;                          //.to change the output : (n1,n2,n3) need to be input in the same place
    }


                /* different ways of outputting sum of 4 numbers */
//    public static int sumOf4IntegerNumbers(int n1, int n2, int n3, int n4) {
//            return n1 + n2 + n3 + n4;
//            return sumOf3IntegerNumbers(n1, n2, n3) + n4;
//            return sumOf2IntegerNumbers(n1, n2) + sumOf2IntegerNumbers(n3, n4);
//            return  sumOf2IntegerNumbers(   sumOf3IntegerNumbers(n1, n2, n3)  ,   n4 );
//            return  sumOf3IntegerNumbers(   sumOf2IntegerNumbers(n1, n2)  ,  n3 ,  n4  );
//
//    }
}
/*
            |TASK 1|
  Create a method named combine that can take two string and hen add them together and returns it.
        	But if the last letter of the first word and the first letter of the last letter are the same, return that character once.
	        combine("one", "eight")  ==> oneight

	        |TASK 2|
	  1. create a method that can find the sum of two integer numbers
	                method name: sumOf2Numbers
	    2. create a method that can find the sum of three integer numbers
	                method name: sumOf3Numbers
	    3. create a method that can find the sum of four integer numbers
	                method name: sumOf4Numbers


 */