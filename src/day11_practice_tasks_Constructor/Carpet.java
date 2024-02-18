package day11_practice_tasks_Constructor;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;


    public double calCost(){
        return  (width * length * unitPrice) + (isPersian? 200 : 0);

    }

    public Carpet(double width, double length, double unitPrice) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
    }

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                '}';
    }
}
