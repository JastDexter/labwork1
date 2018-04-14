package com.jastdexter.java.labs.view;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainWindowController {
    private Parent root;
    private Scene scene;

    public Stage getStage() {
        return stage;
    }

    private Stage stage;
    @FXML
    private Button colorSettingsButton;
    @FXML
    private Button chartSettingsButton;
    @FXML
    private Button somethingSettingsButton;

    public MainWindowController(Stage window) {
        this.stage = window;
    }

    public void load() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/layouts/MainWindow.fxml"));
        scene = new Scene(root);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        initLayouts();
        initGraphics();
    }

    private void initGraphics() {
        Image settingsImage = new Image( getClass().getResourceAsStream("/images/settings.png"), 20, 20, false, true);
        chartSettingsButton = (Button)root.lookup("#chartSettingsButton");
        chartSettingsButton.setGraphic(new ImageView(settingsImage));
        colorSettingsButton = (Button)root.lookup("#colorSettingsButton");
        colorSettingsButton.setGraphic(new ImageView(settingsImage));
        somethingSettingsButton = (Button)root.lookup("#somethingSettingsButton");
        somethingSettingsButton.setGraphic(new ImageView(settingsImage));
    }

    private void initLayouts(){

    }


}