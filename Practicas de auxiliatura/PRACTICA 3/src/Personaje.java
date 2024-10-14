
public class Personaje {
    private String nombre;
    private int nivel;
    private int puntosDeVida;
    private Inventario inventario;

    public Personaje(String nombre, int nivel, int puntosDeVida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.puntosDeVida = puntosDeVida;
        this.inventario = new Inventario();
    }

    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Nivel: " + nivel);
        System.out.println("Puntos de vida: " + puntosDeVida);
    }

    public void recibirDaño(int daño) {
        puntosDeVida -= daño;
    }

    public void curar() {
        puntosDeVida += 20;
    }

    public int getPuntosDeVida() {
        return puntosDeVida;
    }

    public String getNombre() {
        return nombre;
    }
}