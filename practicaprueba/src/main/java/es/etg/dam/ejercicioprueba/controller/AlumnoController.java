package es.etg.dam.ejercicioprueba.controller;

import java.io.IOException;
import java.util.List;

import es.etg.dam.ejercicioprueba.App;
import es.etg.dam.ejercicioprueba.model.Acceder;
import es.etg.dam.ejercicioprueba.model.Alumno;
import es.etg.dam.ejercicioprueba.model.AlumnoFabrica;
import es.etg.dam.ejercicioprueba.model.GestionAlumno;
import es.etg.dam.ejercicioprueba.view.AlumnoViewController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AlumnoController extends Application{

    private final static String VIEW_MAIN = "fichaView.fxml";
    private static Scene scene;

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
        AlumnoviewController.setAlumnoController(this);
        Scene scene = new Scene(root); 
        
        return scene;
    }

    
    public Alumno crear(String nombre, String apellidos, int edad){

        Alumno al = new Alumno(nombre, apellidos, edad);
        model.insertar(al);

        return al;
    }
    public List<Alumno> listar(){
        return  model.listarAlumnos();
    }
    
}
