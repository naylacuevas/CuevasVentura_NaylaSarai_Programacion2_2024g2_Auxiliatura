public class Vampiro extends Enemigo {
    public Vampiro(String nombre, int puntosDeVida, int dañoBase) {
        super(nombre, puntosDeVida, dañoBase);
    }

    @Override
    public int atacar() {
        int daño = super.atacar();
        super.recibirDaño(-daño / 2); // Robar vida
        return daño;
    }
}