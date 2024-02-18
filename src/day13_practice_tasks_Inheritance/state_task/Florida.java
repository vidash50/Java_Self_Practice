package day13_practice_tasks_Inheritance.state_task;

public class Florida extends State{
    public Florida(String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("FL", abbreviation, politicalParty, governor, senator, population);
    }
}
