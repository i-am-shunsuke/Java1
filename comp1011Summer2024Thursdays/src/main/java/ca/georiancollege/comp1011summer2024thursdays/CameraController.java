package ca.georiancollege.comp1011summer2024thursdays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CameraController {

    @FXML
    private TextField color, lens, make, model, sensor;

    @FXML
    private Label error, output;

    @FXML
    void onSubmit(ActionEvent event) {

//        get the text inputted by the user in the textfile
        model.getText();
        error.getText();
        error.setText("something");


        try {
            Camera camera= new Camera(model.getText(), make.getText(),
                    color.getText(), sensor.getText(), lens.getText());
        }
        catch (IllegalArgumentException e){
            error.setText(e.getMessage());
        }

    }


    public void initialize(){
        output.setText("");
        error.setText("");
    }
}
