package com.jastdexter.java.labs.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindow extends Stage {

    public void load() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/layouts/MainWindow.fxml"));
        Scene scene = new Scene(root);
        setTitle("FXML Welcome");
        setScene(scene);
    }


}