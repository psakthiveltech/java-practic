package generics.manywaytouse;

public class genericInClass<t> {
    t val ;
    <t> void work(t[] arr){
        for(t k : arr){
            System.out.println("u got it !!!!!");
        }
    }
    public static void main(String[]args){
        genericInClass<Integer> val = new genericInClass<>();
        Integer[]vals = {1,22,44,55,66,77,88,852};
        val.val=123;
        System.out.println(val.val );
        val.work(vals);

    }
}
