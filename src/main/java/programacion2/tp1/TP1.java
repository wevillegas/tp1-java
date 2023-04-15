package programacion2.tp1;

import java.util.Scanner;

public class TP1 {

    public static void main(String[] args) {

        int ejercicio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el numero de ejercicio que desea ejecutar");
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
        }

    }
}
