import java.util.ArrayList;
import java.util.List;

public class Materia {
    private int id;
    private String nombre;
    private List<Materia> correlativas;

    public Materia(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void agregarCorrelativa(Materia materia) {
        this.correlativas.add(materia);
    }
}
