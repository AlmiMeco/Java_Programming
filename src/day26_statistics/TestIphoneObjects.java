package day26_statistics;

public class TestIphoneObjects {

    public static void main(String[] args) {

        Iphone phone = new Iphone("IPhone 13 ", 1200);


//        |Instance Variable|
        System.out.println(phone.price);


//        |Static Variable called thru initialized Object|
        System.out.println(phone.brand);      // unnecessary to call Statics thru Obj.
        System.out.println(phone.madeIn);
//   ----------------------------------------------------
//        |Stativ Variable called thru className|
        System.out.println(Iphone.brand);    // preferred way to call Statics
        System.out.println(Iphone.madeIn);






    }

}
