package Streams.basic;

public class runtimePolymorphysim2 extends runtimePolymorphysim {
    void run(){
        System.out.println("i can run da");
    }
    void start(){
        System.out.println("start's");
    }

    public static void main(String[] args){
        runtimePolymorphysim r = new runtimePolymorphysim2();
        r.run();
    }
}