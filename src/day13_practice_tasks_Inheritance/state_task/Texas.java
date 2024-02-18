package day13_practice_tasks_Inheritance.state_task;

public class Texas extends State{
    public Texas(String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("TX", abbreviation, politicalParty, governor, senator, population);
    }
}
