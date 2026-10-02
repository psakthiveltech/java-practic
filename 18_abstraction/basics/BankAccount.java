package abstraction.basics;

public class BankAccount {
    private String name;
    private double balance;
    public BankAccount(String name,double balances){
        this.name=name;
        this.balance=balances;
    }
    public void getBalance(){
        System.out.println("Current Balance : "+balance);
    }
    public void doWithdrawal(double amount){
        if(amount<100||amount>balance){
            System.out.println("Invalid Entry . Try again .");
            return ;
        }
       balance-=amount;
    }
    public void doDeposite(double amount){
        if(amount<1||amount>2000000){
            System.out.println("Invalid Input . Try again .");
            return;
        }
        balance+=amount;
    }
    public void getName(){
        System.out.println("Name : "+this.name);
    }
    public void accountDetails(){
//        System.out.println("=======================");
        System.out.println("Name : "+this.name);
        System.out.println("Balance : "+this.balance);
        System.out.println("=======================");

    }

    public static void main(String[] args){
        BankAccount c1 = new BankAccount("dhurendar",100000);
        BankAccount c3 = new BankAccount("dega",120000);
        BankAccount c2 = new BankAccount("sagan",111000);

        c1.doDeposite(10000);
        c2.doWithdrawal(10);
        c1.accountDetails();
        c2.accountDetails();
        c3.accountDetails();

    }

}
