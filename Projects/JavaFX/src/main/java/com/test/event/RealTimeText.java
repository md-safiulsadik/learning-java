package com.test.event;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RealTimeText extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        HBox layout = new HBox();

        TextField leftText = new TextField();
        leftText.setPromptText("Write something...");

        TextField rightText = new TextField();
        rightText.setPromptText("Get time text in real time");

        leftText.textProperty().addListener((change, oldVal, newVal) -> {
            System.out.println(oldVal + " --> " + newVal);
            rightText.setText(newVal);
        });

        layout.getChildren().addAll(leftText, rightText);
        layout.setSpacing(50);

        stage.setScene(new Scene(layout));
        stage.setTitle("Changes obs");
        stage.setWidth(400);
        stage.setHeight(300);
        stage.show();
    }
}
