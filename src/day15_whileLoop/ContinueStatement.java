package day15_whileLoop;

public class ContinueStatement {
    public static void main(String[] args) {

//        continue; skips everything remaining in the loop body for ONE iteration (repetition)

        for (int i = 0; i < 6; i++) {

            if (i == 4) {
                continue;
            }
            System.out.println(i); //skips "4" in the console output (ONE continue statement; ONE skip of the loop)
        }

        System.out.println("---------------------------------------------");
//      |ODD NUMBERS| (using continue; statement)
        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i);
        }

        System.out.println("---------------------------------------------");

//      |EVEN NUMBERS| (using continue; statement)
        for (int i = 0; i < 21; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }





}

