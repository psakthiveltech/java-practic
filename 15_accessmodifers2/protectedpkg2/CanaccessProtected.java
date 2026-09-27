package accessmodifers2.protectedpkg2;

import accessModifiers1.prodectedclasses.Productedtester1;

public class CanaccessProtected extends Productedtester1 {
    protected void itallowhere(){
        System.out.println("CanaccessProtected : it can acces protected method ?");
    }
    public static void main(String[] args){
        CanaccessProtected p = new CanaccessProtected();
        p.itallowhere();
        p.checkerMethod();//This is another package I use producted method working here or not
        //it's working
    }
}
