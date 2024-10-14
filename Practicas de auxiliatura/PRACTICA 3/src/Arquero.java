public class Arquero extends Personaje {
    private int destreza;

    public Arquero(String nombre, int nivel, int puntosDeVida) {
        super(nombre, nivel, puntosDeVida);
        this.destreza = 50;
    }

    public void dispararFlecha() {
        System.out.println("El arquero ha disparado una flecha!");
    }
}
