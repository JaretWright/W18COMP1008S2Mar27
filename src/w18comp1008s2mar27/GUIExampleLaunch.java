package w18comp1008s2mar27;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class GUIExampleLaunch extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //if you have a typo in the file name, you will generate an exception
        //called "location is required"
        Parent root = FXMLLoader.load(getClass().getResource("GUIExamplesView.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("GUI Examples");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
