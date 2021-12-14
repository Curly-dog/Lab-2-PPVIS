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

public class CardWindow {
    private Button applyButton = new Button("Подтвердить");
    private Button backButton = new Button("Отмена");

    private Label headLabel = new Label("Заполните виртуальную карту");

    private Label[] labels = { new Label("ФИО:"), new Label("Дата рождения:"),
            new Label("Место проживания:"), new Label("Рост(см):"), new Label("Вес:"),
            new Label("Аллергии(Если есть, то указать):"), new Label("Болезни:"), new Label("Прививки:") };

    private TextField[] fields = { new TextField(), new TextField(), new TextField(), new TextField(),
            new TextField(), new TextField(), new TextField(), new TextField() };

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private GridPane centerPane = new GridPane();
    private HBox buttonsPane = new HBox();

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 4;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 4;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;
    private static final double SPACING_FOR_BUTTONS = Constants.ONE_PART * 2;

    public CardWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.CARD_WINDOW_NAME);
        stage.setScene(scene);

        applyButton.setOnAction(event -> {
            new PersonalAreaOfPacientWindow();
            new PersonalAreaOfDoctorWindow();
        });

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        for (int i = 0; i < labels.length; i++) {
            centerPane.add(labels[i], 1, i + 1);
            centerPane.add(fields[i], 2, i + 1);
            GridPane.setMargin(labels[i], new Insets(0, 0, 10, 20));
            GridPane.setMargin(fields[i], new Insets(0, 20, 10, 10));
        }
        centerPane.setAlignment(Pos.BOTTOM_LEFT);

        buttonsPane.getChildren().addAll(applyButton, backButton);
        buttonsPane.setAlignment(Pos.CENTER);
        buttonsPane.setSpacing(SPACING_FOR_BUTTONS);

        pane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_FOR_WINDOW);

        stage.show();
    }
}
