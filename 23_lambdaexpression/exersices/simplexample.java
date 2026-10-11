package lambdaexpression.basics;
import java.util.*;
public class simplexample {


    public static void main(String[]a){
        List<Integer>list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i*2);
        }
        list.forEach(n->System.out.println(n+" iteration : "+n));
    }
}
