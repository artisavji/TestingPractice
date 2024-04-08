package Variables;

public class BankAccount {
//Instance variable
    private String accountnumber;
    private String accountholdername;
    public double balance;

    public void setaccountdetails(String accountnumber, String accountholdername, double balance) {
        this.accountnumber = accountnumber;
        this.accountholdername = accountholdername;
        this.balance = balance;
    }
        public void deposite ( double amount)
        {
            balance += amount;
            System.out.println(amount + "Deposite Done");
        }
        public void withdraw ( double amount)
        {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + "withdraw succssfully");
            } else {
                System.out.println("Insufficient Fund");
            }
        }
        public void displayaccountdetails () {
            System.out.println("accountnumber:" + accountnumber);
            System.out.println("accountholdername:" + accountholdername);
            System.out.println("balance:" + balance);
        }

        public static void main (String[]args){
            BankAccount bank = new BankAccount();
            bank.setaccountdetails("95146327815", "Arti Savji", 4000);
            System.out.println("Account details");
            System.out.println();

            bank.deposite(1000);
            System.out.println("Deposting Account details");
            bank.displayaccountdetails();
            System.out.println();

            bank.withdraw(2000);
            System.out.println("withdraw total amount details");
            bank.displayaccountdetails();
            System.out.println();

        }
    }



