import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private int id;
    private String nombre;
    private List<Inscripcion> inscripciones;

    public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.inscripciones = new ArrayList<>();
    }

    public Inscripcion inscribir(Materia materia) {
        Inscripcion inscripcion = new Inscripcion(this, materia);
        this.inscripciones.add(inscripcion);
        return inscripcion;
    }

    public boolean tieneInscripcion(Materia materia) {
        return inscripciones.stream().anyMatch(i -> i.getMateria().equals(materia));
    }

    public Inscripcion getInscripcion(Materia materia) {
        return inscripciones.stream().filter(i -> i.getMateria().equals(materia)).findFirst().orElse(null);
    }
}
