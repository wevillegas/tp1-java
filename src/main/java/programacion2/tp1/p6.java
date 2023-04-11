package programacion2.tp1;

import java.util.Scanner;

// // Ingresar los lados de un rectángulo, presentar por pantalla su perímetro y su superficie.
public class p6 {

    float base, altura, perimetro, area;
    Scanner teclado = new Scanner(System.in);

    public void rectangulo() {
        System.out.println("Ingrese el valor de la BASE del rectangulo");
        base = teclado.nextFloat();
        System.out.println("Ingrese el valor de la ALTURA del rectangulo");
        altura = teclado.nextFloat();
        perimetro = 2 * (base + altura);
        area = base * altura;
        System.out.println("El PERIMETRO del rectangulo es igual a " + perimetro);
        System.out.println("El AREA del rectangulo es igual a " + area);
    }
}
