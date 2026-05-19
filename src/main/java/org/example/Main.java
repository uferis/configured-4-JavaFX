package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/task-view.fxml")); // why do i need a '/' ?????//??//?/
        Scene scene = new Scene(fxmlLoader.load(), 700, 700); // Size of the screen
        stage.setTitle("To-Do Application"); // Title of the window
        stage.setScene(scene); // Which scene to show
        stage.show(); // Shows
    }

    public static void main(String[] args) {
        launch(); // Launces the program
    }
}