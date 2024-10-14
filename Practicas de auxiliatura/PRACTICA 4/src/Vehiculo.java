
abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int velocidadMaxima;

    public Vehiculo(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public abstract void acelerar();

    public void mostrarInfo() {
        System.out.println("Vehículo: " + marca + " " + modelo + ", Velocidad máxima: " + velocidadMaxima + " km/h");
    }
}


interface Turbo {
    void activarTurbo();
}


class Coche extends Vehiculo {
    public Coche(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("El coche está acelerando.");
    }
}

class Moto extends Vehiculo implements Turbo {
    public Moto(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("La moto está acelerando.");
    }

    @Override
    public void activarTurbo() {
        System.out.println("La moto ha activado el turbo.");
    }
}


interface GPS {
    void mostrarRuta();
}


class VehiculoGPS extends Vehiculo implements GPS {
    public VehiculoGPS(String marca, String modelo, int velocidadMaxima) {
        super(marca, modelo, velocidadMaxima);
    }

    @Override
    public void acelerar() {
        System.out.println("El vehículo GPS está acelerando.");
    }

    @Override
    public void mostrarRuta() {
        System.out.println("Mostrando ruta en el GPS...");
    }
}
