public class Tarea {
    private String nombre;
    private int nivel;
    private boolean completada;

    public Tarea(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.completada = false;
    }

    public boolean isCompletada() {
        return this.completada;
    }
}