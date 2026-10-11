package lambdaexpression.basics;

public class basicLam {
    public static void main(String[]args){
        Greetings g = ()-> {
            System.out.println("hi HELLO");
        };
        g.sayHello();
    }
}
