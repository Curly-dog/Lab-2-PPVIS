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

public class VirtualMedicalCardWindow {
    private Button backButton = new Button("Вернуться в личный кабинет");

    private Label headLabel = new Label("Виртуальную медицинская карта");

    private Label[] labels = { new Label("ФИО:"), new Label("Дата рождения:"),
            new Label("Место проживания:"), new Label("Рост(см):"), new Label("Вес:"),
            new Label("Аллергии(Если есть, то указать):"), new Label("Болезни:"), new Label("Прививки:"),
            new Label("Симптомы текущей болезни:"), new Label("Диагноз:"), new Label("Лечение:") };

    private VBox pane = new VBox();
    private HBox headerPane = new HBox();
    private GridPane centerPane = new GridPane();
    private HBox buttonsPane = new HBox();

    private static final double LOG_IN_WINDOW_HEIGHT = Constants.ONE_PART * 4;
    private static final double LOG_IN_WINDOW_WIDTH = Constants.ONE_PART * 4;

    private static final double SPACING_FOR_WINDOW = Constants.ONE_PART / 4;

    public VirtualMedicalCardWindow() {
        Stage stage = new Stage();
        Scene scene = new Scene(pane, LOG_IN_WINDOW_WIDTH, LOG_IN_WINDOW_HEIGHT);
        stage.setTitle(Constants.VIRTUAL_CARD_WINDOW_NAME);
        stage.setScene(scene);

        headerPane.getChildren().add(headLabel);
        headerPane.setAlignment(Pos.CENTER);

        for (int i = 0; i < labels.length; i++) {
            centerPane.add(labels[i], 1, i + 1);
            GridPane.setMargin(labels[i], new Insets(0, 0, 10, 20));
        }
        centerPane.setAlignment(Pos.BOTTOM_LEFT);

        buttonsPane.getChildren().add(backButton);
        buttonsPane.setAlignment(Pos.CENTER);

        pane.getChildren().addAll(headerPane, centerPane, buttonsPane);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(SPACING_FOR_WINDOW);

        stage.show();
    }
}
