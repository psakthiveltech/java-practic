package accessModifiers1.testallclasses;

import accessModifiers1.publicclasses.PublicClass;

public class TestPublic extends  PublicClass{
    public void methodfortester(){
        System.out.println("check");
    }
public static void main(String []args){
    TestPublic n = new TestPublic();
    n.publicmethod();
}
}
