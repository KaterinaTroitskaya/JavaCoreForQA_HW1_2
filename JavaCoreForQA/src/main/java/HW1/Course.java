package HW1;

import java.util.Arrays;


public class Course {
    private final int[] leaps = new int[4];

    public Course() {
        for (int i = 0; i < leaps.length; i++) {
            this.leaps[i] = ((int) (Math.random() * 10));
        }
    }

    public void printACourse() {
        System.out.println(Arrays.toString(this.leaps));
    }

    public void doIt(Team team) {
        for (int leap : leaps) {
            team.letsGo(leap);
        }
    }


}
