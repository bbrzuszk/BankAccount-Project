
public class Account implements iAccounts {

		protected String owner;
		protected int accNum;
		protected double balance;
		
		public Account(String name, int accountNumber, double initialBalance){
			this.owner = name;
			this.accNum = accountNumber;
			this.balance = initialBalance;
		}

		public String getOwner() {
			return owner;
		}

		public void setOwner(String owner) {
			this.owner = owner;
		}

		public int getAccNum() {
			return accNum;
		}

		public void setAccNum(int accNum) {
			this.accNum = accNum;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void deposit(double amount){
			this.balance += amount;
		}
		
		public double withdraw(double amount){
			if(amount <= this.balance){	this.balance -= amount;	}
			else{ return -1;	}
			
			return amount;
		}
		
		public String displayAccount(){
			return "Name: " + owner + "\nAccount Number: " + this.accNum + "\nBalance: " + this.balance;
			
		}
		
	
		
}