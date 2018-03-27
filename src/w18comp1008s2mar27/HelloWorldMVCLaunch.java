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
public class HelloWorldMVCLaunch extends Application
{
    public static void main(String[] args)
    {
        launch(args);
    }
    
    /**
     * This is where we will add code to load the fxml file and associate
     * the controller, create a scene and add it to the stage
     */
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        //if you have a typo in the file name, you will generate an exception
        //called "location not set"
        Parent root = FXMLLoader.load(getClass().getResource("HelloWorldMVCStyle.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
}
