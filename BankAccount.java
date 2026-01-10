class BankAccount {
    double balance;

    // Constructor
    BankAccount(double balance) {
        this.balance = balance;
    }

    // Method to calculate simple interest
    void calculateSimpleInterest(double rate, int time) {
        double interest = (balance * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(10000);

        account.calculateSimpleInterest(5, 2); // 5% for 2 years
        account.withdraw(3000);
    }
}
