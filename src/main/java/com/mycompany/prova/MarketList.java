/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prova;

import java.util.Scanner;

/**
 *
 * @author Pedro Tartari
 */
public class MarketList {

    //Mercado
    Integer foods, drink, hygiene, cleaning, valTotal;

    //Scann
    Scanner read = new Scanner(System.in);

    //Itens e soma
    Integer[] val = new Integer[5];
    Integer sum = 0;

    void begin() {
        System.out.println("Valor dos produtos + desconto: " + choiceCategory());
    }

    
    Integer choiceCategory() {
        System.out.println("\nEscolha a categoria: ");
        System.out.println("[1] Comida -- [2] Bebidas -- [3] Higiene -- [4] Limpeza");
        int cat = read.nextInt();
        switch (cat) {
            case 1:
                return addValueAndSum() - foods;
            case 2:
                return addValueAndSum() - drink;
            case 3:
                return addValueAndSum() - hygiene;
            case 4:
                return addValueAndSum() - cleaning;
        }
        return valTotal;
    }
    
    Integer addValueAndSum() {
        System.out.println("\nInsira os valores dos produtos: ");
        for (int i = 0; i < 4; i++) {
            val[i] = read.nextInt();
            valTotal = valTotal + val[i];
        }
        System.out.println("\nValor dos produtos -- "+ valTotal);    
        return valTotal;
    }

    

    public static void main(String[] args) {

        MarketList marketHigh = new MarketList();
        marketHigh.foods = 10;
        marketHigh.drink = 5;
        marketHigh.hygiene = 28;
        marketHigh.cleaning = 13;
        marketHigh.valTotal = 0;

        MarketList marketMedium = new MarketList();
        marketMedium.foods = 5;
        marketMedium.drink = 10;
        marketMedium.hygiene = 6;
        marketMedium.cleaning = 3;
        marketMedium.valTotal = 25;

        MarketList marketLow = new MarketList();
        marketLow.foods = 15;
        marketLow.drink = 35;
        marketLow.hygiene = 4;
        marketLow.cleaning = 4;
        marketLow.valTotal = 0;

        Scanner typeMarket = new Scanner(System.in);
        System.out.println("================================================================================");
        System.out.println("--- Esse programa tenta simular 3 mercados, todos com as mesmas categorias  ----");
        System.out.println("------------ Cada categoria tem um valor de desconto diferente -----------------");
        System.out.println("--------- Ele ira somar seus produtos inseridos e aplicar o desconto -----------");
        System.out.println("================================================================================");
        System.out.println("\nEscolha um mercado, cada um tem diferentes descontos!1");
        System.out.println("[1] High // [2] Medium // [3] Low");
        int answer = typeMarket.nextInt();

        switch (answer) {
            case 1:
                marketHigh.begin();
                break;
            case 2:
                marketMedium.begin();
                break;
            default:
                marketLow.begin();
                break;
        }
    }
}
