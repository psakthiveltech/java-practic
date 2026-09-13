package conditionalstatements.jumpstatement;

public class BreakAndContinue {
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
            if(i%2!=0){
                continue;
            }
            else if(i==13){//why this is not work ?
                break;
            }
            System.out.print(i+" ,");
        }
    }
}
