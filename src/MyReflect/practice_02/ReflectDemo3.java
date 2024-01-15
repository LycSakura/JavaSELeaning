package MyReflect.practice_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<?> c1 = Class.forName("MyReflect.practice_01.Student");
//        Field[] fields = c1.getFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }
        Field address = c1.getField("address");
        Constructor<?> constructor = c1.getConstructor();
        Object o = constructor.newInstance();
        address.set(o, "东莞");
        System.out.println(o);

    }
}
