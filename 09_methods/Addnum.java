package methods;

public class Addnum {
    public int Addval(int a,int b){
        return a+ b;
    }
    public static void main(String[] args){
        Addnum add = new Addnum();
        System.out.println(add.Addval(10,1000000));
    }
}
