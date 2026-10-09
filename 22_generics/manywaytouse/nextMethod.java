package generics.manywaytouse;

public class nextMethod<t,v>{
    t val;
    public <v> v call(v value){
        v val=value;
        System.out.println("the method generic works well");
        System.out.println(val);
        return val;
    }

    public static void main(String[]args){
        nextMethod<Integer,String> vals = new nextMethod<>();
        vals.call("cal");
        vals.val=1221;
        System.out.println(vals.val);
    }
}
