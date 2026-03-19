package refactor;


public class PrecioViewInLine {
    public static void main(String[] args) {
        double precio = 12.5;
        double iva = 0.21;

        System.out.println("Precio final: " + (precio * (1 + iva)));
    }
}
