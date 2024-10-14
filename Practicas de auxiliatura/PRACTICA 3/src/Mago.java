public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
        this.mana = 100;
    }

    public void lanzarHechizo() {
        System.out.println("El mago ha lanzado un hechizo!");
    }
}
