package day12_practice_tasks_OOP_Encap;

public class Rectangle {

    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return  width;
    }

    public void setWidth(int width) {
        if (width <= 0){
            System.out.println("width cannot be negative or zero");
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length <= 0){
            System.out.println("Length value cannot be negative or zero");
        }
        this.length = length;
    }

    public double calcArea(){
        return length*width;
    }

    public double calcPerimeter(){
        return 2 * (length * width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }
}
/*
2. Create a custom class named Rectangle with the following specifications:

	Attributes:
		width
		length

	Ensure encapsulation for both fields.
		Conditions:
			The width and length cannot be set to negative or zero values.

	Add a constructor that allows the user to set both fields during object creation.

	Actions:
		calcArea(): Calculates and returns the area of the rectangle object.
		calcPerimeter(): Calculates and returns the perimeter of the rectangle object.
		toString(): Displays the width, length, area, and perimeter of the rectangle when the object is printed.

	Create another class named RectangleClients, create multiple rectangle objects, and test each function of the rectangle object
 */