package inheritance.a.singlelevel;

public class ChildrenClass extends ParentClass {
    public void methodThree(){
        System.out.println("Method 3 (Children)");
    }
    public void methodFour(){
        System.out.println("method 4 (Children)");
    }
    public static void main(String[] args){
        ChildrenClass c = new ChildrenClass();
        c.methodOne();
        c.methodTwo();
        c.methodThree();
        c.methodFour();
    }

}
