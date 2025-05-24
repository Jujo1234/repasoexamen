public class Main {
    public static void main(String[] args) {
        double[] precios = {10.5, 25.3};
        double total = calcularPrecioTotal(precios);

        System.out.println("El precio total es: " + total);
        double precioProducto2 = 25.3;

        double total = calcularPrecioTotal(precioProducto1, precioProducto2);

        System.out.println("El precio total es: " + total);
    }

    public static double calcularPrecioTotal(double precio1, double precio2) {
        return precio1 + precio2;
    }
}
