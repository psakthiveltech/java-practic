package loops.forloop.patterns;

public class swaptwo {
    public static void swapnum(int a,int b){
        System.out.print(a+" "+b+" ");
        int tem = a;
        a=b;
        b=tem;
        System.out.print("the swaped answer : "+a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;
    }
    public static void main(String[]args){
    swapnum(10,20);
    }
}
