package Generics;

public class CustomerClass {

        private  String name = "";
        private  String accountNumber = " ";
        private long accountBalance = 0;


        public CustomerClass(String name_, String accountNumber, long accountBalance){
            this.setName(name_);
            this.setAccountNumber(accountNumber);
            this.setAccountBalance(accountBalance);

        }

        public String getName()
        {
            return name;
        }
        private void setName(String name_)
        {
            this.name = name_;

        }

        public String getAccountNumber() {
            return accountNumber;
        }

        private void setAccountNumber(String accountNumber_)
        {
            this.accountNumber = accountNumber_;
        }

        public long getAccountBalance() {
            return accountBalance;
        }

        private void setAccountBalance(long accountBalance) {
            this.accountBalance = accountBalance;
        }

    }




