package lambdaexpression.basics;

import java.util.function.Consumer;

public class Consumers {
    public static void main(String[] args){
        Consumer<Integer> c = v-> System.out.println(v);
        c.accept(10);
        c.accept(11);
        c.accept(44);
        c.accept(78);
        c.accept(41);
    }
}
