package com.jastdexter.java.labs;

import com.jastdexter.java.labs.view.MainWindowController;
import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        MainWindowController newWindow = new MainWindowController(new Stage());
        newWindow.load();
        newWindow.getStage().show();
    }
}



