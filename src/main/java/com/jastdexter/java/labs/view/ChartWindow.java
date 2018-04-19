package com.jastdexter.java.labs.view;

import com.github.javafx.charts.zooming.ZoomManager;
import com.jastdexter.java.labs.controller.ChartWindowController;
import com.jastdexter.java.labs.model.generator.RandomArrayGenerator;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.AccessibleAction;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.Axis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ChartWindow {

    private Parent root;
    private Scene scene;
    private Stage stage;
    private ChartWindowController controller;
    @FXML
    private AnchorPane anchorPane;
    private LineChart<Number, Number> lineChart;

    public ChartWindow(Stage window, ChartWindowController controller) {
        this.stage = window;
        this.controller = controller;
    }

    public void load() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/layouts/ChartWindow.fxml"));
        scene = new Scene(root);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        initChart();
    }

    public Stage getStage() {
        return stage;
    }

    private void initChart() {
        anchorPane = (AnchorPane)root.lookup("#AnchorPane");
        NumberAxis x = new NumberAxis();
        NumberAxis y = new NumberAxis();

        lineChart = new LineChart<Number, Number>(x,y);
        lineChart.setTitle("Распределение велечин по массиву");
        XYChart.Series series = new XYChart.Series();
        series.setName("Массив");

        lineChart.prefHeightProperty().bind(anchorPane.heightProperty());
        lineChart.prefWidthProperty().bind(anchorPane.widthProperty());
        ObservableList<XYChart.Data> data = FXCollections.observableArrayList();

        controller.setArrayList(new RandomArrayGenerator(),1000,10);
        ArrayList<Double> array = controller.getArrayList();

        for (int i = 0; i < array.size(); i++) {
            data.add(new XYChart.Data<Object, Object>(i, array.get(i)));
        }

        series.setData(data);
        lineChart.setCreateSymbols(false);
        lineChart.setStyle(".chart-series-line {    \n"
                + "    -fx-stroke-width: 1px;\n"
                + "    -fx-effect: null;\n"
                + "}");

        new ZoomManager<Number, Number>(anchorPane, lineChart, series);
        //lineChart.getData().add(series);

        anchorPane.getChildren().add(lineChart);

    }
}
