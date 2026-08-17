import java.util.ArrayList;

public class Proyecto {
    private String nombre;
    private ArrayList<Tarea> tareas;

    public Proyecto(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<Tarea>();
    }

    public void agregarTarea(Tarea t) {
        this.tareas.add(t);
    }

    public double calcularAvance() {
        int completadas = 0;
        for (Tarea t : this.tareas) {
            if (t.isCompletada()) {
                completadas++;
            }
        }
        if (this.tareas.size() == 0) {
            return 0;
        }
        return (double) completadas / this.tareas.size() * 100;
    }
}