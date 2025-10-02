package com.test.event;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Copy extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        HBox components = new HBox();
        components.setSpacing(30);

        TextArea textInput = new TextArea();
        textInput.setWrapText(true);
        textInput.setMinWidth(200);
        textInput.setMaxHeight(50);
        textInput.setPromptText("write something to copy");

        TextArea textOut = new TextArea();
        textOut.setWrapText(true);
        textOut.setMinWidth(200);
        textOut.setMaxHeight(50);
        textOut.setPromptText("Get copy");

        Button button = new Button("Copy");

        button.setOnAction((action -> {
            textOut.setText(textInput.getText());
        }));

        components.getChildren().addAll(textInput, button, textOut);

        stage.setTitle("Copy");
        stage.setScene(new Scene(components));
//        stage.setWidth(800);
        stage.setHeight(600);
        stage.show();
    }
}
