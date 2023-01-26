package day16_nestedLoop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("wooden spoon"); //       5 outputs
        }

        System.out.println("----------------------------------------");

//        |NESTED LOOP| (a loop inside another loop)
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("wooden spoon");   //      25 total outputs (5 loops 5 times)
            }
        }

    }
}
