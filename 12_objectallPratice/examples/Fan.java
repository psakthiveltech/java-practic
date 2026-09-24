package objectallPratice.examples;

public class Fan {
    String color;
    String wings;
    int motorCapacity;
    String brandName;
    public void turnOn(){
        System.out.println("fan turn on its rotating...");
        for(int i=1;i<=100;i++){
            if(i>10 && i<=24){
                System.out.println("Running in Medium speed");
            }
            else if(i>=25){
                System.out.println("Running fast...");

            }
            else{
                System.out.println("Running slow");
            }
        }
    }
    public void turnOff(){
        System.out.println("Turn off...");
    }
    public static void main(String[] args){
        Fan f1 = new Fan();
        f1.color = "Brown";
        f1.turnOn();
        f1.turnOff();
    }

}

