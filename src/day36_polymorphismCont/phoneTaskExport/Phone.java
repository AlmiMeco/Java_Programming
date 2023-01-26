package day36_polymorphismCont.phoneTaskExport;

public class Phone {

    private String brand, model, color;
    private char size;
    private int price;


    public Phone(String brand, String model, String color, char size, int price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        if (price <= 0) {
            System.out.println("----> Invalid Price: " + price);
            System.exit(1);
        }
        this.price = price;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        if (color.equals("Black") || color.equals("White") || color.equals("Silver") || color.equals("Gold") || color.equals("Pink")) {
            this.color = color;

        }else {
            System.out.println("----> Invalid color: " + color + " color MUST be ... \"Black\", \"White\", \"Silver\", \"Gold\", \"Pink\"");
            System.exit(1);
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }


    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }


    public long call(long phoneNumb){
        System.out.println("Calling ... " + phoneNumb);
        return phoneNumb;
    }


    public long text(long phoneNumb){
        System.out.println("Texted ... " + phoneNumb);
        return phoneNumb;
    }
}
/* 1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
*/