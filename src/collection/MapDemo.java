package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> values = new HashMap<>();
        values.put("Kothrud",411038);
        values.put("Bhusari Colony",411038);
        values.put("Vanaz",411038);
        System.out.println(values);
        System.out.println("PinCode for kothrud: "+values.get("Kothrud"));

        for (Map.Entry<String, Integer> map:values.entrySet()){
            System.out.println(" "+map);
        }
    }
}
