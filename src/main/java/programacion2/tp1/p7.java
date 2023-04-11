package programacion2.tp1;

import java.util.Scanner;

// Ingresar el radio de un círculo, presentar por pantalla el diámetro, el perímetro y el área
public class p7 {

    double radio, diametro, perimetro, area;
    Scanner teclado = new Scanner(System.in);

    public void circulo() {
        System.out.println("Ingrese el radio del circulo");
        radio = teclado.nextDouble();
        diametro = 2 * radio;
        perimetro = 2 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El DIAMETRO del circulo es " + diametro);
        System.out.println("El PERIMETRO del circulo es " + perimetro);
        System.out.println("El AREA del circulo es " + area);
    }
}
