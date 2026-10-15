package ProblemSolving.basic;

public class palinumcheck  {
    public static boolean checkpalin(int n){
        int result=0;
        int n1=n;
        while(n!=0){
            result = (result*10)+n%10;
            n=n/10;
            System.out.println(result);
        }
        return result==n1;
    }
    public static void main(String[] args){
        System.out.print(checkpalin(-121));
    }
}