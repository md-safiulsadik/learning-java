package com.test.event;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Arrays;

public class TextStatistic extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {

        HBox labels = new HBox();

        Label lettersLabel = new Label("Letters: ");
        Label wordLabel = new Label("Words: ");
        Label longestLabel = new Label("The longest word is: ");

        labels.getChildren().addAll(lettersLabel, wordLabel, longestLabel);
        labels.setSpacing(20);

        TextArea inputText = new TextArea();
        inputText.setPromptText("Write something...");

        inputText.textProperty().addListener((changes, oldVal, newVal) -> {
            int numOfLetters = 0;
            numOfLetters += newVal.length();
            String[] parts = newVal.split(" ");
            int wordsCount = parts.length;
            String longestWord = Arrays.stream(parts)
                    .max((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                    .get();

            lettersLabel.setText("Letters: " + numOfLetters);
            wordLabel.setText("Words: " + wordsCount);
            longestLabel.setText("The longest word is: " + longestWord);
        });

        BorderPane layout = new BorderPane();

        layout.setTop(inputText);
        layout.setBottom(labels);

        stage.setScene(new Scene(layout));
        stage.setTitle("Text Statistic");
        stage.show();
    }
}
