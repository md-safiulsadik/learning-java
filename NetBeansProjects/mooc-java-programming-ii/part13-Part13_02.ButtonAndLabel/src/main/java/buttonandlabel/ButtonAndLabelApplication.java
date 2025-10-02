package buttonandlabel;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;  // ✅ JavaFX Button
import javafx.scene.control.Label;  // ✅ JavaFX Label
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndLabelApplication extends Application {


    public static void main(String[] args) {
       launch(args);
    }

    @Override
    public void start(Stage window) {
        Label testLabel = new Label("This is a label");
        Button button = new Button("Click");
        
        FlowPane compoGroup = new FlowPane();
        
        compoGroup.getChildren().add(testLabel);
        compoGroup.getChildren().add(button);
        
        Scene scene = new Scene(compoGroup);
        
        window.setScene(scene);
        window.setTitle("Button and Labels");
        window.show();
    }

}
