package es.etg.dam.ejercicioprueba.controller;

import java.io.IOException;

import es.etg.dam.ejercicioprueba.App;
import es.etg.dam.ejercicioprueba.model.Acceder;
import es.etg.dam.ejercicioprueba.model.Alumno;
import es.etg.dam.ejercicioprueba.model.GestionAlumno;
import es.etg.dam.ejercicioprueba.model.AlumnoFabrica;
import es.etg.dam.ejercicioprueba.view.AlumnoViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AlumnoController extends Application{

    // Referencia a la interfaz gráfica para cargarla
    private final static String VIEW_MAIN = "//practicaprueba/src/main/resources/fichaView.fxml";
    private static Scene scene;

    //Lógica de negocio (modelo)
    private static GestionAlumno model;

    @Override
    public void start(Stage stage) throws IOException {

        model = AlumnoFabrica.obtener(Acceder.MOCK);

        stage.setScene(cargarVista(VIEW_MAIN));
        stage.show();
    }

    private Scene cargarVista(String ficheroView) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(ficheroView));
        Parent root = (Parent)fxmlLoader.load();  

        AlumnoViewController AlumnoviewController = fxmlLoader.<AlumnoViewController>getController();
        AlumnoviewController.setAlumnoViewController(this);
        Scene scene = new Scene(root); 
        
        return scene;
    }

    
    public Alumno crear(String nombre, String apellidos){

        Alumno al = new Alumno(nombre, apellidos);
        model.insertar(al);

        return al;
    }
    
}
