
public class CheckingAccount extends Account implements iCheckingAccount{
	
		private double interest;
		private double minimumBalance;
		
		
		public CheckingAccount(String name, int accountNum, double balance){
			super(name, accountNum, balance);
			this.interest = 0.012;
			this.minimumBalance = 500.0;
		}
		
		public double withdraw(double amount){
			double maxWidthdraw = this.balance - this.minimumBalance;
			if(amount <= maxWidthdraw){	this.balance -= amount;	}
			else{ return -1;	}
			
			return amount;
		}
		
		public void depositInterest(){
			double amount = this.balance * this.interest;
			amount = Math.floor(amount * 100);
			amount /= 100;
			super.deposit(amount);
			
			
		}
		public String displayAccount(){
			//return "Name: " + owner + "\nAccount Number: " + this.accNum + "\nInterest Rate: " + this.interest + "\nBalance: " + this.balance;
			return super.displayAccount() + "\nInterest Rate: " + this.interest *100 + "%";
		}
	
}