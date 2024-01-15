package BOOK;

/*动物分类*/
public class practice_38 {
    public static void main(String[] args) {

        Animal animal1 = new Eagle();
        animal1.setName("老鹰");
        System.out.println(animal1.getName());
        animal1.eat();

        Animal animal2 = new Frog();
        animal2.setName("青蛙");
        System.out.println(animal2.getName());
        animal2.eat();

        Animal animal3 = new Grasshopper();
        animal3.setName("蝗虫");
        System.out.println(animal3.getName());
        animal3.eat();
    }
}

class Animal {
    private String name;

    public void eat() {
        System.out.println("动物会吃东西");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Eagle extends Animal {
    @Override
    public void eat() {
        System.out.println("老鹰吃小鸡");
    }
}

class Frog extends Animal {
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }
}

class Grasshopper extends Animal {
    @Override
    public void eat() {
        System.out.println("蝗虫吃稻米");
    }
}


