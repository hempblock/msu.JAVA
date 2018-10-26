/*
	10/24/18

*/
    public class Account {


    String acctName,acctNum;
    char acctType ;
    float acctBal;
    int minBal;

  Account () {
    acctName = "John/Jane Doe";
    acctNum = "000";
    acctType= 'x';
 }

  Account (String name, String num) {
  acctName = name;
  acctNum = num;
    }

public float Deposit (float DepositAmount) {
  return acctBal += DepositAmount;
}

public float Withdraw (float WithdrawAmount) {
  if( acctBal - WithdrawAmount > minBal){
  return acctBal -= WithdrawAmount;
}
  else{
    System.out.println("You cannot withdraw this because it will put you accout balance below the minimum requirement of: $" + minBal);
    return acctBal;
  }
}

public void Display () {
  System.out.println( acctName + "'s Accounts Balance is: $" + acctBal);
}

public static class CheckingAccount extends Account{
  CheckingAccount(String name, String num){
    super(name, num);
    acctType= 'c';
    minBal = 150;
    acctBal = 0;
  }

}

public static class SavingsAccount extends Account{
SavingsAccount(String name, String num){
  super(name, num);
  acctType= 's';
  minBal = 0;
  acctBal = 0;
}
  public float Intrest (float IntrestAmount) {
    return acctBal += IntrestAmount;
}
}

  public static void main(String [] args) {
    Account a1 = new SavingsAccount("Joe Smith","1494");
    Account a2 = new CheckingAccount("Mark Robin","8521");

    a1.Display();
    a1.Deposit(400);
    a1.Display();
    a1.Withdraw(300);
    a1.Display();
    a2.Display();
    a2.Deposit(400);
    a2.Display();
    a2.Withdraw(300);
    a2.Display();

    }

  }
