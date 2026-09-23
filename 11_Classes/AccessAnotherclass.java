package Classes;

public class AccessAnotherclass {
    public void normalMethod(){
        System.out.println("ok hello");
    }
    public static void main(String [] args)
    {
        Student st = new Student();
        st.name="viji";
        st.age=10;
        st.rollNo=12345678;
        st.classes= 'a';
        st.num = 321456987412369L;
        st.accessAll();
    }
}