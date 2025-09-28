package es.etg.dam.ejercicioprueba.model;

import es.etg.dam.ejercicioprueba.model.mock.AlumnoMock;
import es.etg.dam.ejercicioprueba.model.db.AlumnoDataImp;

public class AlumnoFabrica {
    
    private static GestionAlumno gestionAlumno;

    private static void inicializar(Acceder acceder){

        if(Acceder.DATABASE.equals(acceder)){
            gestionAlumno = new AlumnoDataImp();
        }else{
            gestionAlumno =  new AlumnoMock();
        }

    }

    public static GestionAlumno obtener(){
        return obtener(Acceder.MOCK);
    }

    public static GestionAlumno obtener(Acceder acceder){
        if(gestionAlumno == null){
            inicializar(acceder);
        }

        return gestionAlumno;
            
    }
}
