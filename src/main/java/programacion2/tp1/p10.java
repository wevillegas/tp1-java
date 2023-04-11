package programacion2.tp1;

import java.util.Scanner;

// Resolver un sistema de dos ecuaciones lineales con dos incógnitas
public class p10 {

    int a, b, c, d, e, f, mx, my, m, y, x;
    Scanner teclado = new Scanner(System.in);

    public void ecuaciones() {
        System.out.println("ingrese un numero A:");
        a = teclado.nextInt();
        System.out.println("ingrese un numero B:");
        b = teclado.nextInt();
        System.out.println("ingrese un numero C:");
        c = teclado.nextInt();
        System.out.println("ingrese un numero D:");
        d = teclado.nextInt();
        System.out.println("ingrese un numero E:");
        e = teclado.nextInt();
        System.out.println("ingrese un numero F:");
        f = teclado.nextInt();
        m = a * e - b * d;
        mx = c * e - b * f;
        my = a * f - c * d;
        y = my / m;
        x = mx / m;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }
}
