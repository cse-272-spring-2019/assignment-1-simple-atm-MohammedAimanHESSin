
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class MainMenu {
    Stage stage;
    Scene scene;
    Entry entry;
  AmountDeposit amountDeposit;
  AmountWithdraw amountWithdrawl;
Client oneClient=Client.getInstance();
Transaction transaction=Transaction.getInstance();
    public MainMenu(Stage stage) {
        this.stage = stage;
    }
    
    
    public void PrepearScene(){
      
        Button deposit = new Button();
        Button withdrawal = new Button();
        Button balance = new Button();
        Button logout = new Button();
        Button previous = new Button();
        Button next = new Button();
        logout.setText("Logout");
        deposit.setText("DEPOSIT");
        withdrawal.setText("WITHDRAWAL");
        balance.setText("GET BALANCE");
        previous.setText("Previous");
        next.setText("Next");
        GridPane grid = new GridPane();
        grid.add(deposit, 3,0);
        grid.add(withdrawal, 3, 3);
        grid.add(balance, 3, 5);
        grid.add(logout, 3, 10);
        grid.add(previous, 0, 8);
        grid.add(next, 8, 8);
        scene = new Scene(grid, 300, 250);
        
        
        logout.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              
            	entry.PrepareScene();
                stage.setScene(entry.getScene());
            }
        });
        
        deposit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                amountDeposit.PrepearScene(); 
                stage.setScene(amountDeposit.getScene());
                
            }
        });
            
        withdrawal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	amountWithdrawl.PrepearScene(); 
                stage.setScene(amountWithdrawl.getScene());
            }
        });
        
        
        balance.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               int balance = oneClient.getCurrentBalance();
               Alert a = new Alert(AlertType.INFORMATION);
               a.setAlertType(AlertType.INFORMATION);
               a.setContentText("Your Balance is : " + balance); 
               a.show();
            }
        });
        
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	Alert a = new Alert(AlertType.INFORMATION);
                Example.b++;
                if(Example.i>0&&Example.b>0&&Example.b<=Example.i)
                {a.setContentText(transaction.TransactionType[Example.b]+Integer.toString(transaction.Value[Example.b])); 
                a.show();}
                else {   a.setAlertType(AlertType.ERROR);
                         a.setContentText("No transaction to show !!");  a.show();
				}
            }
        });
        
        previous.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            	Alert a = new Alert(AlertType.INFORMATION);
                a.setAlertType(AlertType.INFORMATION);
                Example.b--;
                if(Example.i>0&&Example.b>0&&Example.b<=Example.i)
                {a.setContentText(transaction.TransactionType[Example.b]+Integer.toString(transaction.Value[Example.b])); 
                a.show();}
                else {   a.setAlertType(AlertType.ERROR);
                         a.setContentText("No transaction to show !!");  a.show();
				}
            }
        });
    
    }

    public Scene getScene() {
        return scene;
    }


	public Entry getEntry() {
		return entry;
	}


	public void setEntry(Entry entry) {
		this.entry = entry;
	}


	public AmountDeposit getAmountDeposit() {
		return amountDeposit;
	}


	public void setAmountDeposit(AmountDeposit amountDeposit) {
		this.amountDeposit = amountDeposit;
	}


	public AmountWithdraw getAmountWithdrawl() {
		return amountWithdrawl;
	}


	public void setAmountWithdrawl(AmountWithdraw amountWithdrawl) {
		this.amountWithdrawl = amountWithdrawl;
	}

  
}