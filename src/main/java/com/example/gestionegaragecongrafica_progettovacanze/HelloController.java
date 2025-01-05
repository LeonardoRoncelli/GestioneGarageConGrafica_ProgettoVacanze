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
    private Button numBoxOccupatiButton;
    @FXML
    private Button numBoxLiberiButton;

    private Garage garage;
    public void initialize() {
        garage = new Garage();

        parcheggiaButton.setOnAction(event -> parcheggiaVeicolo());
        ricercaButton.setOnAction(event -> ricercaVeicolo());
        numBoxOccupatiButton.setOnAction(event -> mostraBoxOccupati());
        numBoxLiberiButton.setOnAction(event -> mostraBoxLiberi());
    }
    private void parcheggiaVeicolo() {
        String targa = targaField.getText();
        String marca = marcaField.getText();
        String modello = modelloField.getText();
        String tempoText = tempoField.getText();
        String boxText = boxField.getText();
        if (targa.isEmpty() || marca.isEmpty() || modello.isEmpty() || tempoText.isEmpty() || boxText.isEmpty()) {
            mostraMessaggio("Errore", "Tutti i campi devono essere compilati!", AlertType.ERROR);
            return;
        }
        try {
            double tempo = Double.parseDouble(tempoText);
            int numBox = Integer.parseInt(boxText);

            Auto auto = new Auto(targa, marca, modello, garage.calcolaPrezzo(tempo), "suv");

            garage.parcheggiaBoxSpecifico(numBox, auto);
            risultatoLabel.setText("Veicolo parcheggiato con successo!");
        } catch (NumberFormatException e) {
            mostraMessaggio("Errore", "Inserisci valori validi per il tempo e il numero del box.", AlertType.ERROR);
        }
    }
    private void ricercaVeicolo() {
        String targa = targaField.getText();
        if (targa.isEmpty()) {
            mostraMessaggio("Errore", "Inserisci una targa da cercare!", AlertType.ERROR);
            return;
        }
        garage.ricercaConTarga(targa);
        risultatoLabel.setText("Veicolo trovato!");
    }
    private void mostraBoxOccupati() {
        int boxOccupati = garage.numBoxOccupati();
        risultatoLabel.setText("Box occupati: " + boxOccupati);
    }
    private void mostraBoxLiberi() {
        int boxLiberi = garage.numBoxLiberi();
        risultatoLabel.setText("Box liberi: " + boxLiberi);
    }
}