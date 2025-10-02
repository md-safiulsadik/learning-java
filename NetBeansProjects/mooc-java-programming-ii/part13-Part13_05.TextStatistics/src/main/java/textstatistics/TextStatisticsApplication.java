package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {


    public static void main(String[] args) {
//        System.out.println("Hello world!");
        launch(args);
       
    }

    @Override
    public void start(Stage window) {
        
        BorderPane layout = new BorderPane();
        HBox hBox = new HBox();
        
        TextArea input = new TextArea();
        input.setPromptText("Write us...");
        
        hBox.getChildren().add(new Label("Letters: 0"));
        hBox.getChildren().add(new Label("Words: 0"));
        hBox.getChildren().add(new Label("The longest word is:"));
        
        
        layout.setCenter(input);
        layout.setBottom(hBox);
        
        Scene scene = new Scene(layout);
        
        window.setScene(scene);
        window.setTitle("Text statistics");
        window.show();
    }

}
