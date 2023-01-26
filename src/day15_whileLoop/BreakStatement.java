package day15_whileLoop;

public class BreakStatement {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            if (i > 5){
                break; // break statement (exits the loop)
            }
            System.out.println(i);
        }


        System.out.println("----------------------------------------");

        for (char i = 'A'; i < 'Z'; i++) {

            if (i == 'J') {
                break;
            }
            System.out.println(i);
        }

    }



}
