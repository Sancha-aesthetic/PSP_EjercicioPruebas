package es.etg.dam.ejercicioprueba;

import es.etg.dam.ejercicioprueba.controller.AlumnoController;
import javafx.application.Application;

/**
 * JavaFX App
 */
public class App {

    public static void main(String[] args) {

        //Instancio el controlador
        AlumnoController controller = new AlumnoController();

        //Inicio la aplicación javafx (se ejecutará el método start del controlador InstitutoController.java)
        Application.launch( AlumnoController.class, args);
    }

}