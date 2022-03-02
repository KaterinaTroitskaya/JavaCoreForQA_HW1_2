package HW1;

import java.util.Arrays;

public class Team  {
    private String name;
    private String[] composition = new String[4];
    private String[] winners;

    public Team (String name, String player1, String player2, String player3, String player4) {
        this.name = name;
        composition[0] =player1;
        composition[1] = player2;
        composition[2] = player3;
        composition[3] = player4;
        winners = composition;





    }

    public String[] getComposition() {
        return composition;
    }

    public void printComposition (){
        System.out.println("Состав команды "+ this.name+ ":" + Arrays.toString(composition));
        System.out.println("Состав команды "+ this.name+ ":" + Arrays.toString(winners));
    }

    public void letsGo (int leap){
        for (int i=0; i< winners.length; i++) {
            int strength = ((int) (Math.random() * 30));
            if (strength<=leap){
                winners[i] = "";
            }
        }
    }
    public void printWinners (){
        System.out.println("Состав команды "+ this.name+ ":" + Arrays.toString(winners));
    }

}
