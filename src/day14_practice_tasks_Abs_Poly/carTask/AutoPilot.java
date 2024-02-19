package day14_practice_tasks_Abs_Poly.carTask;

import day14_practice_tasks_Abs_Poly.carTask.AutoPark;

public interface AutoPilot extends AutoPark {

    boolean hasAutoPilot = true;

    public abstract void selfDrive();

}
/*

3. Create a Child Interface of AutoPark Named 'AutoPilot':
    - Note: Use the 'extends' keyword for inheritance.
    - Variables:
        - hasAutoPilot
    - Abstract Method:
        - selfDrive()
 */