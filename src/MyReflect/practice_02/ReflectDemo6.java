package MyReflect.practice_02;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class ReflectDemo6 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        Class<? extends ArrayList> aClass = arrayList.getClass();
        Method add = aClass.getMethod("add", Object.class);
        add.invoke(arrayList, "hello");
        add.invoke(arrayList, "world");
        add.invoke(arrayList, "java");

        System.out.println(arrayList);

    }
}
