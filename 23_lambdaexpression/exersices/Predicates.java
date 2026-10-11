package lambdaexpression.basics;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args){
        Predicate<Integer> p = n->n>=10;
        System.out.println(p.test(10));
        System.out.println(p.test(4641));
        System.out.println(p.test(0));
        Predicate<String> s = c->c.length()>10;
        System.out.println(s.test("jajayayayjajay"));
        System.out.println(s.test("jajayay"));
    }
}
