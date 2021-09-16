package com.mycompany.revisao;

import java.util.Scanner;

/**
 *
 * @author Pedro Tartari
 */
public class Bhaskara {

    Scanner read = new Scanner(System.in);

    int a, b, c, cont;
    double delta, x1, x2, x11, x22;

    void deltaCalculation() {

        do {
            System.out.println("Digite o valor de A, B e C respectivamente: ");
            a = Integer.parseInt(read.next());
            b = Integer.parseInt(read.next());
            c = Integer.parseInt(read.next());

            System.out.println("Delta: " + delta());

            if (delta >= 0) {
                calculaX();
                choice();
            } else {
                System.out.println("Delta não possui raiz!");
                choice();
            }

        } while (cont == 1);
    }

    double delta() {
        return delta = (b * b) + (-4 * (a * c));
    }

    void choice() {
        System.out.println("Continuar? [1] Sim // [2] Não");
        Scanner scanCont = new Scanner(System.in);
        cont = scanCont.nextInt();
    }

    void calculaX() {

        x1 = ((-b + Math.sqrt(delta))  );
        x2 = ((-b - Math.sqrt(delta)) );
        
        x11 = x1 / (2* a);
        x22 = x2 / (2* a);
                
        System.out.println("x1 = " + x11);
        System.out.println("x2 = " + x22);

    }

    public static void main(String[] args) {
        Bhaskara bhask = new Bhaskara();
        bhask.deltaCalculation();

    }

}
