package es.etg.dam.ejercicioprueba.view;
import es.etg.dam.ejercicioprueba.controller.AlumnoController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AlumnoViewController {

    
    @FXML
    private Button btnCrear;

    @FXML
    private TextField txtApellidos;

    @FXML
    private TextField txtNombre;

    protected AlumnoViewController AlumnoViewController;

    public void setalumnoController(AlumnoViewController controller){
        this.AlumnoViewController = controller;
    }

    @FXML
    void crear(ActionEvent event) {
        final String MSG_TITLE =  "Error en el formulario";
        final String MSG_CONTENT = "Todos los campos son obligatorios";

        if(camposRellenos()){
            AlumnoViewController.crear(txtNombre.getText(), txtApellidos.getText());
        }else{
            Alert alerta = new Alert(AlertType.ERROR);
            alerta.setTitle(MSG_TITLE);
            alerta.setContentText(MSG_CONTENT);
            alerta.show();
        }

    }

    private boolean camposRellenos(){
        return campoRelleno(this.txtApellidos) && campoRelleno(this.txtNombre);
    }

    private boolean campoRelleno(TextField campo){
        boolean relleno = false;
        if(campo!=null && !"".equals(campo.getText().trim())){
            relleno = true;
        }
        return relleno;
    }

}


