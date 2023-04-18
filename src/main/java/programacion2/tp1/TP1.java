package programacion2.tp1;

import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {

        int ejercicio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero (del 1 al 14) del ejercicio que desea ejecutar");
        System.out.println("------------------------------------------------------------------");
        System.out.println("1) Ingresar tres números enteros, presentar por pantalla la suma de ellos.");
        System.out.println("2) Leer dos números enteros presentar por pantalla el promedio de ellos");
        System.out.println("3) Ingresar dos números enteros y presentar por pantalla la media geométrica.");
        System.out.println("4) Convertir una medida dada en metros a sus equivalentes en decímetros y centímetros. \n"
                + "Presentar por pantalla las tres magnitudes con sus respectivas unidades");
        System.out.println("5) Convertir temperatura en grados Fahrenheit a grados centígrados. Presentar por \n"
                + "pantalla ambos valores con sus unidades.");
        System.out.println("6) Ingresar los lados de un rectángulo, presentar por pantalla su perímetro y su superficie.");
        System.out.println("7) Ingresar el radio de un círculo, presentar por pantalla el diámetro, el perímetro y el área \n"
                + "del círculo.");
        System.out.println("8) Dado el precio de un producto indicar, por pantalla, los impuestos que debe pagar. IVA \n"
                + "21%, Ingresos Brutos 2.5% e Impuesto Municipal 1.5%.");
        System.out.println("9) Ingresar dos puntos en el plano P1(x1, y1) y P2(x2, y2), estos corresponden, respectivamente, a los vértices inferior izquierdo y superior derecho de un rectángulo. Indicar \n"
                + "el perímetro y la superficie del rectángulo.");
        System.out.println("10) Resolver un sistema de dos ecuaciones lineales con dos incógnitas.");
        System.out.println("11) Ingresar tres valores positivos, indicar si son lados de un triángulo rectángulo. \n"
                + "Presentar por pantalla el mensaje correspondiente.");
        System.out.println("12) Ingresar la fecha de nacimiento de una persona con en el formato dd, mm y aaaa. \n"
                + "Mostrar por pantalla la edad (años, meses y días).");
        System.out.println("13)  Ingresar tres números enteros, determinar si están ordenados en forma ascendente o \n"
                + "descendente, y si son consecutivos. Presentar por pantalla el mensaje correspondiente");
        System.out.println("14) Ingresar tres números, ordenarlos en forma ascendente y presentarlos por pantalla. En \n" +
"caso de ser iguales imprimir un mensaje que diga que Son Iguales");

        ejercicio = teclado.nextInt();

        p1 ejercicio1 = new p1();
        p2 ejercicio2 = new p2();
        p3 ejercicio3 = new p3();
        p4 ejercicio4 = new p4();
        p5 ejercicio5 = new p5();
        p6 ejercicio6 = new p6();
        p7 ejercicio7 = new p7();
        p8 ejercicio8 = new p8();
        p9 ejercicio9 = new p9();
        p10 ejercicio10 = new p10();
        p11 ejercicio11 = new p11();
        p12 ejercicio12 = new p12();
        p13 ejercicio13 = new p13();
        p14 ejercicio14 = new p14();

        switch (ejercicio) {
            case 1:
                ejercicio1.sumar();
                break;
            case 2:
                ejercicio2.promedio();
                break;
            case 3:
                ejercicio3.mediageo();
                break;
            case 4:
                ejercicio4.medidas();
                break;
            case 5:
                ejercicio5.grados();
                break;
            case 6:
                ejercicio6.rectangulo();
                break;
            case 7:
                ejercicio7.circulo();
                break;
            case 8:
                ejercicio8.impuestos();
                break;
            case 9:
                ejercicio9.plano();
                break;
            case 10:
                ejercicio10.ecuaciones();
                break;
            case 11:
                ejercicio11.trianguloRectangulo();
                break;
            case 12:
                ejercicio12.edad();
                break;
            case 13:
                ejercicio13.tresNumeros();
                break;
            case 14:
                ejercicio14.numerosAscendentes();
                break;
            default:
                System.out.println("Numero incorrecto");
                break;
        }

    }
}
