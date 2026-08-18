public class Mago extends Tarea {
    private int inteligencia;
    private int mana;

    public Mago(String nombre, int nivel, int inteligencia, int mana) {
        super(nombre, nivel);
        this.inteligencia = inteligencia;
        this.mana = mana;
    }
    public void lanzarHechizo() {
        System.out.println("¡El mago lanza un hechizo!");
    }
}