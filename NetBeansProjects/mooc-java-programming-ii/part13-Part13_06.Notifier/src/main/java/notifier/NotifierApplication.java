package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
//        System.out.println("Hello world!");
        launch(args);
    }

    @Override
    public void start(Stage window) {
        VBox vbox = new VBox();
        
        TextField text = new TextField();
        text.setPromptText("Write something...");
        Label label = new Label(" ");
        Button button = new Button("Update");
        
        
        button.setOnAction((action -> {
            label.setText(text.getText());
        }));
        
        vbox.getChildren().addAll(text, button, label);
        

        window.setScene(new Scene(vbox));
        window.setTitle("Notifier");
        window.show();
    }

}
