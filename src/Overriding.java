 class Payment{
    void pay(double amount)
    {
        System.out.println("Payment"+amount);
    }

}
class Upi extends Payment{
    @Override
    void pay(double amount) {
      System.out.println("payment:"+amount);
    }
}
class Cards extends Payment{
    @Override
    void pay(double amount) {
        System.out.println("payment"+amount);
    }
}
class Poly1
{
    public static void main(String[] args){
        Payment s=new Upi();
        s.pay(1000);
        Payment s1=new Cards();
        s1.pay(2000);
    }
}
