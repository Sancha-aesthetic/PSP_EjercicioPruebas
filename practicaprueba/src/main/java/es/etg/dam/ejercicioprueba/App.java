package es.etg.dam.ejercicioprueba;

import es.etg.dam.ejercicioprueba.controller.AlumnoController;
import javafx.application.Application;

public class App {

    public static void main(String[] args) {

        AlumnoController controller = new AlumnoController();

        Application.launch( AlumnoController.class, args);
    }

}