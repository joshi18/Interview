package src.CoreJava;

import CoreJava.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamAppiQuaetions {
    public static void main(String[] args) {
        List<CoreJava.Employee> abc = new ArrayList<>();
        abc.add(new Employee(1, "Abhijit"));
        abc.add(new Employee(2, "Ahiit"));
        abc.add(new Employee(3, "Abijit"));
        abc.add(new Employee(4, "Abhit"));
        abc.add(new Employee(5, "Abhij"));

        Optional<Integer> hjk = abc.stream()
                .sorted((a, b) -> b.getId() - a.getId())
                .map(h -> h.getId())
                .skip(1)
                .findFirst();
        System.out.println(hjk.get());

//        Find the details of the oldest male employee in the "Product Development" department.

        List<DepartMent> jk = new ArrayList<>();
        jk.add(new DepartMent(1, "Abhijit", 100000, "Scientce"));
        jk.add(new DepartMent(1, "Abhijit", 200000, "Product"));
        jk.add(new DepartMent(1, "Abhijit", 300000, "Maths"));
        jk.add(new DepartMent(2, "Abhijit", 400000, "Product"));
        jk.add(new DepartMent(1, "Abhijit", 500000, "Scientce"));

        List<Optional<DepartMent>> abjk = jk.stream()
                .collect(Collectors.groupingBy(a -> a.getDepartment()))
                .entrySet()
                .stream()
                .filter(a -> a.getKey() == "Product")
                .map(b -> b.getValue())
                .map(p -> p.stream().sorted((i, o) -> o.salary - i.salary).findFirst())
                .toList();
        System.out.println(abjk.getFirst().get());

    }
}
