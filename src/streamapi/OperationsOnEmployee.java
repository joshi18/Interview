package streamapi;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OperationsOnEmployee {

    public static void main(String[] args) {
        List<Employee> employeeList = Employee.getEmployeeList();
        List<Employee> employeeList1 = employeeList.stream().sorted((a1, a2) -> (int) (a1.getSalary() - a2.getSalary())).collect(Collectors.toList());
        //System.out.println(employeeList1);
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
        System.out.println(employeeList.stream().collect(Collectors.groupingBy(s -> s.getSalary(), Collectors.filtering(a -> a.getSalary() > 100000, Collectors.counting()))));
        System.out.println(employeeList.stream()
                .collect(Collectors
                        .groupingBy
                                (x -> x.getDepartment(), Collectors.maxBy(Comparator.comparing(x -> x.getSalary())))));
    }
}
