package day13_practice_tasks_Inheritance.state_task;

public class Virginia extends State{
    public Virginia(String abbreviation, String politicalParty, String governor, String senator, int population) {
        super("VA", abbreviation, politicalParty, governor, senator, population);
    }
}
