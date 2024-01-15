package passage_9;

import java.util.Scanner;

public class Message {
    private String name;
    private int age;

    public Message() {
    }

    public Message(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("输入用户的姓名:");
                String name = sc.nextLine();
                System.out.println("输入用户的年龄:");
                int age = Integer.parseInt(sc.nextLine());
                System.out.println("\n姓名:" + name + "\t年龄:" + age );
                flag = false;
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.err.println("请重新输入");
            }finally {
                sc.reset();
            }
        }
    }
}