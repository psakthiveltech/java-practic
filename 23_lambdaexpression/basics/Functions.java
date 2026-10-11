package lambdaexpression.basics;

import java.util.function.Function;

public class Functions {
    public static void main(String[] args){
        Function<String,Integer> s = name-> name.length();
        // <1,2> 1. is input, 2. is output.
        Function<Integer,Integer> f = n-> n*5 ;
        System.out.println(s.apply("all"));
        System.out.println(s.apply("kajsdfhgiuh"));
        System.out.println(s.apply("qwertyuioolkjhgfdsazxcvbnm"));
        System.out.println(s.apply(";alskdjf;lsakdjf;lkaskdjff;lkasdjfk;ljsdf"));
        System.out.println(f.apply(10));
        System.out.println(f.apply(100));
        System.out.println(f.apply(510));

    }
}
