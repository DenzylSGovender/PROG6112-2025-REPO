public class BankAccount {
  protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    
    public String withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                return "Withdrawal of R" + amount + " successful.";
            } 
            else 
            {
                return "Insufficient funds.";
            }
            
        } 
       return "Invalid Amount";
    }
}
