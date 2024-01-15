package passage_14;

import java.util.List;
import java.util.stream.Stream;

/*统计男员工的总人数*/
public class practice_04 {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmoList();//获取公共类的测试数据
        Stream<Employee> stream = list.stream();//获取集合流对象
        stream = stream.filter(people -> people.getSex().equals("男"));//将男员工过滤出来
//        List<Employee> result = stream.toList();//将流对象重新封装成一个List集合
//        int count = 0;
//        for (Employee employee : result) {
//            System.out.println(employee);
//            count++;
//        }
//        System.out.println("男员工有:" + count + "个");
        System.out.println("男员工有:" + stream.count() + "个");
    }
}
