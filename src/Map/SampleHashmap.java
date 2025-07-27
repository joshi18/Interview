package Map;

import streamapi.Employee;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class SampleHashmap {

    public static void main(String[] args) {

        // Hashmap is also not a thread safe
        HashMap<Integer,String> abc =  new HashMap<>();
        abc.put(1,"abhijit");
        abc.put(2,"joshi");
        abc.put(3,"okbbe");

        System.out.println(abc.containsKey(1));
        System.out.println(abc.get(0));

         Set<Integer> Keys = abc.keySet();
         for(int i : Keys){
             System.out.println(abc.getOrDefault(i,"defaultValue"));
         }

         Set<Map.Entry<Integer, String>> entryset = abc.entrySet();
         for(Map.Entry<Integer, String> i: entryset){
             i.setValue(i.getValue().toUpperCase());

         }
        System.out.println(entryset);

        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();// double linked list
        map.put("abcder",12);
        map.put("vmvkdfrm",90);
        // order maitained in this map
        // not a thread safe
        System.out.println(map);
        map.remove("abcder");
        System.out.println(map);


        // indentity hashmap

        IndetityHashMap<Integer,String> map1 = new IndetityHashMap<Integer, String>();

        HashMap<String, Integer> map3 = new HashMap<>();
        String key3 = new String("HashMap");// hasjcode => 102302
        String Key  = new String("HashMap"); //hasjcode => 102302

        map3.put(key3,10);
        map3.put(Key,100);
        System.out.println(map3);
        //here we are updating the values because same key is present. Hashcode gerenated is also same, so index bhi same hoga.
        // we have updated the key value only. // here we are using equals method.

        Map<String, Integer> map9 = new IdentityHashMap<>();

        String key7 = new String("HashMap");
        String Key9  = new String("HashMap");
        //identihashcode and == method is used.
        // indentity hashcode is genereted are different. so they are stored in different hashcode.
        map9.put(key7,10);
        map9.put(Key9,100);
        System.out.println(map9);

        List<Employee> ok = new ArrayList<>();
        Employee.getEmployeeList();
        ok.sort((o1,o2)->{
            if (o1.getSalary()> o2.getSalary()){
                return 1;
            }
            else if (o1.getSalary() == o2.getSalary()){
                return 0;
            }
            else {
                return -1;
            }
        });
        System.out.println(ok);

        Map<String,Integer> abcd = new ConcurrentHashMap<>();
        abcd.put("abcds",2);
        abcd.put("okbya",4);

        // It is synchronized and thread safe.






    }

}
