package dataChecktypes;

public class Alldatatypes {
    public void numerical(){
        //-2147483648 to 2147483647
        int dtNum = 2147483647;

        byte dtNum2 = 127;//-128 - 127

        short dtNum3 = 32767; // -32767 to 32767

        long dtNum4 = 1234562555787777777l; //20num

        float dtNum5 = 3.4438f;

        double dtNum6 = 1232423453.56789909090909909090;//after/ many number possible

        System.out.println("the values is " +dtNum+ ","+dtNum2+ ","+dtNum3+ ","+dtNum4+ ","+dtNum5+ ","+dtNum6+ "," );

    }
    public  static  void main(String[] args){
    Alldatatypes dt = new Alldatatypes();
    dt.numerical();
    }
}
