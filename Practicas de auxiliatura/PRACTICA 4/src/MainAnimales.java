public class MainAnimales {
    public static void main(String[] args) {
        Vaca vaca = new Vaca("Bessie", 5);
        vaca.mostrarInfo();
        vaca.hacerSonido();
        vaca.producir();

        Oveja oveja = new Oveja("Fleecy", 3);
        oveja.mostrarInfo();
        oveja.hacerSonido();
        oveja.producir();
    }
}
