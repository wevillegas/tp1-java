package programacion2.tp1;

import java.util.Scanner;

//Ingresar tres números enteros, 
// determinar si están ordenados en forma ascendente o descendente, 
// y si son consecutivos
public class p13 {

    int a, b, c;
    Scanner teclado = new Scanner(System.in);

    public void tresNumeros() {
        System.out.println("Ingrese el primer valor");
        a = teclado.nextInt();
        System.out.println("Ingrese el segundo valor");
        b = teclado.nextInt();
        System.out.println("Ingrese el tercer valor");
        c = teclado.nextInt();

        if (a > b) {
            if (b > c) {
                if (b == a - 1) {
                    if (c == b - 1) {
                        System.out.println("Decreciente y consecutivo");
                    } else {
                        System.out.println("Decreciente");
                    }

                } else {
                    System.out.println("Decreciente");
                }

            } else {
                System.out.println("Ni ascendente ni decreciente");
            }

        } else if (c > b) {
            if (c == b + 1) {
                if (b == a + 1) {
                    System.out.println("Ascendente y consecutivo");
                } else {
                    System.out.println("Ascendente");
                }

            } else {
                System.out.println("Ascendente");
            }

        } else {
            System.out.println("Ni ascendente ni decreciente");
        }
    }
}
