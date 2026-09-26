package accessModifiers1.prodectedclasses;

public class Productedtester1 {
    protected void checkerMethod(){
    System.out.println("Protected : working here i am from 'pkg 01' ");
}
    public static void main(String[] args){
        Productedtester1 p = new Productedtester1();
        p.checkerMethod();
    }
}
