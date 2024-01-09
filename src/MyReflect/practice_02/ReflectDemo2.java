package MyReflect.practice_02;

import java.io.IOException;
import java.lang.reflect.Constructor;

public class ReflectDemo2 {
    public static void main(String[] args) throws Exception {
        Class<?> c1 = Class.forName("MyReflect.practice_01.Student");
        Constructor<?> constructor = c1.getConstructor(String.class, int.class, String.class);
        Object o = constructor.newInstance("刘X文", 10, "东莞");
        System.out.println(o);
    }
}
