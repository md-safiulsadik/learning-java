package com.test.label;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ButtonLabel extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Label text = new Label("This is a label");
        Button button = new Button("This is a button");

        FlowPane componanteGpr = new FlowPane();

        componanteGpr.getChildren().add(text);
        componanteGpr.getChildren().add(button);

        Scene scene = new Scene(componanteGpr);

        stage.setScene(scene);
        stage.setTitle("Label Button practice");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
