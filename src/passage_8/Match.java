package passage_8;
/*划火柴*/

interface Light {
    void light();
}

public class Match {
    public static void main(String[] args) {
        new Match() {
            public void light() {
                System.out.println("点燃火柴");
            }
        }.light();
    }
}
