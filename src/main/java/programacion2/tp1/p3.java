package programacion2.tp1;

import java.util.Scanner;

// Ingresar dos números enteros y presentar por pantalla la media geométrica.
public class p3 {

    double n1, n2, suma, raiz;
    Scanner teclado = new Scanner(System.in);

    public void mediageo() {
        System.out.println("ingrese el primer numero");
        n1 = teclado.nextDouble();
        System.out.println("ingrese el segundo numero");
        n2 = teclado.nextDouble();
        suma = n1 + n2;
        raiz = Math.sqrt(suma);
        System.out.println("La media geometrica es: " + raiz);
    }
}
