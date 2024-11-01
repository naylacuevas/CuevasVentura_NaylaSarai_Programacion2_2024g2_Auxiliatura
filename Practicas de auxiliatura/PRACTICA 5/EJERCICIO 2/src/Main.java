public class Main {
    public static void main(String[] args) {
        
        Jugador jugador1 = new Jugador("valeria", 100);
        Jugador jugador2 = new Jugador("rodrigo", 150);

        
        jugador1.aplicarBonificacion(puntosBase -> (int) (puntosBase * 0.10));
       
        jugador2.aplicarBonificacion(puntosBase -> 20);

 
        System.out.println(jugador1.getNombre() + " tiene " + jugador1.getPuntos() + " puntos.");
        System.out.println(jugador2.getNombre() + " tiene " + jugador2.getPuntos() + " puntos.");
    }
}