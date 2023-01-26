package day14_forLoop;

public class ForLoopIntro {

    public static void main(String[] args) {

//        for ( initialization ; condition ; iterator )
        for (int i = 1; i < 10; i++){  /* [i++] will add+ (1 to 'i') each loop: (1,2,3...10) */
            System.out.println("Hello World");
        }
//        (int i = 1)---> initialization
//        (i < 10)------> condition
//        (i++)---------> iteration

        for (int i = 10; i > 5; i--){  /* [i--] will sub- (1 from 'i') each loop: (10,9,8...7) */
            System.out.println("KARI");
        }


        for (int i = 1; i < 10; i += 2 ){    /* [i += 2] will add+ (2 to 'i') each loop: (1,3,5,7,9,10)*/
            System.out.println("5 Statements");                             //            * * * * * / {5 total loops}
        }

        System.out.println("--------------------------------------------------------------------------");

//        get 1-100 and add each number (1+2+3+4+5...99+100)

        int sum = 0;

        for (int i = 1; i <= 100; i++){
            sum += i;
        }
        System.out.println(sum); // 5050
        System.out.println();

//       |TASK 1| print (A-Z) .... |TASK 2| print (Z-A)

//        |TASK 1|
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------------------------------");

//        |TASK 2|
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }






    }

}
