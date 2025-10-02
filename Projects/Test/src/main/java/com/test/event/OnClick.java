package com.test.event;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class OnClick extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        Button button = new Button("Click");

//        button.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent actionEvent) {
//                System.out.println("You click the button");
//            }
//        });

        button.setOnAction((event) -> {
            layout.setTop(new Label("Thank you! for clicking"));
        });

//        layout.getChildren().add(button);
        layout.setCenter(button);

        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.setTitle("Click Action");
        window.setWidth(800);
        window.setHeight(600);
        window.show();
    }
}
