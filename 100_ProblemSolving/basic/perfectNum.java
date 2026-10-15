package ProblemSolving.basic;

import java.util.*;

public class perfectNum {
    public static boolean finderperfect(int n){
        if(n==0){
            return false;
        }
        int res = 0;
        for(int i=1;i<Math.sqrt(n);i++){
            if(n%i==0){
                res=res+i;
                if(n/2!=n){
                    res=res+i;
                }
            }
        }
        return res==n;
    }
    public static void main(String[] args){
        System.out.println(finderperfect(0));
    }
}
