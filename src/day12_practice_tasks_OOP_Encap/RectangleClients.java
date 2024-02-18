package day12_practice_tasks_OOP_Encap;

public class RectangleClients {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(3, 4);
        System.out.println(rectangle1.calcPerimeter());

        Rectangle rectangle2 = new Rectangle(3, 4);
        System.out.println(rectangle2);

        Rectangle rectangle3 = new Rectangle(0, 4);
        System.out.println(rectangle3.calcPerimeter());

        System.out.println(rectangle1.getWidth());
        System.out.println("rectangle2 = " + rectangle2.calcArea());
        System.out.println(rectangle3.getLength());
    }
}
