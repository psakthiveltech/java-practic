package lambdaexpression.basics;

public class mansays{
    public static void main(String[]args) {


                Greetings g = () -> {
            System.out.println("they hello");
        };
                g.sayHello();
    }
}
