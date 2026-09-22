package methods;

public class Paramererizedfunction {
    public String valueGetter(int val){
        if(val>=10){
            return "Take it";
        }
        else{
            return "Take amount";
        }
    }
    public static void main(String[] args){
        Paramererizedfunction fun = new Paramererizedfunction();
        System.out.println(fun.valueGetter(20));
    }
}
