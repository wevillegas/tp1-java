package programacion2.tp1;

import java.util.Scanner;

// Ingresar la fecha de nacimiento de una persona con en el formato dd, mm y aaaa. Mostrar por pantalla la edad (años, meses y días)
public class p12 {

    int diaNac, mesNac, anioNac, diaAct, mesAct, anioAct, edad;
    Scanner teclado = new Scanner(System.in);

    public void edad() {
        System.out.println("Ingrese el dia actual");
        diaAct = teclado.nextInt();
        System.out.println("Ingrese el mes actual");
        mesAct = teclado.nextInt();
        System.out.println("Ingrese el año actual");
        anioAct = teclado.nextInt();

        System.out.println("Ingrese el dia de nacimiento");
        diaNac = teclado.nextInt();
        System.out.println("Ingrese el mes de nacimiento");
        mesNac = teclado.nextInt();
        System.out.println("Ingrese el año de nacimiento");
        anioNac = teclado.nextInt();

        if (mesNac < mesAct) {
            edad = anioAct - anioNac;
        } else if (mesAct == mesNac) {
            if (diaNac <= diaAct) {
                edad = anioAct - anioNac;
            } else {
                edad = (anioAct - anioNac) - 1;
            }

        } else if (mesNac > mesAct) {
            edad = (anioAct - anioNac) - 1;
        }
        System.out.println("La edad es " + edad + " años");
    }
}
