package lambdaexpression.basics;

public class multiStatement {
    public static void main(String[] args){
        GreetingName g = name->{
            System.out.println("Hi");
            System.out.println("how are you "+name);
            System.out.println("bye");
            return name;
        };
        g.sayHello("bale");
    }
}
