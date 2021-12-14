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

public class LogInWindow {
    private Button logInButton = new Button("Авторизоваться");
    private Button backButton = new Button("Отмена");

    private Label headLabel = new Label("Авторизоваться");
    private Label loginLabel = new Label("Логин");
    private Label passwordLabel = new Label("Пароль");

    private TextField loginField = new TextField();
    private TextField passwordField = new TextField();

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private GridPane centerPane = new GridPane();
    private HBox buttonsPane = new HBox();

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 2;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 3;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;
    private static final double SPACING_FOR_BUTTONS = Constants.ONE_PART / 2;

    public LogInWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.LOG_IN_WINDOW_NAME);
        stage.setScene(scene);

        logInButton.setOnAction(event -> {
            new PersonalAreaOfPacientWindow();
            new PersonalAreaOfDoctorWindow();
        });

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerPane.add(loginLabel, 1, 1);
        centerPane.add(passwordLabel, 1, 2);
        centerPane.add(loginField, 2, 1);
        centerPane.add(passwordField, 2, 2);
        GridPane.setMargin(loginLabel, new Insets(0, 0, 10, 10));
        GridPane.setMargin(passwordLabel, new Insets(0, 0, 0, 10));
        GridPane.setMargin(passwordField, new Insets(0, 0, 0, 30));
        GridPane.setMargin(loginField, new Insets(0, 0, 10, 30));
        centerPane.setAlignment(Pos.BOTTOM_LEFT);

        buttonsPane.getChildren().addAll(logInButton, backButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(SPACING_FOR_BUTTONS);

        pane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_FOR_WINDOW);

        stage.show();
    }
}
