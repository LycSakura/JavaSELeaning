package BOOK;

/*汽车加油*/
public class practice_23 {
    public practice_23(int oilVolume, int leftOilVolume) {
        int addOilVolume = oilVolume - leftOilVolume;//要加的油量
        int time = 0;
        System.out.println("模拟加油过程和时间");
        while (addOilVolume != 0) {
            System.out.println("还要加的油量:" + addOilVolume + "L,已经过去的时间:" + time + "S");
            addOilVolume -= 2;//每5秒要加的油量减少2升
            time += 5;//每加2升油，时间加5秒
        }
        System.out.println("还要加的油量:" + addOilVolume + "L,已经过去的时间:" + time + "S");
    }

    public static void main(String[] args) {
        practice_23 am = new practice_23(30, 6);
    }
}
