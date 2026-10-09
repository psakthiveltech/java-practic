package generics.Basics;

public class printer<T>{
    T value;
    public printer(T val){
       value =  val;
    }
    public void calls(){
        System.out.println(value);
    }
    public T print(T vals){
        System.out.println(vals);
        return value;
    }
    public static void main(String[]args){
        printer<Integer> in = new printer<>(12);
        in.calls();
        printer<Character> ch = new printer<>('b');
        ch.print('g');
        printer<String> st = new printer<>("thisisstring");
        st.print("this");
    }
}
