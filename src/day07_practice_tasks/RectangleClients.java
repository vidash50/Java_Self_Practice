package day07_practice_tasks;

public class RectangleClients {

    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle();
        rectangle1.length = 4.2;
        rectangle1.width = 2.0;

        System.out.println("rectangle1.calculateArea() = " + rectangle1.calculateArea());

        System.out.println("rectangle1.calculatePerimeter() = " + rectangle1.calculatePerimeter());


    }
}
