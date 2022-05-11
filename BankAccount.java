public class BankAccount {
    private double balance;

    //create a constructor with parameter for setting balance.
    public BankAccount(){
        balance = 0;
    }
    //create a method "deposit" with one parameter "amount" (decimal number) which allows user to increase the balance.
    public void deposit(double amount) {
        if(amount<5000){
        this.balance+=amount;
        }else{
            System.out.println( "Transaction cancelled. Max deposit - 5000 | Your deposit: "+amount);
        }
    }
    //create a method "withdraw" with one parameter "amount" (decimal number) which allows user to decrease the balance.
    public void withdraw(double amount) {
        if(amount<=this.balance){
        this.balance-=amount;
        }else{
            System.out.println("There is not enough funds.");
        }
    }
    //create a method "printBalance" which displays the current balance to user.
    public void printBalance() {
        System.out.println(this.balance);
    }
    //method for transfer balance from one bank account to another.
    public void transferFrom(BankAccount user, double amount){
        if(amount<=this.balance){
            this.balance-=amount;
            user.balance+=amount;
        }else{
            System.out.println("Transfer cancelled. You are trying to transfer "+amount+" units, but only "+this.balance+" are available.");
        }
    }
}
