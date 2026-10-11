package lambdaexpression.basics;

public class CalculatorAddfun {
    public static void main(String[]args){
//        Calculator c = (a,b)->{
//            System.out.println(a+b);
//        };

        Calculator v =(a,b)->a+b;
//        c.add(10,999);
        System.out.println(v.add(10,999));
    }
}
