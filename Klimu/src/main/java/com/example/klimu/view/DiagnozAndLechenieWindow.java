package com.example.klimu.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DiagnozAndLechenieWindow {
    private Button backButton = new Button("Вернуться в личный кабинет");

    private Label headLabel = new Label("Диагноз и лечение");
    private Label loginLabel = new Label("Ваш текущий диагноз:");
    private Label passwordLabel = new Label("Лечение:");

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private GridPane centerPane = new GridPane();
    private HBox buttonsPane = new HBox();

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 2;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 3;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;
    private static final double SPACING_FOR_BUTTONS = Constants.ONE_PART / 2;

    public DiagnozAndLechenieWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.DIAGNOS_AND_LECHENIE_WINDOW_NAME);
        stage.setScene(scene);

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.add(loginLabel, 1, 1);
        centerPane.add(passwordLabel, 1, 2);
        GridPane.setMargin(loginLabel, new Insets(0, 0, 10, 10));
        GridPane.setMargin(passwordLabel, new Insets(0, 0, 0, 10));
        centerPane.setAlignment(Pos.BOTTOM_LEFT);

        buttonsPane.getChildren().add(backButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(SPACING_FOR_BUTTONS);

        pane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_FOR_WINDOW);

        stage.show();
    }
}
