package programacion2.tp1;

import java.util.Scanner;

// Ingresar tres números enteros, presentar por pantalla la suma de ellos.
public class p1 {

    int n1, n2, n3, suma;
    Scanner teclado = new Scanner(System.in);

    public void sumar() {
        System.out.println("ingrese el primer numero");
        n1 = teclado.nextInt();
        System.out.println("ingrese el segundo numero");
        n2 = teclado.nextInt();
        System.out.println("ingrese el tercer numero");
        n3 = teclado.nextInt();
        suma = n1 + n2 + n3;
        System.out.println("La suma es igual a " + suma);
    }
}
