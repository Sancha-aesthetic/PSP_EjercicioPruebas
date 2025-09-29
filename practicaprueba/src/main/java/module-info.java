module es.etg.dam.ejercicioprueba{
    requires javafx.controls;
    requires javafx.fxml;
    requires static lombok;

    opens es.etg.dam.ejercicioprueba to javafx.fxml;
    opens es.etg.dam.ejercicioprueba.view to javafx.fxml;
    exports es.etg.dam.ejercicioprueba.controller;
    exports es.etg.dam.ejercicioprueba.view;

}
