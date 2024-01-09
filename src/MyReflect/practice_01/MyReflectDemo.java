package MyReflect.practice_01;

public class MyReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Student s1 = new Student();
        Class<? extends Student> c2 = s1.getClass();
        System.out.println(c2);

        Class<?> c3 = Class.forName("MyReflect.practice_01.Student");
        System.out.println(c3);
    }
}
