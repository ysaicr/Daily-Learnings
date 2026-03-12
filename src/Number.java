class BankAccount
{
    private double balance;
    private String accountHolder;

//Getter

    public double getBalance()
    {
        return balance;
    }
//Setter with validation

    public void deposite(double amount)
    {
        if( amount > 0)
        {
            balance = balance + amount;
            System.out.println( "Deposited"+ balance);
        }
        else
        {
            System.out.println("Invalid amount");
        }

    }

    public void withdraw(double amount)
    {
        if( amount >0 )
        {
            balance = balance - amount;
            System.out.println( "withdraw"+ balance);
        }
        else
        {
            System.out.println("Insufficent amount");
        }

    }
}

class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(); // object creation class
        acc.deposite(5000000);
        acc.withdraw(5000000);
        System.out.println("balance" + acc.getBalance());
        acc.withdraw(100000);
        System.out.println("balance" + acc.getBalance());
    }




}