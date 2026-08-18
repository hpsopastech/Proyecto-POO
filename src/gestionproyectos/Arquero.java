public class Arquero extends Tarea {
    private int punteria;
    private int velocidad;

    public Arquero(String nombre, int nivel, int punteria, int velocidad) {
        super(nombre, nivel);
        this.punteria = punteria;
        this.velocidad = velocidad;
    }
    public void dispararFlecha() {
        System.out.println("¡El arquero dispara una flecha!");
    }
    public void esquivar() {
        System.out.println("¡El arquero esquiva el ataque!");
    }
}