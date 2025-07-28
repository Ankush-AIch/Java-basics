public class Account{

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    //the first function for depositing an amount
    public void depositAmount(int debtAmount){
        balance += debtAmount;
        System.out.println("Thank you for depositing into our bank."+" "+"Your current balance is $"+this.balance);
    }

    //the second function for withdrawing money from the customer's account
    public void withdrawAmount(double withdrawalMoney){
        if (balance - withdrawalMoney < 0){
            System.out.println("Can't withdrawal, your account balance is not that much, you poor people.");
        } else{
            balance -= withdrawalMoney;
            System.out.println("Thanking for accessing out bank. You withdrawed money of "+withdrawalMoney+". Your current account balance is "+balance);
        }
    }

    //creating getters and setters

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}