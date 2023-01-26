package day16_nestedLoop;

public class LoopPractices {
    public static void main(String[] args) {

        /* you CAN use any loop type for any loop you wish to create; sometimes it's more optimal to use one over the other */


//     |For loop|
        for (int i = 0; i < 6; i++) {
            System.out.println("hello " + i);
        }

        System.out.println("----------------------------------------------------");

//     |While loop|
        int j = 0;
        while (j < 6) {
            System.out.println("hello " + j);
            j++;
        }

        System.out.println("------------------------------------------------------");

//     |Do-While loop|
        int l = 0;
        do {
            System.out.println("hello " + l);
            l++;
        }while (l < 6);
    }

}
