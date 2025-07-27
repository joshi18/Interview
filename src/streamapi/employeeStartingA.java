package streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class employeeStartingA {
 public List<String> getListOfnamesStratingwithA(){
     List<String> abc = new ArrayList<>();
     abc.add("Abhijit");
     abc.add("Ok");
     abc.add("Devashish");
     abc.add("StringApi");
     abc.add("abhijit");

     List <String> namesStartingA = abc.stream().filter(a->a.toUpperCase().startsWith("A")).collect(Collectors.toList());
     return namesStartingA;

 }

}
