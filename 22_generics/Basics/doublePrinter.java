package generics.Basics;

public class doublePrinter {
    double value;

    public double doubprint(double vals){
        value=vals;
        return value;
    }
    public static void main(String[]args){
        doublePrinter db = new doublePrinter();
        System.out.println(db.doubprint(42.78));
    }
}
