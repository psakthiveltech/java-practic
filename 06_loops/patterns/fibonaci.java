package loops.forloop.patterns;

import java.util.*;

public class fibonaci {

    public static int fiboonacinum(int n){

        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);

        if(n==1){
            return 0;
        }

        for(int i=2;i<n;i++){
                list.add(list.get(i-2)+list.get(i-1));

        }
        System.out.println(list);
        return list.get(list.size()-1);
    }

    public static void main(String[] argd){
        System.out.print(fiboonacinum(4));

    }
}
