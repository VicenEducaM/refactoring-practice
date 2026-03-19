package refactor;

public class EjemploInlineMethod {

     public double precioFinal(double base) {
            return base - descuentoFijo(base);
        }
        private double descuentoFijo(double base) {
            // Lógica mínima que ha quedado trivial
            return (base > 50) ? 5.0 : 0.0;
        }
}
