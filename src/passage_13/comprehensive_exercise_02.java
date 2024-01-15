package passage_13;

public class comprehensive_exercise_02 {
    public static void main(String[] args) {
        Toilet<Man> manroom = new Toilet<>();
        Toilet<Woman> womanroom = new Toilet<>();
    }
}

class Toilet<T> {
    public void enter(T t) {
    }
}

class Man{}
class Woman{}