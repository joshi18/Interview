package Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMap {
    public  static void main(String[] args){
        Map<days,Integer> map = new EnumMap<>(days.class);

    }

    public enum days{
        MONDAY,TUESDAY,WENSDAY,THRUDAY,FRIDAY

    }
}
