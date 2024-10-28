import java.util.Scanner;

abstract class Account {
  String customerName, accountNumber;
  double balance;

  Account(String customerName, String accountNumber, double initialBalance) {
    this.customerName = customerName;
    this.accountNumber = accountNumber;
    this.balance = initialBalance;
  }

  void deposit(double amount) {
    balance += amount;
  }

  void displayBalance() {
    System.out.println("Balance: " + balance);
  }

  abstract void withdraw(double amount);
}

class SavAcct extends Account {
  double interestRate;

  SavAcct(String customerName, String accountNumber, double initialBalance, double interestRate) {
    super(customerName, accountNumber, initialBalance);
    this.interestRate = interestRate;
  }

  void withdraw(double amount) {
    if (amount <= balance) balance -= amount;
  }

  void computeAndDepositInterest() {
    balance += balance * interestRate / 100;
  }
}

class CurAcct extends Account {
  static final double MIN_BALANCE = 1000, SERVICE_CHARGE = 50;

  CurAcct(String customerName, String accountNumber, double initialBalance) {
    super(customerName, accountNumber, initialBalance);
  }

  void withdraw(double amount) {
    if (amount <= balance) {
      balance -= amount;
      if (balance < MIN_BALANCE) balance -= SERVICE_CHARGE;
    }
  }
}

class Bank {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter account type (savings/current): ");
    String type = scanner.nextLine();
    System.out.print("Enter customer name: ");
    String name = scanner.nextLine();
    System.out.print("Enter account number: ");
    String number = scanner.nextLine();

    Account account;

    if (type.equals("savings")) {
      double initialBalance = getDouble(scanner, "Initial balance: ");
      double interestRate = getDouble(scanner, "Interest rate: ");
      account = new SavAcct(name, number, initialBalance, interestRate);
    } else {
      double initialBalance = getDouble(scanner, "Initial balance: ");
      account = new CurAcct(name, number, initialBalance);
    }
    while (true) {
      System.out.println("\n1. Deposit 2. Display Balance 3. Withdraw 4. Interest 5. Exit");
      int choice = scanner.nextInt();
      switch (choice) {
      case 1:
        account.deposit(scanner.nextDouble());
        break;
      case 2:
        account.displayBalance();
        break;
      case 3:
        account.withdraw(scanner.nextDouble());
        break;
      case 4:
        if (account instanceof SavAcct)((SavAcct) account).computeAndDepositInterest();
        break;
      case 5:
        return;
      }
    }
  }

  private static double getDouble(Scanner scanner, String prompt) {
    System.out.print(prompt);
    return scanner.nextDouble();
  }
}
