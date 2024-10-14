public class MainVehiculosGPS {
    public static void main(String[] args) {
        VehiculoGPS vehiculoGPS = new VehiculoGPS("Toyota", "Corolla", 200);
        vehiculoGPS.mostrarInfo();
        vehiculoGPS.acelerar();
        vehiculoGPS.mostrarRuta();
    }
}