package programacion2.tp1;

import java.util.Scanner;

// Convertir una medida dada en metros a sus equivalentes en decímetros y centímetros. 
public class p4 {

    double metro, deci, centi;
    Scanner teclado = new Scanner(System.in);

    public void medidas() {
        System.out.println("ingrese un valor en metros");
        metro = teclado.nextDouble();
        deci = metro * 10;
        centi = metro * 100;
        System.out.println("El valor ingresado es de " + metro + " metros y equivale a " + deci + " decimetros y a " + centi + " decimetros");
    }
}
