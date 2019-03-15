
public class Transaction {
String[]TransactionType=new String[200];
int[]Value= new int[100];

	 private static Transaction instance1 = null;
	    public static Transaction getInstance() {
	        if (instance1 == null) {
	            instance1 = new Transaction();
	        }
	        return instance1;
	    }
}
