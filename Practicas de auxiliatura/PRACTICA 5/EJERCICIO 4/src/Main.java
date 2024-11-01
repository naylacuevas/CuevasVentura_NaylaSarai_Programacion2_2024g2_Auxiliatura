import java.util.List;

public class Main {
    public static void main(String[] args) {
      
        Inventario inventario = new Inventario();

      
        inventario.agregarObjeto(new Objeto("Espada", 3.5));
        inventario.agregarObjeto(new Objeto("Escudo", 5.0));
        inventario.agregarObjeto(new Objeto("Poción", 0.5));
        inventario.agregarObjeto(new Objeto("Armadura", 10.0));
        inventario.agregarObjeto(new Objeto("Daga", 1.0));

       
        List<Objeto> objetosLigero = inventario.filtrarObjetos(objeto -> objeto.getPeso() < 5);
        System.out.println("Objetos con peso menor a 5:");
        objetosLigero.forEach(System.out::println);

      
        List<Objeto> objetosEsp = inventario.filtrarObjetos(objeto -> objeto.getNombre().contains("Esp"));
        System.out.println("\nObjetos cuyo nombre contiene 'Esp':");
        objetosEsp.forEach(System.out::println);

        
        List<Objeto> objetosPesados = inventario.filtrarObjetos(objeto -> objeto.getPeso() > 2);
        System.out.println("\nObjetos con peso mayor a 2:");
        objetosPesados.forEach(System.out::println);
    }
}