package BOOK;

/*总统是不是公务员*/
public class practice_40 {
    public static void main(String[] args) {
        President president = new President();
        PublicServent publicServent = new PublicServent();
        if (president instanceof PublicServent) {
            System.out.println("总统是公务员");
            president.work();
            publicServent.work();
        } else {
            System.out.println("总统不是公务员");
        }
    }
}

class President extends PublicServent {
    @Override
    public void work() {
        System.out.println("总统主要处理国家大事");
    }
}

class PublicServent {
    public void work() {
        System.out.println("公务员主要为人民服务");
    }

}

