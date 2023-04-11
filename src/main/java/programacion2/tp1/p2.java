package programacion2.tp1;

import java.util.Scanner;

// Leer dos números enteros presentar por pantalla el promedio de ellos.
public class p2 {

    float n1, n2, prom;
    Scanner teclado = new Scanner(System.in);

    public void promedio() {
        System.out.println("ingrese el primer numero");
        n1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = teclado.nextInt();
        prom = (n1 + n2) / 2;
        System.out.println("el promedio es" + prom);
    }
}
