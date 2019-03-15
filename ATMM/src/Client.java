
public class Client  {
	 private static Client instance1 = null;
	    public static Client getInstance() {
	        if (instance1 == null) {
	            instance1 = new Client();
	        }
	        return instance1;
	    }
	
 String credient_number ;
 int balance;
 Transaction transaction=Transaction.getInstance();

public int getCurrentBalance() {
	(Example.i)++;
	transaction.TransactionType[Example.i]="Balance Inquiry :";
	transaction.Value[Example.i]=balance;
	Example.b=Example.i;
	return balance;
}


public boolean withdraw(String j) {
	int result = Integer.parseInt(j);			
	if (result>balance) {
		return false;
	} 
	else
		balance = balance - result;
	(Example.i)++;
	transaction.TransactionType[Example.i]="withdraw :";
	transaction.Value[Example.i]=result;
	Example.b=Example.i;
	return true;
}


public void deposit(String amount) {
	int result = Integer.parseInt(amount);			
	balance = balance + result;
	(Example.i)++;
	transaction.TransactionType[Example.i]="deposit :";
	transaction.Value[Example.i]=result;
	Example.b=Example.i;
}


}

