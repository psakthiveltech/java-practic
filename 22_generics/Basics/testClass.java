package generics.Basics;

public class testClass <T,V>{

    T values;
    public T callme(T values){
        return values;
    }
    public V val(V type){
        V vals=type;
        return vals;
    }
    public static void main(String[]args){
        testClass<String ,Integer> s = new testClass<>();
        s.callme("valess");
        s.val(12);
    }
}
