package generics.Basics;

public class stringBuilder {

    String name;

    public String Stringprinter(String val){
        name =  val;
        return val;
    }
    public static void main(String[]args){
        stringBuilder sb = new stringBuilder();
        System.out.println(sb.Stringprinter("nanthaan verayaaru ?"));
    }
}