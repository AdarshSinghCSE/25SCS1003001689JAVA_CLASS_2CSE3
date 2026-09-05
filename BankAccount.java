class BankAccount {
    // Private data members
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    // Parameterized Constructor
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        setAccountNumber(accountNumber);
        setAccountHolderName(accountHolderName);
        setBalance(balance);
    }
    // Getter and Setter for Account Number
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        if (accountNumber != null && !accountNumber.isEmpty()
                && accountNumber.length() >= 5) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid Account Number");
        }
    }
    // Getter and Setter for Account Holder Name
    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        if (accountHolderName != null && !accountHolderName.isEmpty()
                && accountHolderName.length() >= 3) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Invalid Account Holder Name");
        }
    }
    // Getter and Setter for Balance
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid Balance");
        }
    }
    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Invalid Deposit Amount");
        }
    }
    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    // Display Account Details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Available Balance: " + getBalance());
    }
}
// Main Class
 class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(
            "ACC1001",
            "Adarsh Singh ",
            1000000.00
        );
        account.displayAccountDetails();
        System.out.println("Depositing: 2000");
        account.deposit(2000);
        System.out.println("Withdrawal: 3000");
        account.withdraw(3000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}