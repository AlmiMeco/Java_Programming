package day27_accessModifiers;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {


//    |Constructor|                          (must be initialized to be executed (new))

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");
    }

//    |Static Block|                        (static block needs to be initialized first (new))

    static {
    System.out.println("Static Block");
    }

//    |Instance Block|                      (static block is the first thing to be compiled and needs no initialization)

    {
        System.out.println("Instance Block");
    }



    public static void main(String[] args) {

//        Static Block ---> is compiled (printed) w/out anything in the print statement

        new InstanceBlock();
//        Instance Block ---> must be called (in main method) to be executed

        new StaticBlock_vs_InstanceBlock_vs_Constructor();
//        Instance Block ---> once Constructor is called Instance Block is exec. first then Constructor is exec.
//        Constructor




    }


}
