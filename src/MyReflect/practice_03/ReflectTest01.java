package MyReflect.practice_03;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //加载数据
        Properties properties = new Properties();
        FileReader fileReader = new FileReader("D:\\java_project\\study\\code\\src\\MyReflect\\practice_03\\class.txt");
        properties.load(fileReader);
        fileReader.close();

        String className = properties.getProperty("className");
        String methodName = properties.getProperty("methodName");

        Class<?> aClass = Class.forName(className);
        Constructor<?> constructor = aClass.getConstructor();
        Object obj = constructor.newInstance();
        Method method = aClass.getMethod(methodName);
        method.invoke(obj);

    }
}
