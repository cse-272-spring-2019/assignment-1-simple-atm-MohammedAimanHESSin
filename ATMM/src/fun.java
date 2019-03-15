
public interface fun  {
	public int getCurrentBalance();
	
	//withdraws from current balance and updates it
	public boolean withdraw(int amount);
	
	//adds to the current balance and updates it
	public void deposit(int amount);
	
	//returns the prevtransaction in String format, or Null if no more history
	public int prev();
	
	//returns the next transaction in String format, or Null if no morehistory
	public int next();

}
