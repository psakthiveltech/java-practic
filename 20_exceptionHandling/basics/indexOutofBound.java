package exceptionHandling.basics;

public class indexOutofBound {
    int[]arr=new int[10];
    public void check(){
        try{
            int index=0;
            for(int i : arr){
                arr[index++]=i;
            }
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("this is not allowed because this is "+e);
        }
        finally {
            System.out.println("Iam ironman");
        }
    }
    public static void main(String[]ags){
        indexOutofBound id =  new indexOutofBound();

        id.check();
    }
}
