package com.mycompany.poo.secAtividade;

import java.util.Scanner;

/**
 *
 * @author Pedro Tartari
 */
public class Converter {

    Integer measure1, measure2 ;
    Double result, num;
    String choice = "[1] ton -- [2] kg -- [3] g";

    void choice() {
        System.out.println("================ Escolha o tipo de medida =================");
        System.out.println("Digite um valor: ");
        Scanner scanNum = new Scanner(System.in);
        num = scanNum.nextDouble();
        System.out.println("De:");
        System.out.println(choice);
        Scanner scanMea = new Scanner(System.in);
        measure1 = scanMea.nextInt();
        System.out.println("Para: ");
        System.out.println(choice);
        measure2 = scanMea.nextInt();
        bulk();
       
    }

    void bulk() {
        switch (measure1) {
            case 1:
                ton();
                System.out.println("resultado: "+result);
                break;
            case 2:
                kg();
                System.out.println("resultado: "+result);
                break;
            case 3:
                g();
                System.out.println("resultado: "+result);
                break;
        }

    }

    double ton() {
        if (measure2 == 2) {
            return result = num * 1000;
        } else {
            return result = num * 10000;
        }

    }

    double kg() {
        if (measure2 == 1) {
            return result = num / 1000;
        } else {
            return result = num * 1000;
        }
    }

    double g() {
        if (measure2 == 2) {
            return result = num / 1000;
        } else {
            return result = num / 1000000;
        }
    }

    public static void main(String[] args) {
        Converter unity = new Converter();
        unity.choice();
    }

}
