package MyReflect.practice_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> c = Class.forName("MyReflect.practice_01.Student");

//        Method[] methods = c.getMethods();
        Method[] declaredMethods = c.getDeclaredMethods();

        for (Method method : declaredMethods) {
            System.out.println(method);
        }
        System.out.println("---------");

        Method method1 = c.getMethod("method1");
        Constructor<?> constructor = c.getConstructor();
        Object o = constructor.newInstance();
        method1.invoke(o);
    }
}
