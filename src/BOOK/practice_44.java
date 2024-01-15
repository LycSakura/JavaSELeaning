package BOOK;

/*交通信号灯*/
public class practice_44 {
    public static void main(String[] args) {
        Passerby armedPolice = new Passerby("行人");
        System.out.println(armedPolice.obey());
        NonMotorVehicle peoplePolice = new NonMotorVehicle("非机动车");
        System.out.println(peoplePolice.obey());
        MotorVehicle trafficPolice = new MotorVehicle("机动车");
        System.out.println(trafficPolice.obey());
    }
}

class Traffic {
    String actor;

    public Traffic(String actor) {
        this.actor = actor;
    }

    public final String obey() {
        return this.actor + "红灯停，绿灯行";
    }
}

class Passerby extends Traffic {
    public Passerby(String actor) {
        super(actor);
    }
}

class NonMotorVehicle extends Traffic {
    public NonMotorVehicle(String actor) {
        super(actor);
    }
}

class MotorVehicle extends Traffic {
    public MotorVehicle(String actor) {
        super(actor);
    }
}
