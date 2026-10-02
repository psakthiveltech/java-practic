package abstraction.basics;

public class BankBalanceCheck {
    private double balance = 0;

    public void  getBalance(){
        System.out.println("Balance : "+balance);
    }
    public double moneyWithdraw(double amount){
        if(amount>balance&&amount<1){
            System.out.println("insufficient balance .");
        }
        return balance-=amount;
    }
    public double moneyDeposit(double amount){
        if(amount<1||amount>2000000){
            System.out.println("invalid input.");
            return balance;
        }
        return balance+=amount;
    }
public static void main(String [] args){
    BankBalanceCheck c1 = new BankBalanceCheck();
//    c1.getBalance();
    c1.getBalance();
//    c1.moneyWithdraw();
//    c1.moneyDeposit(-12);
    c1.moneyDeposit(300000);
    c1.getBalance();
    BankBalanceCheck c2 = new BankBalanceCheck();
    c2.moneyDeposit(350);
    c2.getBalance();
}
}