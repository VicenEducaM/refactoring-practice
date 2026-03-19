package refactor;

public class PedidoService {

    private final CalculadorPrecios1 calculadorPrecios1 = new CalculadorPrecios1();

    public void procesarPedido(String idPedido) {
        // 1) Cargar datos
        System.out.println("Cargando pedido " + idPedido + " de la BD...");

        // 2) Calcular precio final (lógica compleja)
        double precioBase = 100.0;
        double impuestos = calculadorPrecios1.calcularImpuestos(precioBase);
        double descuentos = calcularDescuentos(precioBase);
        double total = precioBase + impuestos - descuentos;

        // 3) Enviar notificación
        System.out.println("Pedido " + idPedido + " procesado. Total = " + total);
        enviarEmailConfirmacion(idPedido, total);
    }

    private double calcularImpuestos(double base) {
        return calculadorPrecios1.calcularImpuestos(base);
    }

    private double calcularDescuentos(double base) {
        if (base > 50) return 5.0;
        return 0.0;
    }

    private void enviarEmailConfirmacion(String id, double total) {
        System.out.println("Enviando email de confirmación del pedido " + id + " (total " + total + ")");
    }
}