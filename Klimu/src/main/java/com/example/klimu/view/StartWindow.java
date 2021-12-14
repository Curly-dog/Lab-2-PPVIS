package com.example.klimu.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StartWindow extends Application {
    private Button logIn = new Button("Авторизоваться");
    private Button singUp = new Button("Зарегистрироваться");

    private VBox pane = new VBox();
    private static final double START_WINDOW_HEIGHT = Constants.ONE_PART * 2;
    private static final double START_WINDOW_WIDTH = Constants.ONE_PART * 3;

    private static final double BUTTON_WIDTH = Constants.ONE_PART * 2;
    private static final double BUTTON_HEIGHT = Constants.ONE_PART / 3;

    private static final double SPACING = Constants.ONE_PART / 3;

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(pane, START_WINDOW_WIDTH, START_WINDOW_HEIGHT);
        stage.setTitle(Constants.START_WINDOW_NAME);
        stage.setScene(scene);

        logIn.setMinSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        singUp.setMinSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        logIn.setOnAction(event -> new LogInWindow());
        singUp.setOnAction(event -> new SingUpWindow());

        pane.getChildren().addAll(logIn, singUp);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING);

        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}