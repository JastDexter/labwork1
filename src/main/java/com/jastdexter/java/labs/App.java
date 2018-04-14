package com.jastdexter.java.labs;

import com.jastdexter.java.labs.view.MainWindow;
import javafx.application.Application;
import javafx.stage.Stage;


public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        MainWindow newWindow = new MainWindow(new Stage());
        newWindow.load();
        newWindow.getStage().show();
    }
}



