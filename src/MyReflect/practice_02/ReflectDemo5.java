package MyReflect.practice_02;

import MyReflect.practice_01.Student;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("MyReflect.practice_01.Student");
//        Student s = new Student();
        Constructor<?> constructor = aClass.getConstructor();
        Object s = constructor.newInstance();
        Method method1 = aClass.getMethod("method1");
//        s.method1()
        method1.invoke(s);

//        s.method2("林青霞");
        Method method2 = aClass.getMethod("method2", String.class);
        method2.invoke(s, "林青霞");

//        ss = s.method3("林青霞",18)
        Method method3 = aClass.getMethod("method3", String.class, int.class);
        Object ss = method3.invoke(s, "林青霞", 18);
        System.out.println(ss);

//        s.function()
        Method function = aClass.getDeclaredMethod("function");
        function.setAccessible(true);
        function.invoke(s);

    }
}
