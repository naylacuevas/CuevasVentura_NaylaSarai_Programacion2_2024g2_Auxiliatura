public class Zombie extends Enemigo {
    public Zombie(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        super.recibirDaño(-5); // Regenerar 5 puntos de vida
        return super.atacar();
    }
}