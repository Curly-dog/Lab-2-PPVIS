package com.example.klimu.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RaspisanieWindow {
    private Button backButton = new Button("Вернуться в личный кабинет");

    private Label headLabel = new Label("Пациенты");

    private TableView tableView = new TableView();
    private TableColumn<String, String> column1 = new TableColumn<>("ФИО врача");
    private TableColumn<String, String> column2 = new TableColumn<>("ФИО пациента");
    private TableColumn<String, String> column3 = new TableColumn<>("Дата и время");
    private TableColumn<String, String> column4 = new TableColumn<>("Кабинет");

    private VBox pane = new VBox();
    private HBox buttonsPane = new HBox();

    private static final double START_WINDOW_HEIGHT = Constants.ONE_PART * 4;
    private static final double START_WINDOW_WIDTH = Constants.ONE_PART * 5;

    private static final double SPACING_FOR_BUTTONS = Constants.ONE_PART * 2;
    private static final double SPACING = Constants.ONE_PART / 5;

    public RaspisanieWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, START_WINDOW_WIDTH, START_WINDOW_HEIGHT);
        stage.setTitle(Constants.START_WINDOW_NAME);
        stage.setScene(scene);

        tableView.getColumns().addAll(column1, column2, column3, column4);

        buttonsPane.getChildren().addAll(backButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(SPACING_FOR_BUTTONS);

        pane.getChildren().addAll(headLabel, tableView, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING);

        stage.show();
    }
}
