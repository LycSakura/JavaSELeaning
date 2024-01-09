package passage_14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*找出所有工资大于5000的女员工*/
public class practice_05 {
    public static void main(String[] args) {
//        List<Employee> list = Employee.getEmoList();//获取公共类的测试数据
//        Stream<Employee> stream = list.stream();//获取集合流对象
//        stream = stream.filter(people -> people.getSex().equals("女"));//将女的过滤出来
//        List<Employee> girl = stream.toList();//将流对象重新封装成一个List集合
//
//        Stream<Employee> stream1 = girl.stream();//获取员工全为女的集合
//        stream1 = stream1.filter(people ->people.getSalary() > 5000);//将女员工工资大于5000的过滤出来
//        List<Employee> result =  stream1.toList();//将流对象重新封装成一个List集合
//
//        for(Employee emp : result){
//            System.out.println(emp);
//        }
        List<Employee> list = Employee.getEmoList();
        Stream<Employee> stream = list.stream();
        stream = stream.filter(e -> e.getSex().equals("女")).filter(e -> e.getSalary() > 5000);
        stream.forEach(System.out::println);
    }
}
