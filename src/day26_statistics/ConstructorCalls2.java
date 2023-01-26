package day26_statistics;

public class ConstructorCalls2 {

//    |Cons. 1|
    public ConstructorCalls2(){
        System.out.println("Default Constructor");
    }

//    |Cons. 2|
    public ConstructorCalls2(int a){
        this(); // calling "default" constructor (cons1)
        System.out.println("Int Arg Constructor");
    }

//    |Cons. 3|
    public ConstructorCalls2(String b){
        this(21); // calling "int" constructor (cons2)
        System.out.println("String Arg Constructor");
    }


    public static void main(String[] args) {



        ConstructorCalls2 obj1 = new ConstructorCalls2();
//        ---> Default Constructor

        System.out.println("------------------------------------");

        ConstructorCalls2 obj2 = new ConstructorCalls2(21); // calls (cons1) and (cons2)
//        ---> Default Constructor
//             Int Arg Constructor

        System.out.println("------------------------------------");

        ConstructorCalls2 obj3 = new ConstructorCalls2("Hello"); // calls (cons2 : w/ contains cons1 + cons2) and (cons3)
//        ---> Default Constructor
//             Int Arg Constructor
//             String Arg Constructor

                                      /* ^^^^ Constructor Chaining ^^^^ */

    }
}
