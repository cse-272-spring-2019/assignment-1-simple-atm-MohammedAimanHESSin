import javax.jws.Oneway;

import com.sun.javafx.scene.control.skin.LabelSkin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Home extends Application {
	public static void main(String[] args) {
	      launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		primaryStage.setTitle("******ATM******"); 
		
		Client oneClient=Client.getInstance();  Transaction transaction=Transaction.getInstance();
		Example.i=0; Example.b=0; transaction.Value[Example.i]=0;  transaction.TransactionType[Example.i]="null";
		System.out.println(transaction.TransactionType[Example.i]);
		oneClient.balance=0;   
		oneClient.credient_number="60176012"; 
        Entry entry=new Entry(primaryStage);
        MainMenu mainmenu=new MainMenu(primaryStage);
        AmountDeposit amountDeposit=new AmountDeposit(primaryStage);
        AmountWithdraw amountWithdraw=new AmountWithdraw(primaryStage);
        Balance balanceScene =new Balance(primaryStage);
        History history1 =new History(primaryStage);
        entry.PrepareScene();
        
        entry.setMainmenu(mainmenu);    
        mainmenu.setEntry(entry);       
        
        mainmenu.setAmountDeposit(amountDeposit);    mainmenu.setAmountWithdrawl(amountWithdraw);
        amountDeposit.setMainmenu(mainmenu);         amountWithdraw.setMainmenu(mainmenu);
        
        primaryStage.setScene(entry.getScene());
        
        primaryStage.show();
        
        
        
	}
}
