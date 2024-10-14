public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
        this.fuerza = 80;
    }

    public void atacar() {
        System.out.println("El guerrero ha realizado un ataque!");
    }
}