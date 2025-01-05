package com.example.gestionegaragecongrafica_progettovacanze;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
public class HelloController {
    @FXML
    private TextField targaField;
    @FXML
    private TextField marcaField;
    @FXML
    private TextField modelloField;
    @FXML
    private TextField tempoField;
    @FXML
    private TextField boxField;
    @FXML
    private Label risultatoLabel;
    @FXML
    private Button parcheggiaButton;
    @FXML
    private Button ricercaButton;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}