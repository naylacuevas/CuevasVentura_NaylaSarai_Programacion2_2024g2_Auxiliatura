
abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void hacerSonido();

    public void mostrarInfo() {
        System.out.println("Animal: " + nombre + ", Edad: " + edad + " años");
    }
}


interface Productor {
    void producir();
}


class Vaca extends Animal implements Productor {
    public Vaca(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La vaca hace: Muu");
    }

    @Override
    public void producir() {
        System.out.println("La vaca está produciendo leche.");
    }
}


class Oveja extends Animal implements Productor {
    public Oveja(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("La oveja hace: Bee");
    }

    @Override
    public void producir() {
        System.out.println("La oveja está produciendo lana.");
    }
}



interface Cuidador {
    void cuidar();
}


class AnimalCuidado extends Animal implements Cuidador {
    public AnimalCuidado(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El animal cuidado hace un sonido.");
    }

    @Override
    public void cuidar() {
        System.out.println("Se está cuidando al animal.");
    }
}