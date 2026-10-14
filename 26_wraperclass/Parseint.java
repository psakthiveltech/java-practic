package wraperclass;

public class Parseint {
    public static void main(String[] args){
        String num = "12";
        int nums = Integer.parseInt(num);
        if (nums instanceof int){
            System.out.println(nums*nums);
        }
        else {
            System.out.println("this is not you want !");
        }
    }
}
