package inheritance.b.multiple;

public class Childclass extends ParentOne {
    public void methodfive(){
        System.out.println("method five (children)");
    }
    public void methodsix(){
        System.out.println("method six (children)");
    }
    public static void main(String[] args){
        Childclass c = new Childclass();
        c.methodOne();
        c.methodTwo();
        c.methodThree();
        c.methodFour();
        c.methodfive();
        c.methodsix();
    }


}
