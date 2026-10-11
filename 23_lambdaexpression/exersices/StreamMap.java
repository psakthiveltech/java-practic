package lambdaexpression.basics;

import java.util.ArrayList;

public class StreamMap {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        list.stream()
                .map(i->i*4)
                .forEach(i-> System.out.println(i));
    }
}
