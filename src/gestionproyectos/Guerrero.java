public class Guerrero extends Tarea {
    private int fuerza;
    private int resistencia;
    
    public Guerrero(String nombre, int nivel, int fuerza, int resistencia) {
        super(nombre, nivel);
        this.fuerza = fuerza;
        this.resistencia = resistencia;
    }
    
}