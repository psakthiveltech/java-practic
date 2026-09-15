package loops.forloop.patterns;

public class checkprimenum {

    public static boolean checkprime(int n){
        if(n<=0||n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=3;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
    static void main(String[]ar){
        System.out.print(checkprime(78));
    }
}
