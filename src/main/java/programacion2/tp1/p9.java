package programacion2.tp1;

import java.util.Scanner;

// Ingresar dos puntos en el plano P1(x1, y1) y P2(x2, y2), 
// estos corresponden, respectivamente, a los vértices inferior izquierdo y superior derecho de un rectángulo.
// Indicar el perímetro y la superficie del rectángulo.
public class p9 {

    double x1, y1, x2, y2, perimetro, superficie;
    Scanner teclado = new Scanner(System.in);

    public void plano() {
        System.out.println("Ingrese un valor para X1");
        x1 = teclado.nextDouble();
        System.out.println("Ingrese un valor para Y1");
        y1 = teclado.nextDouble();
        System.out.println("Ingrese un valor para X2");
        x2 = teclado.nextDouble();
        System.out.println("Ingrese un valor para Y2");
        y2 = teclado.nextDouble();
        perimetro = (x2 - x1) * 2 + (y2 - y1) * 2;
        superficie = (x2 - x1) * (y2 - y1);
        System.out.println("El perimetro es igual a " + perimetro);
        System.out.println("La superficie es igual a " + superficie);
    }
}
