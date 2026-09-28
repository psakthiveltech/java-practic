package inheritance.c.multilevel;

public class ChildrenThree extends ChildrenTwo {
    public void childThree(){
        System.out.println("Method from Child 3 Sir...");
    }
    public static void main(String[] args){
        ChildrenThree cThree = new ChildrenThree();
        cThree.parentMethod();
        cThree.childOne();
        cThree.childTwo();
        cThree.childThree();
    }

}
