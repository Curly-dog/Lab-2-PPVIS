package com.example.klimu.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PersonalAreaOfDoctorWindow {
    private Button logOutButton = new Button("Выйти из личного кабинета");
    private Button viewCardButton = new Button("Пациенты");
    private Button diagnosAndLechenieButton = new Button("Назначить приём");
    private Button appointmentsButton = new Button("Расписание");

    private Label headLabel = new Label("Личный кабинет врача");
    private Label centerLabel = new Label("Выберите функцию");

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private VBox centerPane = new VBox();
    private HBox buttonsPane = new HBox();

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 4;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 3;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;
    private static final double SPACING_FOR_CENTER = Constants.ONE_PART / 5;

    public PersonalAreaOfDoctorWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.PERSONAL_AREA_WINDOW_NAME);
        stage.setScene(scene);

        viewCardButton.setOnAction(event -> new PacientsWindow());
        diagnosAndLechenieButton.setOnAction(event -> new SetPriom());
        appointmentsButton.setOnAction(event -> new RaspisanieWindow());

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.getChildren().addAll(centerLabel, viewCardButton, diagnosAndLechenieButton,
                appointmentsButton);
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
