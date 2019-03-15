import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
public class History {

	Transaction transaction=Transaction.getInstance();
	Entry entry ;
	MainMenu mainmenu ;
	Stage stage ;
	Client oneClient=Client.getInstance();
	Scene scene1, scene2; 
	public History(Stage stage) {
 
		this.stage = stage;
	}
	public void PrepearScenePrevios()
	{
		
		Label b =new Label("Navigation History");
		Label BB =new Label(Integer.toString(transaction.Value[Example.b]));
    	Label Ba =new Label(transaction.TransactionType[Example.b]);
    	System.out.println(Example.i);
    	Button Back =new Button("Back to MainMenu");

        //Drawing grid 
		GridPane grid = new GridPane();
        grid.add(Ba,1,2);
        grid.add(b,3,1);
        grid.add(BB,4,2);
        grid.add(Back,3,3);
        Back.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle (ActionEvent event)
        	{
                stage.setScene(mainmenu.getScene());
        	}
        });
        scene1 =new Scene(grid,300,250);
   }
	
	public void PrepearSceneNext()
	{
		
		Label b =new Label("Navigation History");
		Label BB =new Label(Integer.toString(transaction.Value[Example.b]));
    	Label Ba =new Label(transaction.TransactionType[Example.b]);
    	System.out.println(Example.i);
    	Button Back =new Button("Back to MainMenu");

        //Drawing grid 
		GridPane grid = new GridPane();
        grid.add(Ba,1,2);
        grid.add(b,3,1);
        grid.add(BB,4,2);
        grid.add(Back,3,3);
        Back.setOnAction(new EventHandler<ActionEvent>()
        {
        	public void handle (ActionEvent event)
        	{
                stage.setScene(mainmenu.getScene());
        	}
        });
        scene2 =new Scene(grid,300,250);
   }
	
	public void setMainmenu(MainMenu mainmenu) {
		this.mainmenu = mainmenu;
	}
	
	public Scene getScene2() {
		return this.scene2;
	}
	public Scene getScene1() {
		return this.scene1;
	}
	
}	
