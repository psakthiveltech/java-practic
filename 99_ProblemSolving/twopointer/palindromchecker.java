package ProblemSolving.twopointer;

public class palindromchecker {
    public static boolean palinchecker(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if((s.charAt(i) + "").equals(" ")){
                i++;
            }
            else if((s.charAt(j)+"").equals(" ")){
                j--;
            }
            if((s.charAt(i)+"").equalsIgnoreCase(s.charAt(j)+"")){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        System.out.println(palinchecker("madam"));
    }
}
