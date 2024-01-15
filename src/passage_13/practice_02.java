package passage_13;

import java.util.Scanner;

/*星期枚举*/
public class practice_02 {
    public static void main(String[] args) {
        Week[] week1 = Week.values();
        for (Week value : week1) {
            System.out.println(value + ":" + value.getName());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要查询的英文星期简写:");
        Week week = Week.getWeek(sc.next());

        switch (week) {
            case MONDAY -> System.out.println("MONDAY ----- " + week.getName());
            case TUSEDAY -> System.out.println("TUESDAY ----- " + week.getName());
            case WEDNESDAY -> System.out.println("WEDNESDAY ----- " + week.getName());
            case THURSDAY -> System.out.println("THURSDAY ----- " + week.getName());
            case FRIDAY -> System.out.println("FRIDAY -----" + week.getName());
            case SATURDAY -> System.out.println("SATURDAY -----" + week.getName());
            case SUNDAY -> System.out.println("SUNDAY -----" + week.getName());
            default -> throw new IllegalStateException("Unexpected value: " + week);

        }
        sc.close();
    }
}

enum Week {
    MONDAY("星期一"), TUSEDAY("星期二"), WEDNESDAY("星期三"), THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期天");
    private final String week;

    Week(String week) {
        this.week = week;
    }

    public String getName() {
        return week;
    }

    public static Week getWeek(String week) {
        switch (week) {
            case "mon" -> {
                return Week.MONDAY;
            }
            case "tues" -> {
                return Week.TUSEDAY;
            }
            case "wed" -> {
                return Week.WEDNESDAY;
            }
            case "thur" -> {
                return Week.THURSDAY;
            }
            case "fri" -> {
                return Week.FRIDAY;
            }
            case "sat" -> {
                return Week.SATURDAY;
            }
            case "sun" -> {
                return Week.SUNDAY;
            }
            default -> throw new IllegalStateException("Unexpected value: " + week);
        }
    }
}

