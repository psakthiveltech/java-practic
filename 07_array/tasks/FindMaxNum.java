package array.tasks;

public class FindMaxNum {
    public static void main(String[] args){
       int [] val={1,2,3,4,5,6,7,7,8,9,4,6,1,5,47,9521,151,51,123456789,41047,0};
       int max=val[0];
       for (int i : val){
           if(i>=max){
               max=max+i;
           }
       }
       System.out.println(max);
    }
}