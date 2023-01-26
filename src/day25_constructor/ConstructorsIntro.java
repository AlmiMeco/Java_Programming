package day25_constructor;

public class ConstructorsIntro {

                /* EVERY CLASS MUST HAVE A CONSTRUCTOR :: CONSTRUCTOR NAME MUST MATCH CLASS NAME */

    public ConstructorsIntro(){       // no-argument (default) constructor
        System.out.println("OBJECT CREATED BY CONSTRUCTOR");
    }

    public ConstructorsIntro(int n){  // Parameterized constructor (int --> parameter)
        System.out.println("OBJECT CREATED BY (int 'n' ->) \"" + n + "\" ARGUMENT CONSTRUCTOR");
    }


    public static void main(String[] args) {



        ConstructorsIntro obj1 = new ConstructorsIntro();
//        ---> OBJECT CREATED BY CONSTRUCTOR


        ConstructorsIntro obj3 = new ConstructorsIntro(300);
//        ---> OBJECT CREATED BY (int 'n' ->) "300" ARGUMENT CONSTRUCTOR

        ConstructorsIntro obj2 = new ConstructorsIntro(13);
//        ---> OBJECT CREATED BY (int 'n' ->) "13" ARGUMENT CONSTRUCTOR






    }

}
