package loops.forloop.patterns;

public class largeinthree {
    public static int largeinthree(int a,int b,int c){
        if(a>b&&a>c){
            return a;
        }
        else if(b>a&&b>c){
            return b;
        }
        else{
            return c;
        }
    }
    public static void main(String[] args){
        System.out.print(largeinthree(30,10,4));
    }
}
