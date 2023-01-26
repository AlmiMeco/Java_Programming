package day27_accessModifiers;

public class AccessModifiers {

//    |Public Access Modifier|     (Accessible in class, pkg, subclass, and world)
    public static int publicData = 21; // (public keyword)

//    |Protected Access Modifier|  (Accessible in class, pkg, and subclass)
    protected static int protectedData = 12; // (protected keyword)

//    |Default Access Modifier|    (Accessible in class, and pkg)
     static int defaultData = 10; // (no keyword * for variables *)

//     |Private Access Modifier|   (Accessible in class only)
    private static int privateData = 69; // (private keyword)



    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(protectedData);
        System.out.println(defaultData);
        System.out.println(privateData);



    }


}
