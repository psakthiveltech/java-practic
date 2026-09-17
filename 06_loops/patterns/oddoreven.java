package loops.forloop.patterns;

public class oddoreven {
    public static String oddoreven(int n){
        if(n%2==0){
            return "even";
        }
        return "odd";
    }
    public static void main(String[]args){
        System.out.print(oddoreven(41));
    }
}
