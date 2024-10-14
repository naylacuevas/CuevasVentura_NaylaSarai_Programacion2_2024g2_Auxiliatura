public abstract class Enemigo {
    private String nombre;
    private int puntosDeVida;
    private int dañoBase;

    public Enemigo(String nombre, int puntosDeVida, int dañoBase) {
        this.nombre = nombre;
        this.puntosDeVida = puntosDeVida;
        this.dañoBase = dañoBase;
    }

    public int atacar() {
        return dañoBase;
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
    }

    public boolean estaVivo() {
        return puntosDeVida > 0;
    }
}