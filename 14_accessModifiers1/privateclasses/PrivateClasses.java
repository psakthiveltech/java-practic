package accessModifiers1.privateclasses;

public class PrivateClasses {
    private void cantaccessonoutside(){
     long amount = 123456789123L;
     System.out.println("Balance : "+amount + "₹");
}
    public static void main(String[] args){
        PrivateClasses c = new PrivateClasses();
        c.cantaccessonoutside();
    }



}
