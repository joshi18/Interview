package streamapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class freanquencyOfNumbers {

    public void getFrenquencyOfNumbers(){
        List<Integer> abc = new ArrayList<>();
        abc.add(1);
        abc.add(2);
        abc.add(3);

        
        abc.add(3);
        abc.add(4);
        abc.add(5);

        Map<Integer,Long> map = abc.stream().collect(Collectors.groupingBy(num->num ,Collectors.counting()));
        map.forEach((key,value)-> System.out.println("key"+key+"value"+value));



    }
}
