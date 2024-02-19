package day14_practice_tasks_Abs_Poly.carTask;

public interface Flyable {

    boolean canFly = true;

    void fly();

}
/*
4. Create an Interface Named 'Flyable':
    - Variable:
        - canFly
    - Abstract Method:
        - fly()

5. Create a Subclass of Car Named 'Toyota'.
6. Create a Subclass of Car Named 'Honda'.
7. Create a Subclass of Car Named 'BMW'.
8. Create two Subclasses of Car ('Audi' and 'Mercedes') that Implement the AutoPark Interface.
9. Create two Subclasses of Car ('Tesla' and 'Nio') that Implement both AutoPark and AutoPilot Interfaces.
10. Create a Subclass of Car Named 'CydeoCar' that Implements AutoPark, AutoPilot, and Flyable Interfaces.
11. Create a Class Named 'CarClients':
    - Instantiate an object from each concrete class.
    - Test all functions of each object.
    - Analyze the relationships between the classes.
 */