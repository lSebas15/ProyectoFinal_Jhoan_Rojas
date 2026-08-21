package www.cibertec;

public class Main {

    public static double calcularCostoEntrada(int zona) {
        double precio;

        if (zona == 0) {
            precio = 40.0;
        } else if (zona == 1) {
            precio = 120.0;
        } else {
            precio = 800.0;
        }

            return precio;
    }

    static void main() {

            String fiesta = "pocoyo fest" , ubicacion = "";
            int cantidadEntradas = 1, zona = 3;
            double precioTrago = 196.50, costoEntrada, totalEntradas = 0;

            switch (zona){
                case 1:
                    ubicacion = "General";
                    break;
                case 2:
                    ubicacion = "VIP";
                    break;
                case 3:
                    ubicacion = "Box";
                    break;
            }

            costoEntrada = calcularCostoEntrada(zona);

            for (int i = 1; i <= cantidadEntradas; i++) {
                totalEntradas = totalEntradas + costoEntrada;
                System.out.println("Numero de entrada: " + i + " - Costo: S/." + costoEntrada);
            }

            double totalPagar = totalEntradas + precioTrago;

             // Salida de resultados
                   System.out.println("Fiesta: " + fiesta);
                   System.out.println("Ubicacion: " + ubicacion);
                   System.out.println("Entradas Compradas: S/." + cantidadEntradas);
                   System.out.println("Subtotal Entradas: S/." + totalEntradas);
                   System.out.println("Precio del Trago: S/." + precioTrago);
                   System.out.println("Total a Pagar: S/." + totalPagar);
    }

}

