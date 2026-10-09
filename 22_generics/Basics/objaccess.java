package generics.Basics;

public class objaccess {

    Object val;

    public void calling(Object k){
        val=k;
        System.out.println(k );
    }
    public static void main(String[]arr){
        objaccess ob = new objaccess();
        ob.calling("hello");
        ob.calling(12);
        ob.calling(45.6);
        ob.calling('k');
        ob.calling(7896541);
    }
}
