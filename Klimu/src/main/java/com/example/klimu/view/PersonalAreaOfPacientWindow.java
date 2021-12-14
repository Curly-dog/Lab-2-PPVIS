package com.example.klimu.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonalAreaOfPacientWindow {
    private Button logOutButton = new Button("Выёти из личного кабинета");
    private Button viewCardButton = new Button("Просмотреть карту");
    private Button diagnosAndLechenieButton = new Button("Диагноз и лечение");
    private Button appointmentsButton = new Button("Записи");
    private Button okButton = new Button("Заполнить анкету");

    private Label headLabel = new Label("Личный кабинет пациента");
    private Label centerLabel = new Label("Выберите функцию");

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private VBox centerPane = new VBox();
    private HBox buttonsPane = new HBox();

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 4;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 3;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;
    private static final double SPACING_FOR_CENTER = Constants.ONE_PART / 5;

    public PersonalAreaOfPacientWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.PERSONAL_AREA_WINDOW_NAME);
        stage.setScene(scene);

        viewCardButton.setOnAction(event -> new VirtualMedicalCardWindow());
        diagnosAndLechenieButton.setOnAction(event -> new DiagnozAndLechenieWindow());
        okButton.setOnAction(event -> new WriteAnketaWindow());

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.getChildren().addAll(centerLabel, viewCardButton, diagnosAndLechenieButton,
                appointmentsButton, okButton);
        centerPane.setAlignment(Pos.CENTER_LEFT);
        centerPane.setSpacing(SPACING_FOR_CENTER);

        buttonsPane.getChildren().add(logOutButton);
        buttonsPane.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_FOR_WINDOW);

        stage.show();
    }
}
