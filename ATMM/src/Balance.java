import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Balance {
	Entry entry ;
	MainMenu mainmenu ;
	Stage stage ;
	Scene scene ;
	Client oneClient=Client.getInstance();
	public void PrepearScene()
	{
		Label Ba =new Label("Your Balance is :");
    	Label b =new Label(Integer.toString(oneClient.getCurrentBalance()));
    	Button Back =new Button("Back to MainMenu");
        //Drawing grid 
		GridPane grid = new GridPane();
        grid.add(Ba,1,1);
        grid.add(b,3,1);
        grid.add(Back,3,3);
        Back.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle (ActionEvent event)
        	{
                stage.setScene(mainmenu.getScene());
        	}
        });
        scene =new Scene(grid,300,250);
   }
	
	public void setMainmenu(MainMenu mainmenu) {
		this.mainmenu = mainmenu;
	}
	
	public Scene getScene() {
		return this.scene;
	}

	public Balance(Stage stage) {
		this.stage = stage;
	}

	
}	
