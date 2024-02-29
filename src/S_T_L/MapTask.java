package S_T_L;

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name ", "vicky");
        map.put("Age ","24");
        map.put("gender","male");

        System.out.println(map.get("name"));
        System.out.println(map.get("Age"));
        System.out.println(map.get("gender"));

        Map<String, Integer> map1 = new HashMap<String, Integer>();
        map1.put("Age ",24);
    map1.put("pincode ", 6410035);
        System.out.println(map1.get("pincode"));

        Map<Integer, Double> map2 = new HashMap<Integer, Double>();
        map2.put(0, 22.3);
        map2.put(1, 24.3);
        map2.put(2, 23.3);
        System.out.println(map2.get(2));

        map.keySet();

    }
}
