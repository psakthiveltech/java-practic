package constructor.basic;

public class ParameterizedSpecialMethod {
    int howManyvehiclesyouHave;
    String nameOfVehicle;

    public void vehicle(){
        System.out.println(howManyvehiclesyouHave+" "+" "+nameOfVehicle);
    }


    public static void main(String [] args){
        ParameterizedSpecialMethod s = new ParameterizedSpecialMethod();
        s.vehicle();
    }
}