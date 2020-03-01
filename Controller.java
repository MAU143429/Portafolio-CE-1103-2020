package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class Controller {
    public TextArea chat;
    public TextArea sendbox;



    public void pressButton(ActionEvent event){
        String text = sendbox.getText();
        sendbox.clear();
        chat.appendText("USER 1:" + text+ "\n");




    }
}
