import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

class AmountDeposit {
	
	Entry entry ;
	MainMenu mainmenu ;
	Stage stage ;
	Client oneClient=Client.getInstance();
	Scene scene ;
	public void PrepearScene()
	{
		Label Amount =new Label("Amount");
    	TextField AmountF =new TextField();
		Button save =new Button("Save");
        //Drawing grid 
		GridPane grid = new GridPane();
        grid.add(Amount,1,0);
        grid.add(AmountF,1,1);
        grid.add(save,1,2);
		AmountF.clear();

        save.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle (ActionEvent event)
        	{
        		 String s =AmountF.getText();
        		 int result = Integer.parseInt(s);			
        		 if (result>0)
        		 {
        		 oneClient.deposit(s);
         		 System.out.println(oneClient.balance);
         		 System.out.println("i"+Example.i);
         		 System.out.println("b"+Example.b);
         	      mainmenu.PrepearScene();
                 stage.setScene(mainmenu.getScene());
        		 }
        		 else 
        		 {
        			 Alert a = new Alert(AlertType.ERROR);
                     a.setAlertType(AlertType.ERROR);
                     a.setContentText("Please enter valid amount to be deposite !" ); 
                     a.show();
        		 }
        			 
        	}
        });
    scene =new Scene(grid,300,300);
	}

	public void setMainmenu(MainMenu mainmenu) {
		this.mainmenu = mainmenu;
	}
	
	
	public AmountDeposit(Stage stage) {
		this.stage = stage;
			}

	public Scene getScene() {
		return this.scene;
	}
	
}


//********************************************************************************************//

class AmountWithdraw
{	
	Entry entry ;
	MainMenu mainmenu ;
	Stage stage ;
	Scene scene ;
	Client oneClient=Client.getInstance();
	public void PrepearScene()
	{
		Label Amount =new Label("Amount");
    	TextField AmountF =new TextField();
		Button save =new Button("Save");
		Label Validation =new Label();
        //Drawing grid 
		GridPane grid = new GridPane();
        grid.add(Amount,1,0);
        grid.add(AmountF,1,1);
        grid.add(save,1,2);
        grid.add(Validation,1,3);
		AmountF.clear();

        save.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle (ActionEvent event)
        	{
        		 String s =AmountF.getText();
        		
        		 if ( Integer.parseInt(s)<=0)
        		{
        			Alert a = new Alert(AlertType.ERROR);
           			// set alert type       
                       // set content text 
                       a.setContentText("\n Invalid amount  !!"); 
                       // show the dialog 
                       a.show(); 
        		}
        		 else if( oneClient.withdraw(s)==true)
             		{ mainmenu.PrepearScene();
             	    stage.setScene(mainmenu.getScene());}
        		else // set alert type       
        		{ Alert a = new Alert(AlertType.ERROR);
       			// set alert type       
                   // set content text 
                   a.setContentText("\n There isn't enough money !!"); 
                   // show the dialog 
                   a.show(); 
        		}
        	}
        });
      scene =new Scene(grid,300,300);
	}

	public void setMainmenu(MainMenu mainmenu) {
		this.mainmenu = mainmenu;
	}
	
	
	public AmountWithdraw(Stage stage) {
		this.stage = stage;
		
	}

	public Scene getScene() {
		return this.scene;
	}

}

//********************************************************************************************//

