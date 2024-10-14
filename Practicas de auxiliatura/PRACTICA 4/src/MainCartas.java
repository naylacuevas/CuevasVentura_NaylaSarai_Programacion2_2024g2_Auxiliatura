public class MainCartas {
    public static void main(String[] args) {
        CartaNormal cartaNormal = new CartaNormal(7, "Corazones");
        cartaNormal.mostrarCarta();
        cartaNormal.jugar();

        CartaEspecial cartaEspecial = new CartaEspecial(10, "Picas");
        cartaEspecial.mostrarCarta();
        cartaEspecial.jugar();
        cartaEspecial.realizarAccion();
    }
}