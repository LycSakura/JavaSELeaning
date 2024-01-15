package passage_12;

import java.util.ArrayList;


/*模拟用户取款*/
class comprehensive_exercsie_02 {
    public static void main(String[] args) {
        System.out.println("存取款时间\t存入\t֧取出\t余额");
        ArrayList<Account> list = new ArrayList<>();
        list.add(new Account("2017-05-06", 2000, 0));
        list.add(new Account("2017-05-18", 0, 1000));
        list.add(new Account("2017-06-08", 5000, 0));
        list.add(new Account("2017-06-23", 0, 1500));
        list.add(new Account("2017-07-03", 3000, 0));
        list.add(new Account("2017-07-19", 0, 1000));
        list.add(new Account("2017-08-01", 1000, 0));
        list.add(new Account("2017-08-10", 0, 1500));
        for (Object message : list) {
            System.out.println(message + "\t");
        }

    }
}

class Account {
    String time;
    int in;
    int out;
    int left;

    public Account(String time, int in, int out) {
        this.time = time;
        this.in = in;
        this.out = out;
    }

    public String toString() {
        left += in - out;
        return time + "\t" + in + "\t" + out + "\t" + left;
    }
}

