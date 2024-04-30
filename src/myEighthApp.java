public class myEighthApp {
    public static void main(String[] args) {

        Account myAccount = new Account("123456789", 1000.0, "Roni Kevibeden", "roni@example.com", "555-555-5555");


        myAccount.deposit(250.0);


        myAccount.withdraw(900.0);


        myAccount.deposit(250.0);


        myAccount.withdraw(50.0);
    }
}

