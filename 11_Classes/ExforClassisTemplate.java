package Classes;

public class ExforClassisTemplate {
    String name ;
    int age;
    String school = "Main teaching centeral school";
    public void details(){
        System.out.println(name +" your age is "+age + " and they both study in this school "+school);
    }
    public static void main (String[] args){
        ExforClassisTemplate ex = new ExforClassisTemplate();
        ex.name="giri";
        ex.age=12;
        ex.details();
        ExforClassisTemplate tx = new ExforClassisTemplate();
        tx.name = "vevek";
        tx.age=12;
        tx.details();
        ExforClassisTemplate vz = new ExforClassisTemplate();
        vz.name="tony";
        vz.age=40;
        vz.details();
    }
}
