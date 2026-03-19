package refactor;

public class CalculadorPrecios {

    public double calcularImpuestos(double base) {
        return base * 0.21;
    }

    public double calcularDescuentos(double base) {
        if (base > 50) return 5.0;
        return 0.0;
    }
}