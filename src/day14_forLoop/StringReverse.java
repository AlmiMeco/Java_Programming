package day14_forLoop;

public class StringReverse {
    public static void main(String[] args) {


        String r = "Disgusting";
        String reverse = "";
        // reverse the string ---> "avaJ"

        for (int i = r.length() - 1; i >= 0; i--) {             // r.length() - 1 ===> the index length of given String
            reverse += r.charAt(i);
        }

        System.out.println(reverse);// the reverse of 'r'
    }

}
