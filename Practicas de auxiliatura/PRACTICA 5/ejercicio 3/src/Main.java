public class Main {
    public static void main(String[] args) {
      
        Aventura aventura = new Aventura();

    
        aventura.agregarTarea(() -> System.out.println("Explorar el bosque."));
        aventura.agregarTarea(() -> System.out.println("Recoger hierbas medicinales."));
        aventura.agregarTarea(() -> System.out.println("Luchar contra un monstruo."));
        aventura.agregarTarea(() -> System.out.println("Encontrar un tesoro escondido."));
     
        aventura.iniciar();
    }
}