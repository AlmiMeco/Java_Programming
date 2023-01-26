package utilities;

public class StringUtility {

    public static void main(String[] args) {

        System.out.println(reverse("Apple Cucumber Zyn"));
//                                ---> "nyZ rebmucuC elppA"

    }


//  | Custom Method: String Reverse Method |
    public static String reverse(String str){
        String reverse = "";

        for (int i = str.length() -1; i >= 0; i--){
            reverse += str.charAt(i);
        }


        return reverse;
    }
}
