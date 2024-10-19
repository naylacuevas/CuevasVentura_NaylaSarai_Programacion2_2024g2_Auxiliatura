public class Main {
    public static void main(String[] args) {
        Store store = new Store();
        
        // Agregar productos electrónicos
        store.addProduct(new Electronic("Laptop", 1000.0));
        store.addProduct(new Electronic("Smartphone", 500.0));
        
        // Agregar accesorios
        store.addProduct(new Accessory("Mouse", 30.0));
        store.addProduct(new Accessory("Keyboard", 70.0));
        
        // Aplicar un descuento del 15%
        Discountable fifteenPercentDiscount = product -> product.getPrice() * 0.85;
        System.out.println("Aplicando un descuento del 15%:");
        store.applyDiscount(fifteenPercentDiscount);

        // Aplicar un descuento combinado de $20 más un 5%
        Discountable combinedDiscount = product -> {
            Double discountedPrice = product.getPrice() - 20.0;
            return discountedPrice * 0.95; // Aplicar 5% adicional
        };
        System.out.println("\nAplicando un descuento combinado de $20 más un 5%:");
        store.applyDiscount(combinedDiscount);
    }
}