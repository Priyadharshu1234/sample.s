class BankAccount {
    private double balance=0;
    public void setBalance(int amount){
        balance+=amount;
    }
    public double getBalance(){
        return balance;
    }
public class EncapsulationEx{
    public static void main(String[]args){
        BankAccount account=new BankAccount();
        account.setBalance(1000);
        System.out.println(account.getBalance());

    }
}
}
