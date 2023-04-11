package programacion2.tp1;

import java.util.Scanner;

// Convertir temperatura en grados Fahrenheit a grados centígrados 
public class p5 {

    float c, f;
    Scanner teclado = new Scanner(System.in);

    public void grados() {
        System.out.println("Ingrese una temperatura en grados Fahrenheit");
        f = teclado.nextFloat();
        c = (f - 32) * 5 / 9;
        System.out.println("La temperatura ingresada es de " + f + " Fahrenheit, y su equivalente en Centigrados es " + c);
    }
}
