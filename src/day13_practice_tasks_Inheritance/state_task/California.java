package day13_practice_tasks_Inheritance.state_task;

public class California extends State{
    public California(String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("CA", abbreviation, politicalParty, governor, senator, population);
    }
}
