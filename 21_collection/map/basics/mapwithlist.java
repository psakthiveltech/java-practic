package collection.map.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static java.util.Arrays.asList;

public class mapwithlist {
    public static void main(String[] args){
        HashMap<String, List<String>> map = new HashMap<>();

        map.put("java",new ArrayList<>(asList("james","kumar","kathir")));
        map.put("c",asList("james","kumar","kathir"));
        map.put("c++",asList("james","kumar","kathir"));
        map.put("pyton",asList("james","kumar","kathir"));
        map.put("c#",asList("james","kumar","kathir"));
        int sno = 1;
        map.get("java").remove("james");
        for(String k : map.keySet()){

            System.out.println(sno+". "+k+" : "+map.get(k).get(0));
            sno++;
        }
    }
}
