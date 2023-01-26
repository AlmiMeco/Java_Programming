package day34_oopAbstractionCont.carTask;

public class Tesla extends Car{


    public Tesla(String model, int year, String color, int price) {
        super(model, year, color, price);
    }

    @Override
    protected void start() {
        System.out.println("Say \"Start\" to start " + getMake() + " " + getModel()  ) ;
    }


}
