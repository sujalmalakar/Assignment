
package view;

import controller.DictionaryController;

import javafx.application   .Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class DictionaryView extends Application {

    private DictionaryController controller;

    private TextField wordInput;
    private TextArea meaningArea;

    public void start(Stage stage) {

        controller = new DictionaryController();

        Label title = new Label("Virtual Dictionary");
        Label wordLabel = new Label("Enter a word:");

        wordInput = new TextField();
        Button searchButton = new Button("Search");
        meaningArea = new TextArea();

        wordInput.setPrefWidth(200);
        meaningArea.setPrefWidth(300);
        meaningArea.setPrefHeight(100);

        meaningArea.setEditable(false);

        FlowPane pane = new FlowPane();

        pane.setPadding(new Insets(15));
        pane.setHgap(10);
        pane.setVgap(10);

        pane.getChildren().add(title);
        pane.getChildren().add(wordLabel);
        pane.getChildren().add(wordInput);
        pane.getChildren().add(searchButton);
        pane.getChildren().add(meaningArea);

        searchButton.setOnAction(new EventHandler<ActionEvent>() {

            public void handle(ActionEvent event) {

                String word = wordInput.getText();

                String result = controller.search(word);

                meaningArea.setText(result);
            }
        });

        Scene scene = new Scene(pane, 400, 250);

        stage.setTitle("Virtual Dictionary");
        stage.setScene(scene);
        stage.show();
    }
}
