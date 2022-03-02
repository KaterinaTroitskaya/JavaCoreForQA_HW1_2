package HW1;

public class Main {
    public static void main(String[] args) {
        Team team1 = new Team("team", "Vasya", "Petya", "Masha", "Olya");
        team1.printComposition();
        Course course1 = new Course();
        course1.printACourse();
        course1.doIt(team1);
        team1.printWinners();

    }





 }

