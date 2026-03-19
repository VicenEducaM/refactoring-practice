package refactor;

    public class PrecioView {
        public static void main(String[] args) {
            double precio = 12.5;
            double iva = 0.21;

            double precioConIva = precio * (1 + iva); // variable a inlinar
            System.out.println("Precio final: " + precioConIva);
        }
    }

