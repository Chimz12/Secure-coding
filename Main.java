
class Bank {
    private String accountType;
    private double accountBalance;
// class bank defines a new class called bank
    // private string accountType is private meaning it cannot be accessed outside  this class


    //  2)Method to deposit money
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
        // accountBalance += amount; adds the new deposited amount to the current balance
    }

    //3) Method to withdraw money
    public double withdrawal(double amount) {

        if (amount <= accountBalance) {
            accountBalance -= amount;
            return accountBalance;
        } else {
            System.out.println("Insufficient funds");
            return accountBalance;
        }
    }
    //4) Parameterized constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    //5) Method to display account details
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}
// 6) creating an insurance class
class Insurance extends Bank {
    // class Insurance extends Bank creates a new class which inherit from the bank class
    // Constructor for Insurance class
    public Insurance(String accountType,

                     double accountBalance) {
        super(accountType, accountBalance);
    }

    // 7)Method to indicate coverage
    public void cover() {
        System.out.println("You are covered");
    }
}
// 8)
public class Main {
    public static void main(String[] args) {
        // Replace 'AB' with your initials and '123456' with your reg number
        Bank myAccount = new Bank("tinotendachimina", 5000000);
        myAccount.display();

        // Example usage of deposit and withdrawal
        myAccount.deposit(500);

        myAccount.display();

        myAccount.withdrawal(200);
        myAccount.display();

        myAccount.withdrawal(1000); // Attempting to withdraw more than balance

        // Creating an instance of Insurance
        Insurance myInsurance = new Insurance("AB", 123456);
        myInsurance.cover();
    }
}
