package passage_14;

import java.util.Collections;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*找出大于平均年龄的员工*/
public class comprehensive_exercise_02 {
    public static void main(String[] args) {
        List<Employee> list = Employee.getEmoList();
        double ageAvg = list.stream().collect(Collectors.averagingDouble(Employee::getAge));
//        DoubleSummaryStatistics s = list.stream().collect(Collectors.summarizingDouble(Employee::getAge));
//        double average_age = s.getAverage();
//        Stream<Employee> stream = list.stream();
//        stream = stream.filter(people -> people.getAge() > average_age);
//        List<Employee> result = stream.toList();
//        for (Employee employee : result) {
//            System.out.println(employee);
//        }
        list.stream().filter(people -> people.getAge() > ageAvg).forEach(System.out::println);
    }
}
