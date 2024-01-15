package passage_8;

/*让心脏成为内部类*/
public class People {
    public static void main(String[] args) {
        People people = new People();
        people.walk();
    }

    Heart heart = new Heart();

    void walk() {
        System.out.println("人类在走路");
        heart.heart();
    }

    class Heart {
        public void heart() {
            System.out.println("心脏在跳动");
        }
    }
}
