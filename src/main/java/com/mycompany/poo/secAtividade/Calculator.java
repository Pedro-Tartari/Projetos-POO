/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poo.secAtividade;

import java.util.Scanner;

/**
 *
 * @author Pedro Tartari
 */

public class Calculator {

    Double num1, num2, result;
    String op;
    Integer cont = 0;

    void initialize() {
        do {
            System.out.println("Digite um Numero: ");
            Scanner scanNumber = new Scanner(System.in);
            num1 = scanNumber.nextDouble();

            System.out.println("Qual a operação? [raiz] [+] [-] [/] [*]");
            Scanner scanOperator = new Scanner(System.in);
            op = scanOperator.nextLine();

            if (op.equalsIgnoreCase("raiz")) {
                calculatesqrt();
                System.out.println("Seu resultado é " + result);

                choice();

            } else {
                System.out.println("Digite o Segundo Numero: ");
                Scanner scanNumber2 = new Scanner(System.in);
                num2 = scanNumber2.nextDouble();

                newOptions();

                System.out.println("Seu resultado é " + result);

                choice();
            }
        } while (cont == 1);
    }

    void choice() {
        System.out.println("Continuar? [1] Sim // [2] Não");
        Scanner scanCont = new Scanner(System.in);
        cont = scanCont.nextInt();
    }

    void newOptions() {

        if ("+".equals(op)) {
            result = sum();
        }
        if ("-".equals(op)) {
            result = sub();
        }
        if ("*".equals(op)) {
            result = mult();
        }
        if ("/".equals(op)) {
            result = div();
        }
    }

    Double calculatesqrt() {
        return result = Math.sqrt(num1);
    }

    Double sum() {
        return result = num1 + num2;
    }

    Double sub() {
        return result = num1 - num2;
    }

    Double mult() {
        return result = num1 * num2;
    }

    Double div() {
        return result = num1 / num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.initialize();

    }

}
