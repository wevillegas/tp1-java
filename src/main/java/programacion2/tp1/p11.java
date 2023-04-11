package programacion2.tp1;

import java.util.Scanner;

// Ingresar tres valores positivos, indicar si son lados de un triángulo rectángulo. Presentar por pantalla el mensaje correspondiente
public class p11 {

    int a, b, c, h, a2, b2, c2, a2b2, b2c2, a2c2;
    Scanner teclado = new Scanner(System.in);

    public void trianguloRectangulo() {
        System.out.println("Ingrese un valor positivo A");
        a = teclado.nextInt();
        System.out.println("Ingrese un valor positivo B");
        b = teclado.nextInt();
        System.out.println("Ingrese un valor positivo C");
        c = teclado.nextInt();
        if (a > 0 && b > 0 && c > 0) {
            a2 = (int) Math.pow(a, 2);
            b2 = (int) Math.pow(b, 2);
            c2 = (int) Math.pow(c, 2);
            a2b2 = a2 + b2;
            b2c2 = b2 + c2;
            a2c2 = a2 + c2;

            // bloques if y else
            h = (int) Math.sqrt(a2b2);
            if (h == c) {
                System.out.println("Los valores ingresados son lados de un triangulo rectangulo");
            } else {
                h = (int) Math.sqrt(b2c2);
                if (h == a) {
                    System.out.println("Los valores ingresados son lados de un triangulo rectangulo");
                } else {
                    h = (int) Math.sqrt(a2c2);
                    if (h == b) {
                        System.out.println("Los valores ingresados son lados de un triangulo rectangulo");
                    } else {
                        System.out.println("Los valores ingresados NO son lados de un triangulo rectangulo");
                    }
                }

            }

        } else {
            System.out.println("Alguno de los numeros no es positivo, vuelva a ingresarlos");
        }
    }
}
