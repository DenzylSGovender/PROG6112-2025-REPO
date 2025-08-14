

public class SavingsAccount extends BankAccount {
   private double minimumBalance;
    public SavingsAccount(double initialBalance, double minimumBalance) {
        super(initialBalance);
        this.minimumBalance = minimumBalance;
    }
    @Override
   public String withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                return "Withdrawal of R" + amount + " successful.";
            } 
            else 
            {
                return "Withdrawal would lead to below minimum balance. Transaction Aborted";
            }
            
        } 
       return "Invalid Amount";
    }
}
