package es.etg.dam.ejercicioprueba.model.mock;
import java.util.ArrayList;
import java.util.List;

import es.etg.dam.ejercicioprueba.model.GestionAlumno;
import es.etg.dam.ejercicioprueba.model.Alumno;

public class AlumnoMock implements GestionAlumno{

    private List<Alumno> lista = new ArrayList<>();

    @Override
    public void insertar(Alumno a) {
        lista.add(a);
    }

    @Override
    public void eliminar(Alumno a) {
        lista.remove(a);
    }

    @Override
    public List<Alumno> listarAlumnos() {
        return lista;
    }
    
}
