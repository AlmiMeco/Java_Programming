package day25_constructor;

public class TestRectangleObjects {

    public static void main(String[] args) {

        /* Rectangle rect1 = new Rectangle();

        System.out.println(rect1);

        rect1.setInfo(12,10);

        System.out.println(rect1);  */


        /* YOU would have to call setInfo method for each iteration of Rectangle method */


       /* Rectangle rect2 = new Rectangle();
        rect2.setInfo(8,6);
        Rectangle rect3 = new Rectangle();
        rect3.setInfo(10,8);
        Rectangle rect4 = new Rectangle();
        Rectangle rect5 = new Rectangle();  */


//        |Using Parameterized Constructor we make it MUCH easier to create Objects|
//  -------------------------------------------------------------------------------------
        Rectangle rectangle1 = new Rectangle(12, 10);
        System.out.println(rectangle1);

        Rectangle rectangle2 = new Rectangle(10, 8);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(22, 13);
        System.out.println(rectangle3);

        Rectangle rectangle4 = new Rectangle(30, 22);
        System.out.println(rectangle4);



    }

}
