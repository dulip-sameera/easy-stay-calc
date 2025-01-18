package com.easystaycalc.app.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
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

    @FXML
    void btnCalculateOnAction(ActionEvent event) {

    }

    @FXML
    void btnClearOnAction(ActionEvent event) {

    }

}
