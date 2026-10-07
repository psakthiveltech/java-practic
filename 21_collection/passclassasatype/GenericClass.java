package collection.passclassasatype;

public class GenericClass<t> {
    t val;
    public void method(){
        System.out.println(val);
    }
    public  GenericClass(t val){
        this.val=val;
    }
    public static void main(String[]args){
        Cat c1= new Cat("kitty",1);
        Cat c2= new Cat("tiger",1);
        Cat c3= new Cat("nikky",1);
        GenericClass<Cat> newcat = new GenericClass<>(c1);
        GenericClass<Cat> borncat = new GenericClass<>(c2);
        GenericClass<Cat> bornnewcat = new GenericClass<>(c3);
        newcat.method();
        borncat.method();
        bornnewcat.method();
    }
}