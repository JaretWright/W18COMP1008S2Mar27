package w18comp1008s2mar27;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class HelloWorldMVCStyleController implements Initializable
{

    /**
     * When the button is pushed, we will write a message to the console
     */
    public void buttonPushed()
    {
        System.out.println("Hello World from inside the MVC GUI");
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        // TODO
    }    
    
}
