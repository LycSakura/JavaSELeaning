package passage_13;

/*通道提示*/
public class comprehensive_exercise_03 {
    public static void main(String[] args) {
        Staff staff = new Staff();
        Customer customer = new Customer();
        Entrance<Object> customerEntrance = new Entrance<>();

        customerEntrance.enter(customer);
        customerEntrance.enter(staff);
    }
}

class Entrance<T> {
    public void enter(T t) {
        if (t instanceof Customer) {
            System.out.println("顾客不能进入通道");
        }
    }
}

class Customer{}
class Staff{}
