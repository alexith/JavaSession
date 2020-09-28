
public class BankAccount {

    //variables

    double balance;
    double currentAmount;
    String accountNumber;
    String customerName;
    String phoneNumber;
    String email;


    //withdraw && deposit

    public void withdraw(double currentAmount) { this.balance -= currentAmount; }
    public void deposit(double currentAmount) { this.balance += currentAmount; }

    //getters && setters

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }




}
