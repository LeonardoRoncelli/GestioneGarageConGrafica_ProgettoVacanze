module com.example.gestionegaragecongrafica_progettovacanze {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestionegaragecongrafica_progettovacanze to javafx.fxml;
    exports com.example.gestionegaragecongrafica_progettovacanze;
}