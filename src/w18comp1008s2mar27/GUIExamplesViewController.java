package w18comp1008s2mar27;

import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class GUIExamplesViewController implements Initializable
{
    @FXML    private CheckBox soccerCheckBox;
    @FXML    private CheckBox videoGameCheckBox;
    @FXML    private CheckBox eatCheckBox;
    @FXML    private CheckBox lasagnaCheckBox;
    @FXML    private TextArea weekendTextArea;

    //These are for the combobox
    @FXML    private ComboBox<String> videoGameComboBox;
    @FXML    private Label videoGameLabel;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        this.videoGameLabel.setText("");
        
        //create a List to populate the ComboBox
        List greatGames = Arrays.asList("A Way Out","Dark Souls","Celeste","Portal","Assasin's Creed");
        this.videoGameComboBox.getItems().addAll(greatGames);
    }    
    
    /**
     * This method will take the value from the comboBox and update the label
     */
    public void comboBoxChanged()
    {
        this.videoGameLabel.setText("The best game is: " + this.videoGameComboBox.getValue());
    }
    
    /**
     * This method will check all of the checkboxes and update the textArea with the
     * items selected
     */
    public void updateWeekendTextArea()
    {
        this.weekendTextArea.setText("");
        
        String output = "My weekend plans are:\n";
        
        if (this.soccerCheckBox.isSelected())
            output += "play soccer\n";
        
        if (this.videoGameCheckBox.isSelected())
            output += "play video games\n";
        
        if (this.eatCheckBox.isSelected())
            output += "eat...it's just fun\n";
        
        if (this.lasagnaCheckBox.isSelected())
            output += "Vlad will make us lasagna";
        
        this.weekendTextArea.setText(output);
    }
    
}
