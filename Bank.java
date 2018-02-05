import java.util.ArrayList;

public class Bank {

	private ArrayList<Account> accounts;
	
	public Bank(){
		accounts = new ArrayList<Account>();
	}
	
	public String displayAccount(int accNum){
		for(Account account: accounts){
			if(account.getAccNum() == accNum){
				return account.displayAccount();
			}
		}
		return "Account Does Not Exist";
	}
	public String displayCustomerAccounts(String name){
		String output = "";
		for(Account account: accounts){
			if(account.getOwner() == name){
				output += account.displayAccount();
			}
		}
		return "Account Holder Does Not Exist";
	}
	
	
	
	
}
