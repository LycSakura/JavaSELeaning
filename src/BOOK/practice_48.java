package BOOK;

/*五颜六色的接口*/
public class practice_48 {
    public static void main(String[] args) {
        RedLights red = new RedLights();
        red.shine();
        YellowLights yellow = new YellowLights();
        yellow.shine();
        GreenLights green = new GreenLights();
        green.shine();

    }
}

interface Colorful {
    void shine();
}

abstract class Light {
}

class RedLights extends Light implements Colorful {
    @Override
    public void shine() {
        System.out.println("红灯发红光");
    }
}

class YellowLights extends Light implements Colorful {
    @Override
    public void shine() {
        System.out.println("黄灯发黄光");
    }
}

class GreenLights extends Light implements Colorful {
    @Override
    public void shine() {
        System.out.println("绿灯发绿光");
    }
}