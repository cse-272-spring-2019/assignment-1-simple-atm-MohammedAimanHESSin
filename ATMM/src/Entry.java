import javax.swing.UIManager;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Background;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class Entry {
	
	MainMenu mainmenu ;
	Stage stage ;
	Scene scene ;
	/*Client one;*/   Client oneClient=Client.getInstance();

    public void PrepareScene() 
    {
    	
    	Label powerd =new Label("\n\n\n\n\n\n\nPowerd by Mohammed Aiman");
    	Label welcome =new Label("Welcome ATM Program");
    	Label CardNumber =new Label("CardNumber");
    	TextField CardNumberField =new TextField("\n");
        Button Login =new Button("Login");
		GridPane grid = new GridPane();
        grid.add(CardNumberField,4,1);
        grid.add(Login,4,2);
        grid.add(powerd,4,3);
        grid.add(welcome,4,0);
        grid.add(CardNumber,3,1);
        CardNumberField.setPromptText("Enter Card Number ...");

        scene =new Scene(grid,300,210); 		
    	CardNumberField.clear();
      
        
        Login.setOnAction(new EventHandler<ActionEvent>()
        { 
        	public void handle (ActionEvent event)
        	{
        		String cardNumber =CardNumberField.getText();
        		if (cardNumber.equals(oneClient.credient_number))
        			{
        	        mainmenu.PrepearScene();
                    stage.setScene(mainmenu.getScene());
        			}
        		else 
        		{ 
        			// set alert type       
        			 Alert a = new Alert(AlertType.ERROR);
        			// set alert type       
                    // set content text 
                    a.setContentText("\n  Wrong Card Number !!"); 
                    // show the dialog 
                    a.show(); 
                     		}
        	}
        });
        
    }	
    
        //Constructor
	public Entry(Stage stage) {
		this.stage = stage;
		

	}

     //setter
	public void setMainmenu(MainMenu mainmenu) {
		this.mainmenu = mainmenu;
		
	}
	
	//getter
    public Scene getScene ()
	{
		return this.scene ;
	}


}
