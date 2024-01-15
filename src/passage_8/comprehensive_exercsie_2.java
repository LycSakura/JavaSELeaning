package passage_8;

/*跳动的心脏*/
public class comprehensive_exercsie_2 {
    public static void main(String[] args) {
        new Humen();
    }
}

class Humen {
    HEART heart = new HEART();

    public Humen() {
        heart.jump();
    }

    class HEART {
        void jump() {
            System.out.println("心脏在跳动");
        }
    }
}


