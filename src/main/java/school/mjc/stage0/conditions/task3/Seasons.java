package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month > 13 || month <= 0) {
            System.out.println("wrong number!");
        }
        else if (month >= 6 && month <= 8) {
            System.out.println("Summer");
        }
        else if (month == 12 ||  month <= 2) {
            System.out.println("Winter");
        }
        else if (month >= 3 & month <= 5) {
            System.out.println("Spring");
        }
        else {
            System.out.println("Autumn");
        }
    }
}
