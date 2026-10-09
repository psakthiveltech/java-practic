package generics.Basics;

public class integerPrinter {
    Integer val;
    public Integer IntegerPrinter(Integer vals){
        val=vals;
        return val;
    }
    public static void main(String[]args){
        integerPrinter intprinter = new integerPrinter();
        System.out.println(intprinter.IntegerPrinter(10));
//        intprinter.IntegerPrinter("515212")
    }
}