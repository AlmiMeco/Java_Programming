package day36_polymorphismCont.phoneTaskExport;

public class Nokia extends Phone{

    public Nokia(String model, String color, char size, int price) {
        super("Nokia", model, color, size, price);
    }

    public void selfDefense(){
        System.out.println(getBrand() + " " + getModel() + " can be used for self defense");
    }
}
