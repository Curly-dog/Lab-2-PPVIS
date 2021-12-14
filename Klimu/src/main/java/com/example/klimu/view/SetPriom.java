package com.example.klimu.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SetPriom {
    private Button addButton = new Button("Добавить");
    private Button backButton = new Button("Вернуться в личный кабинет");

    private Label headLabel = new Label("Авторизоваться:");
    private Label snpDoctorLabel = new Label("ФИО врача:");
    private Label snpPacientLabel = new Label("ФИО пациента:");
    private Label dateAndTimeLabel = new Label("Дата и время:");
    private Label cabinetLabel = new Label("Кабинет:");

    private TextField snpDoctorField = new TextField();
    private TextField snpPacientField = new TextField();
    private TextField dateAndTimeField = new TextField();
    private TextField cabinetField = new TextField();

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private GridPane centerPane = new GridPane();
    private HBox buttonsPane = new HBox();

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 3;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 3;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;
    private static final double SPACING_FOR_BUTTONS = Constants.ONE_PART / 2;

    public SetPriom() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.LOG_IN_WINDOW_NAME);
        stage.setScene(scene);

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.add(snpDoctorLabel, 1, 1);
        centerPane.add(snpPacientLabel, 1, 2);
        centerPane.add(dateAndTimeLabel, 1, 3);
        centerPane.add(cabinetLabel, 1, 4);

        centerPane.add(snpDoctorField, 2, 1);
        centerPane.add(snpPacientField, 2, 2);
        centerPane.add(dateAndTimeField, 2, 3);
        centerPane.add(cabinetField, 2, 4);

        GridPane.setMargin(snpDoctorLabel, new Insets(0, 0, 10, 10));
        GridPane.setMargin(snpPacientLabel, new Insets(0, 0, 10, 10));
        GridPane.setMargin(dateAndTimeLabel, new Insets(0, 0, 10, 10));
        GridPane.setMargin(cabinetLabel, new Insets(0, 0, 0, 10));

        GridPane.setMargin(snpDoctorField, new Insets(0, 0, 10, 10));
        GridPane.setMargin(snpPacientField, new Insets(0, 0, 10, 10));
        GridPane.setMargin(dateAndTimeField, new Insets(0, 0, 10, 10));
        GridPane.setMargin(cabinetField, new Insets(0, 0, 0, 10));
        centerPane.setAlignment(Pos.BOTTOM_LEFT);

        buttonsPane.getChildren().addAll(addButton, backButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(SPACING_FOR_BUTTONS);

        pane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_FOR_WINDOW);

        stage.show();
    }
}
