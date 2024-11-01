public class Main {
    public static void main(String[] args) {
        // Crear un evento
        Evento fiesta = new Evento("FELICIDADES! GANASTE LA LOTERIA!");
        

        // Registrar diferentes notificaciones
        fiesta.registrarNotificacion(mensaje -> System.out.println("NOTIFICACION: " + mensaje));
        

        // Activar el evento
        fiesta.activar();
    }
}