package day03_practice_tasks;

public class Rectangle {
    public static void main(String[] args) {

        double length = 4.5;
        double width = 2;

        double areaOfRectangle = length * width;

        System.out.println("The area of the rectangle = " + areaOfRectangle);

        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }
}
