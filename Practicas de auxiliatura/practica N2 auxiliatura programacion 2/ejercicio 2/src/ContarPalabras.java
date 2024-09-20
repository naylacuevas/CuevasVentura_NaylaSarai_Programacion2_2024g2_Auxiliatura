import java.util.List;

public class ContarPalabras {

    public static int contarPalabrasQueComienzanCon(List<String> palabras, char letra) {
        int contador = 0;
        for (String palabra : palabras) {
            if (palabra.toLowerCase().startsWith(String.valueOf(letra).toLowerCase())) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        List<String> palabras = List.of("Hola", "auxiliar", "aqui", "mi", "tarea");
        char letra = 'a';

        int cantidad = contarPalabrasQueComienzanCon(palabras, letra);
        System.out.println("Cantidad de palabras que comienzan con '" + letra + "': " + cantidad);
    }
}