package BOOK;



/*创建月球类*/
public class practice_43 {
    public static void main(String[] args) {
        Moon moon = new Moon("月亮", "比地球小");
        System.out.println(moon.reflect());
    }
}

final class Moon {
    String name;
    String charateritic;

    public Moon(String name, String charateritic) {
        this.name = name;
        this.charateritic = charateritic;
    }


    public String reflect() {
        return this.name + "周围没有卫星";
    }
}