public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D add(Vector2D other) {
        return new Vector2D(this.x + other.x, this.y + other.y);
    }

    public Vector2D subtract(Vector2D other) {
        return new Vector2D(this.x - other.x, this.y - other.y);
    }

    public Vector2D multiply(double scalar) {
        return new Vector2D(this.x * scalar, this.y * scalar);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Vector2D a = new Vector2D(1, 2);
        Vector2D b = new Vector2D(3, 4);

        System.out.println("a: " + a);
        System.out.println("b: " + b);

        System.out.println("a + b: " + a.add(b));
        System.out.println("a - b: " + a.subtract(b));
        System.out.println("2 * a: " + a.multiply(2));
    }
}