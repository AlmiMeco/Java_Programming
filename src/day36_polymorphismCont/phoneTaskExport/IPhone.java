package day36_polymorphismCont.phoneTaskExport;

public class IPhone extends Phone {

    public IPhone(String model, String color, char size, int price){ // no constructor applied meaning all IPhone objects created will have the same Values
        super("Apple", model, color, size, price);

    }


    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + " " +getModel() + " is facetiming with " + phoneNumber);
    }

    public void faceTime(String email){
        System.out.println();
    }

}
/* Extra methods:
			faceTime(phoneNumber)
			faceTile(email)
*/