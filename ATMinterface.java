import java.util.*;

public class ATMinterface {
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalace() {
            return this.balance;

        }

        public void withdraw(double amount) { // get money from account
            if (balance > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Your current Balance = " + balance);
                return;

            } else {
                System.out.println("your balance is Not sufficient ! ");
            }
        }

        public void deposite(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Your current Balance = " + balance);
                return;
            } else {
                System.out.println("Your balance is Not Sufficient to deposite ! ");
            }
        }

    }

    static class ATM {
        Scanner sc = new Scanner(System.in);
        private BankAccount userAccount; // user account object of baccAccount class

        public ATM(BankAccount account) {
            userAccount = account;
        }

        public void displayMenu() {
            System.out.println("1 = Check Balance ");
            System.out.println("2 = Deposite Money");
            System.out.println("3 = Withdraw Money ");
            System.out.println("4 = Quit ");
        }

        public void on() {
            while (true) {
                displayMenu();
                System.out.print("Enter your Choise = ");
                int option = sc.nextInt();
                switch (option) {

                    case 1:
                        System.out.println("Your balance is = " + userAccount.getBalace());
                        break;

                    case 2:
                        System.out.print("Enter the money you want to deposite = ");
                        double amount = sc.nextDouble();
                        userAccount.deposite(amount);
                        break;

                    case 3:
                        System.out.println("Enter The Ammount = ");
                        double Amount = sc.nextDouble();
                        userAccount.withdraw(Amount);
                        break;

                    case 4:
                        System.out.println("Thankyou Have a Nice Day ! ");
                        sc.close();
                        return;

                    default:
                        System.out.println("You not Enter the proper option ! please select the proper Option ");
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ****************************************************Welcome To State Bank********************************************");
        System.out.print("Enter the amount of balance in your bank = ");

        double balance = sc.nextInt();

        BankAccount account = new BankAccount(balance);
        ATM card = new ATM(account);// object of bank class
        card.on();

    }
}