public class Jefe extends Enemigo {
    private double multiplicadorDeDaño;

    public Jefe(String nombre, int puntosDeVida, int dañoBase, double multiplicadorDeDaño) {
        super(nombre, puntosDeVida, dañoBase);
        this.multiplicadorDeDaño = multiplicadorDeDaño;
    }

    public void hablar() {
        System.out.println("Soy el jefe, y te voy a destruir!");
    }

    public int ataqueCritico() {
        return (int) (super.atacar() * multiplicadorDeDaño);
    }
}