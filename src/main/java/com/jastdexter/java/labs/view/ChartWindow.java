package com.jastdexter.java.labs.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ChartWindow {

    private Parent root;
    private Scene scene;
    private Stage stage;

    public ChartWindow(Stage window) {
        this.stage = window;
    }

    public void load() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/layouts/MainWindow.fxml"));
        scene = new Scene(root);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
    }
}
