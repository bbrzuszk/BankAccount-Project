import java.io.*;
import java.util.*;
public class Util {

	public static ArrayList<Account> getAccounts() throws NumberFormatException, IOException{
		ArrayList<Account>accounts = new ArrayList<Account>();
		FileReader inFile = null;
		try{
			inFile = new FileReader("AccountFile.txt");
				
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		BufferedReader inStream = new BufferedReader(inFile);
		String name, accNum, bal, isChecking;
		while(	((name = inStream.readLine()) != null) &&
				((accNum = inStream.readLine()) != null) &&
				((bal = inStream.readLine()) != null)	&&
				((isChecking = inStream.readLine()) != null)){
			if(Boolean.parseBoolean(isChecking)){
			accounts.add(new CheckingAccount(name, Integer.parseInt(accNum),Double.parseDouble(bal)));
			}
			else{
				accounts.add(new Account(name, Integer.parseInt(accNum),Double.parseDouble(bal)));
			}
		}
		return accounts;
	}
}
