package collection.map.basics;

import java.util.HashMap;

public class CalculateTotal {
    static void main(String[] args) {
        HashMap<String,Integer> bunny = new HashMap<>();
        bunny.put("carrot",50);
        bunny.put("tomato",20);
        bunny.put("betroot",30);
        System.out.println(bunny);
        Integer totalCarrot = bunny.get("carrot")*2;
        Integer totalBetroot = bunny.get("betroot");
        bunny.remove("tomato");
        System.out.println("Your total amount is : "+(totalBetroot+totalCarrot) + "₹");
    }
}
