package array.basic;

public class arrayBeha {
    public static void main(String []args){
        int []arr = new int[4];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=i+1;
        }
        int [] newarr = new int[arr.length];
        for(int i=0;i<=arr.length-1;i++){
            newarr[i]=arr[i];
        }
//        for(int i:newarr){
//            System.out.println(i);
//        }

        for(int i=1;i<=newarr.length-1;i++){
            arr[i]=newarr[i-1];
        }
        arr[0]=newarr[newarr.length-1];
        for(int i:arr){
            System.out.println(i);
        }
    }

}
