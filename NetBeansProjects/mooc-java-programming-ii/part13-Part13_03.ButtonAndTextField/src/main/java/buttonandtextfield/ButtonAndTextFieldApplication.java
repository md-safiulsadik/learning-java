package buttonandtextfield;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class, args);
    }

    @Override
    public void start(Stage window) {
        FlowPane components = new FlowPane();
        TextField labelText = new TextField("Write a massage!");
        Button button = new Button("Click");
        
        components.getChildren().add(labelText);
        components.getChildren().add(button);
        
        Scene scene = new Scene(components);
        
        window.setScene(scene);
        window.setTitle("TextFild");
        window.show();
    }

}
