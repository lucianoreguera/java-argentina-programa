public class Inscripcion {
    private Alumno alumno;
    private Materia materia;

    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
    }

    public boolean aprobada() {
        for (Materia correlativa : materia.getCorrelativas()) {
            if (!alumno.tieneInscripcion(correlativa) || !alumno.getInscripcion(correlativa).aprobada()) {
                return false;
            }
        }
        return true;
    }

    public Materia getMateria() {
        return materia;
    }
}
