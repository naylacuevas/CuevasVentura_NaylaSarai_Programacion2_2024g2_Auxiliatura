public class Inventario {
    private String[] items;

    public Inventario() {
        items = new String[10]; // Inicializa con 10 espacios
    }

    public void agregarItem(String item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                break;
            }
        }
    }

    public void mostrarItems() {
        for (String item : items) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }
}