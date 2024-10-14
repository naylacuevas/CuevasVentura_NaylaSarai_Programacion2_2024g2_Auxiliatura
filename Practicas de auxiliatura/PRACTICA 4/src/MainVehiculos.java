public class MainVehiculos {
    public static void main(String[] args) {
        Coche coche = new Coche("Ford", "Mustang", 250);
        coche.mostrarInfo();
        coche.acelerar();

        Moto moto = new Moto("Yamaha", "R1", 300);
        moto.mostrarInfo();
        moto.acelerar();
        moto.activarTurbo();
    }
}