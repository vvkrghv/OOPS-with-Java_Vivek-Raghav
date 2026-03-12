import java.io.FileWriter;
import java.io.IOException;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}
class BankAccount {

    int accountNumber;
    String holderName;
    double balance;

    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit: " + amount);
        TransactionLogger.log(accountNumber, "DEPOSIT", amount);
    }

    void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;
        System.out.println("Withdraw: " + amount);
        TransactionLogger.log(accountNumber, "WITHDRAW", amount);
    }
}
class TransactionLogger {

    static void log(int accNo, String type, double amount) {

        try {
            FileWriter fw = new FileWriter("transactions.txt", true);
            fw.write(accNo + " | " + type + " | " + amount + "\n");
            fw.close();
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}
public class Main {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount(101, "Rahul", 5000);

        try {
            acc.deposit(1000);
            acc.withdraw(2000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}