public class Account {

    private String accountNumber;
    private double availableBalance;
    private String accountOwnerName;
    private String email;
    private String phoneNumber;


    public Account(String accountNumber, double availableBalance, String accountOwnerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.availableBalance = availableBalance;
        this.accountOwnerName = accountOwnerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(double availableBalance) {
        this.availableBalance = availableBalance;
    }

    public String getAccountOwnerName() {
        return accountOwnerName;
    }

    public void getOwnername(String accountOwnerName) {
        this.accountOwnerName = accountOwnerName;
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



    public void deposit(double amount) {
        availableBalance += amount;
        System.out.println("Deposit of $" + amount + " made. New balance: $" + availableBalance);
    }

    public void withdraw(double amount) {
        if (availableBalance >= amount) {
            availableBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " made. Remaining balance: $" + availableBalance);
        } else {
            System.out.println("Insufficient funds. You have $" + availableBalance + " in your account.");
        }
    }
}
