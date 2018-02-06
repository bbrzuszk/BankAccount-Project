import java.util.ArrayList;

public class Bank {

	private ArrayList<Account> accounts;
	
	public Bank(ArrayList<Account> a){
		accounts = a;
	}
	
	public ArrayList<Account> getAccounts(){
		return accounts;
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
			if(name.equalsIgnoreCase(account.getOwner())){
				output += account.displayAccount();
				output += "\n\n";
			}
			
		}
		if(output.equals(""))
			return "Account Holder Does Not Exist";
		return output;
	}
	
	public void addAccount(String name, int accNum, double bal, double interest, boolean checking){
		if(checking){
			accounts.add(new CheckingAccount(name, accNum, bal));
		}
		else{
			accounts.add(new Account(name, accNum, bal));
		}
	}
	
	public int findAccount(int accNum){
		for(int i = 0; i< accounts.size();i++){
			if(accounts.get(i).getAccNum() == accNum)
				return i;
		}
		return -1;
	}
	
	
}