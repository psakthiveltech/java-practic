package lambdaexpression.basics;

import java.util.function.Supplier;

public class Suppiler {
    public static void main(String[] args){
        Supplier<String> s = ()-> "vanakam da maple";
        Supplier<Double> c = ()->  Math.random();
        System.out.println(s.get());
        System.out.println(c.get());
        System.out.println(c.get());
        System.out.println(c.get());
    }
}
