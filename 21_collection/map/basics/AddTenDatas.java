package collection.map.basics;

import java.util.HashMap;
import java.util.Map;

public class AddTenDatas {
    static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap();
        map.put("balu",0);
        map.put("viji",2);
        map.put("sur",1);
        map.put("spiderman",10);
        map.put("ironman",3);
        map.put("capAmerica",11);
        map.put("blackpanther",12);
        map.put("hulk",100);
        map.put("thor",10000);
        map.put("sakthimaan",4111);
        System.out.println(map.size());
        System.out.println(map.get("spiderman"));
        System.out.println(map.containsKey("ironman"));
        map.putIfAbsent("endgamethor",0);
        System.out.println(map);
        map.remove("endgamethor");
        System.out.println(map);
        System.out.println(map.values());
        map.put("hulk",400);
        System.out.println(map);
        map.put(null,10);
        map.put(null,10);
        map.put(null,10);
        System.out.println(map);
        System.out.println(map.entrySet());
        for(Map.Entry<String,Integer> m:map.entrySet()){
            if(m.getKey()=="ironman"){
                map.put("ironman",4500);
            }
            System.out.println(m);
        }
    }
}
