package programacion2.tp1;

import java.util.Scanner;

// Dado el precio de un producto indicar, por pantalla, 
// los impuestos que debe pagar. IVA 21%, Ingresos Brutos 2.5% e Impuesto Municipal 1.5%
public class p8 {

    double precio, iva, IB, IM;
    Scanner teclado = new Scanner(System.in);

    public void impuestos() {
        System.out.println("Ingrese el precio del producto");
        precio = teclado.nextDouble();
        iva = precio * 0.21;
        IB = precio * 0.025;
        IM = precio * 0.015;
        System.out.println("IVA = $" + iva);
        System.out.println("Ingresos Brutos = $" + IB);
        System.out.println("Impuesto Municipal = $" + IM);
    }
}
