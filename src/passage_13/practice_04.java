package passage_13;

public class practice_04 {
    public static void main(String[] args) {
        Miami<Object> miami = new Miami<>();
        miami.setName("迈阿密热火队");
        miami.setYears("2006、2012、2013");
        miami.setTimes(3);

        System.out.println("NBA中夺冠次数为" + miami.getTimes() + "次的球队及夺冠年份:");
        System.out.println(miami.getName() + "(" + miami.getYears() + ")");

        Detroit detroit = new Detroit();
        System.out.println(detroit.getName() + "(" + detroit.getYears() + ")");

        Philadelphia philadelphia = new Philadelphia();
        System.out.println(philadelphia.getName() + "(" + philadelphia.getYears() + ")");

    }
}

class Miami<T> {
    private T name;
    private T years;
    private T times;

    public Miami() {
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public T getYears() {
        return years;
    }

    public void setYears(T years) {
        this.years = years;
    }

    public T getTimes() {
        return times;
    }

    public void setTimes(T times) {
        this.times = times;
    }
}

class Detroit extends Miami<String> {
    @Override
    public String getName() {
        return "底特律活塞队";
    }

    @Override
    public String getYears() {
        return "1989、1990、2004";
    }
}

class Philadelphia extends Miami<String> {
    @Override
    public String getName() {
        return "费城76人队";
    }

    @Override
    public String getYears() {
        return "1955、1967、1983";
    }
}

