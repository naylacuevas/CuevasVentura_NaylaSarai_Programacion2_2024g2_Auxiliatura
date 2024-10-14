public class MainAnimalesCuidados {
    public static void main(String[] args) {
        AnimalCuidado animalCuidado = new AnimalCuidado("CACHORRO", 2);
        animalCuidado.mostrarInfo();
        animalCuidado.hacerSonido();
        animalCuidado.cuidar();
    }
}