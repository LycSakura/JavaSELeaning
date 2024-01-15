package BOOK;
/*充电线接口*/
public class comprehensive_exercise_36 {
    public static void main(String[] args) {
        CAR car = new CAR();
        car.charge();

    }
}
interface USBRechargeable {
    void charge();
}
interface TypeCRechargeable{
    void charge();
}
class CAR implements USBRechargeable,TypeCRechargeable{
    @Override
    public void charge() {
        System.out.println("汽车上的USB接口和TypeC接口都能用于给手机充电");
    }
}
