package com.easystaycalc.app.controller;

import com.easystaycalc.app.util.Validation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

public class MainSceneController {

    @FXML
    private Button btnCalculate;

    @FXML
    private Button btnClear;

    @FXML
    private DatePicker dtpkrCheckIn;

    @FXML
    private DatePicker dtpkrCheckOut;

    @FXML
    private Label lblErrorCheckIn;

    @FXML
    private Label lblErrorCheckOut;

    @FXML
    private Label lblErrorGuestCount;

    @FXML
    private Label lblPrice;

    @FXML
    private AnchorPane root;

    @FXML
    private Spinner<Integer> spnrGuestCount;

    private final static int MAX_GUEST_COUNT = 10;
    private final static int MIN_GUEST_COUNT = 1;

    public void initialize() {

        // guest count
        SpinnerValueFactory<Integer> spnrValueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(MIN_GUEST_COUNT, MAX_GUEST_COUNT, 1);
        spnrGuestCount.setValueFactory(spnrValueFactory);
        spnrGuestCount.getEditor().textProperty().addListener((observable, oldGuestCount, newGuestCount) -> {
            try {
                int value = Integer.parseInt(newGuestCount);

                if (!Validation.validGuestCount(value, MIN_GUEST_COUNT, MAX_GUEST_COUNT)) {
                    lblErrorGuestCount.setVisible(true);
                    spnrGuestCount.setStyle("-fx-border-color: red;-fx-border-radius: 5");
                    lblErrorGuestCount.setText("Guest Count must be between " + MIN_GUEST_COUNT + " and " + MAX_GUEST_COUNT + ".");
                    return;
                }

                lblErrorGuestCount.setVisible(false);
                lblErrorGuestCount.setText("");
                spnrGuestCount.setStyle("-fx-border-color: green;-fx-border-radius: 5");
                spnrGuestCount.getValueFactory().setValue(value);

                // calculate stay

            } catch (NumberFormatException e) {
                lblErrorGuestCount.setVisible(true);
                spnrGuestCount.setStyle("-fx-border-color: red;-fx-border-radius: 5");
                lblErrorGuestCount.setText("Please enter a number.");
            }

        });

    }

    @FXML
    void btnCalculateOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

}
