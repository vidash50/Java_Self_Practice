package day14_practice_tasks_Abs_Poly.deviceTask;

public abstract class Phone extends Device{
    long call;
    long text;

    public Phone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void turnOn(){
        System.out.println(getBrand()+ " "+ getModel()+ " is turned on");
    }
    public void turnOff(){
        System.out.println(getBrand()+ " "+ getModel()+ " is turned off");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "call='" + call + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
/*
2. Create a Child Abstract Class of Device Named 'Phone':
    - Extra Non-Abstract Methods:
        - call(long phoneNum)
        - text(long phoneNum)
        - toString()
 */