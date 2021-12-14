package com.example.klimu.view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WriteAnketaWindow {
    private Button applyButton = new Button("Подтвердить");
    private Button backButton = new Button("Отмена");

    private Label headLabel = new Label("Заполните анкету:");
    private Label loginLabel = new Label("Введите симпптомы:");
    private Label passwordLabel = new Label("Желаете записаться на приём к врачу?");

    private TextField loginField = new TextField();

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private HBox centerUpPane = new HBox();
    private HBox centerDownPane = new HBox();
    private HBox buttonsPane = new HBox();

    private RadioButton yesRadio = new RadioButton("Да");
    private RadioButton noRadio = new RadioButton("Нет");

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 2;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 4;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;
    private static final double SPACING_FOR_BUTTONS = Constants.ONE_PART * 2;

    public WriteAnketaWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.LOG_IN_WINDOW_NAME);
        stage.setScene(scene);

        applyButton.setOnAction(event -> new PersonalAreaOfPacientWindow());

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        centerUpPane.getChildren().addAll(loginLabel, loginField);
        centerUpPane.setSpacing(40);
        centerUpPane.setAlignment(Pos.CENTER_LEFT);

        centerDownPane.getChildren().addAll(passwordLabel, yesRadio, noRadio);
        centerDownPane.setSpacing(30);
        centerDownPane.setAlignment(Pos.CENTER_LEFT);

        buttonsPane.getChildren().addAll(applyButton, backButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(SPACING_FOR_BUTTONS);

        pane.getChildren().addAll(headerPane, centerUpPane, centerDownPane, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_FOR_WINDOW);

        stage.show();
    }
}
