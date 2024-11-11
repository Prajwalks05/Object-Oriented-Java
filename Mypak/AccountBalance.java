package Mypak;

class Balance {
  String name;
  float balance;

  public Balance(String s, float fl) {
    name = s;
    balance = fl;
  }

  void display() {
    if (balance < 0) {
      System.out.println("No balance");
    } else {

      System.out.println("Name: " + name);
      System.out.println("Balance: " + balance);
    }
  }
}

 class AccountBalance {
  public static void main(String args[]) {
    Balance current[] = new Balance[3];

    // Initializing Balance objects
    current[0] = new Balance("A", 1000.0f);
    current[1] = new Balance("B", 1000.0f);
    current[2] = new Balance("C", -2.0f);
    for (int i = 0; i < 3; i++) {
      current[i].display();
    }
  }
}