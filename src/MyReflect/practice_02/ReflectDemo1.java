package MyReflect.practice_02;

import java.lang.reflect.Constructor;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> c = Class.forName("MyReflect.practice_01.Student");
//        Constructor<?>[] constructors = c.getConstructors();
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
    }
}
