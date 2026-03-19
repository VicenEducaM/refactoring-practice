public class AppMain {
    public static void main(String[] args) {
        Saludador saludador = new Saludador();
        saludador.saludos();
 
        Calculadora calc = new Calculadora();
        int resultado = calc.multiplicar(3, 4);
        System.out.println("Resultado: " + resultado);       
}
}
