package com.test.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GUI extends Application {

    public static void main(String[] args) {
        launch(GUI.class);
    }

    @Override
    public void start(Stage window) {

        HBox buttons = new HBox();
        buttons.setSpacing(50);
        buttons.getChildren().add(new Button("Save"));
        buttons.getChildren().add(new Button("Delete"));
        buttons.getChildren().add(new Button("Submit"));

        VBox labels = new VBox();
        labels.setSpacing(10);
        labels.getChildren().add(new Label("What's on your mind?"));
        labels.getChildren().add(new Label("FAQ's?"));
        labels.getChildren().add(new Label("Want to send us something?"));

        TextArea massage = new TextArea();
        massage.setPromptText("Write us...");

        HBox secondLayer = new HBox();
        secondLayer.setSpacing(10);
        secondLayer.getChildren().add(labels);
        secondLayer.getChildren().add(massage);

        HBox sendButton = new HBox();
        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        sendButton.getChildren().addAll(spacer, new Button("Send"));


        VBox thirdLayer = new VBox();
        thirdLayer.setSpacing(30);

        thirdLayer.getChildren().add(buttons);
        thirdLayer.getChildren().add(secondLayer);
        thirdLayer.getChildren().add(sendButton);

        Scene scene = new Scene(thirdLayer);

        window.setTitle("Layout Manager");
        window.setScene(scene);
        window.show();
    }
}

