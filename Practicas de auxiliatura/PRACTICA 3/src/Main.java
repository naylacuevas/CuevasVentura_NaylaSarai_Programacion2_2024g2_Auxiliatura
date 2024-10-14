public class Main {
    public static void main(String[] args) {
        Mago mago = new Mago("Mago", 5, 100);
        Guerrero guerrero = new Guerrero("Guerrero", 5, 100);

        while (mago.getPuntosDeVida() > 0 && guerrero.getPuntosDeVida() > 0) {
            int dañoMago = (int) (Math.random() * 20) + 10;
            int dañoGuerrero = (int) (Math.random() * 20) + 10;

            mago.recibirDaño(dañoGuerrero);
            guerrero.recibirDaño(dañoMago);

            System.out.println("Estado de los personajes:");
            mago.mostrarEstado();
            guerrero.mostrarEstado();

            if (mago.getPuntosDeVida() > 0) {
                mago.lanzarHechizo();
            }
            if (guerrero.getPuntosDeVida() > 0) {
                guerrero.atacar();
            }
        }

        if (mago.getPuntosDeVida() <= 0) {
            System.out.println("El guerrero ha ganado!");
        } else {
            System.out.println("El mago ha ganado!");
        }
    }
}