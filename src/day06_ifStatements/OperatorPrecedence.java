package day06_ifStatements;

public class OperatorPrecedence {
    public static void main(String[] args) {

        System.out.println(5 + 2 * 3);// 11     5 + (2 * 3)
                                      //        5 + 6 = 11 [PEMDAS]
        System.out.println(7 + 3 - 2 / 2);
                      //           (2/2)
                      //    10 -   1      = 9

        System.out.println(10 > 9 == 8 < 7);
                     //     True     False    = False
        System.out.println("--------------------------------------");

        System.out.println(100 >= 20 && 40 * 2 > 60);
        //                 100 >= 20 &&   80   > 60
        //                     TRUE  &&  TRUE
        //                      ---> true



    }
}
/*
Order of Precedence Operators Description:
1 (- !) Unary negation, logical NOT
2 (* / %) Multiplication, division, modulus
3 (+ -) Addition, subtraction
4 (< > <= >=) Less than, Greater than, Less than or Equal to, Greater than or equal to
5 (==) != Equal to, not equal to
6 (&&) Logical AND
7 (||) Logical OR
8 (= += -= *= /= %=) Assignment and combined assignments

 */