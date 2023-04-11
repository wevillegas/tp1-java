package programacion2.tp1;

import java.util.Scanner;

// Ingresar tres números, ordenarlos en forma ascendente y presentarlos por pantalla. 
// En caso de ser iguales imprimir un mensaje que diga " Son Iguales"
public class p14 {

    int a, b, c;
    Scanner teclado = new Scanner(System.in);

    public void numerosAscendentes() {
        System.out.println("Ingrese el primer valor");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        b = teclado.nextInt();
        System.out.println("Ingrese el tercer valor");
        c = teclado.nextInt();

        if (a == b || b == c || a == c) {
            System.out.println("Los numeros son iguales");
        } else if (a < b) {
            if (b < c) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
            } else if (a < c) {
                System.out.println(a);
                System.out.println(c);
                System.out.println(b);
            } else {
                System.out.println(c);
                System.out.println(a);
                System.out.println(b);
            }

        } else if (a < c) {
            System.out.println(b);
            System.out.println(a);
            System.out.println(c);
        } else if (b < c) {
            System.out.println(b);
            System.out.println(c);
            System.out.println(a);
        } else {
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }
    }
}
