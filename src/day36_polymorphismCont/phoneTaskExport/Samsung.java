package day36_polymorphismCont.phoneTaskExport;

public class Samsung extends Phone {


    public Samsung(String model, String color, char size, int price) { // model not called in const bc model is Static : model will always be Samsung
        super("Samsung", model, color, size, price);
        //    Static 'Samsung' brand : all other parameters must always be defined for each separate object
    }

    public void freeze(){
        System.out.println(getBrand() + " " + getModel() + " freezes a lot");
    }

    public static void main(String[] args) {

        Samsung samsung = new Samsung("S12", "White", 'M', 1200);

        System.out.println(samsung);
//        ---> Samsung{brand='Samsung', model='S12', color='White', size=M, price=1200}

        samsung.freeze();
//        ---> Samsung S12 freezes a lot



    }

}
