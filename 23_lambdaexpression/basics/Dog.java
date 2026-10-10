package lambdaexpression.basics;

public class Dog {
    public static void main(String[] args){
    Animal a = ()-> System.out.println("Eat and alive");;
    a.eat();
    }
}
