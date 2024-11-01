import java.util.ArrayList;
import java.util.List;

public class Aventura {
    private List<Tarea> tareas;

    public Aventura() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void iniciar() {
        System.out.println("Iniciando las tareas de la aventura...");
        for (Tarea tarea : tareas) {
            tarea.ejecutar();
        }
    }
}