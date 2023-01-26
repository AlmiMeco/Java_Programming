package day19_array;

public class MaxNum_and_MinNum {
    public static void main(String[] args) {


        int [] numbs = {-100, -12, 220, 1000, 3, -43};

//        Max Number using arrays

        int maxNum = numbs[0];

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] > maxNum){
                maxNum = numbs[i];
            }

        }
        System.out.println("maxNum = " + maxNum);
        System.out.println("-------------------------------");

//        Min Number using arrays

        int minNum = numbs[0];

        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] < minNum) {
                minNum = numbs[i];
            }
        }
        System.out.println("minNum = " + minNum);



    }

}
