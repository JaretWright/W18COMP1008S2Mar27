package w18comp1008s2mar27;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JWright
 */
public class HelloWorldFXStyle extends Application
{
    
    @Override
    public void start(Stage primaryStage)
    {
        Button btn = new Button();
        String btnMessage = "Say 'Hello World'";
        btn.setText(btnMessage);
        
        //create an instance of the custom event handler
//        HelloWorldButtonHandler btnHandler = new HelloWorldButtonHandler();
//        btn.setOnAction(btnHandler);
                
//        btn.setOnAction(new EventHandler<ActionEvent>()
//        {
//            @Override
//            public void handle(ActionEvent event)
//            {
//                System.out.println("Hello World!");
//            }
//        });

        //with Lambda notation
        btn.setOnAction(event -> System.out.println("Hello World with Lambda"));
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        launch(args);
    }
    
}
