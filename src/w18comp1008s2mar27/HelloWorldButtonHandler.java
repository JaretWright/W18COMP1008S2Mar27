package w18comp1008s2mar27;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author JWright
 */
public class HelloWorldButtonHandler implements EventHandler
{

    @Override
    public void handle(Event event)
    {
        System.out.println("Hello World from my custom button handler");
    }
}
