/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.fila;

/**
 *
 * @author phtar
 */
public class Fila<T> {

    private T[] arrayFila;
    private int inicio;
    private int fim;
    
    //Parte mais importante é inserir e Remover

    public Fila(int size) {
        inicio = fim = 0;
        
        //Criamos um novo objeto que é um vetor
        arrayFila = (T[]) new Object[size];
    }

    // Para iniciar a colocada de informações ou então retirada 
    //Precisamos ter a certeza que a lista esta vazia.
    // A lista pode ser casa inicial 1 /10 ou pode ser a posição 5 /10
    
    public boolean estaCheia() {
        //A condição para ela está cheia é também diferente da Pilha. 
        //Uma Fila está cheia quando a subtração do fim pelo início for igual à 1 
        //(fim - início == 1) ou (fim = início - 1).
        
        //o índice do final e do início caminham ao longo da fila. Logo quando o fim for igual ao 
        //tamanho da fila e início for 0, ela também está cheia
        
        return ((fim == arrayFila.length - 1) && (inicio == 0))
                || (fim == inicio - 1);
    }

    public boolean estaVazia() {
        return inicio == fim;
    }

   

    public boolean inserir(T e) {
        //Quando vamos inserir e verificamos que o fim chegou no seu limite, 
        //ele é transportado para o índice 0, para que possamos 
        //inserir mais elementos
        if (fim == arrayFila.length) {
            fim = 0;
        }

        if (!estaCheia()) {
            arrayFila[fim++] = e;
            System.out.println("inserindo - " + fim);
            return true;
        }

        return false;
    }
    
     public T remover() {
        if (!estaVazia()) {

            // Para remover sera semelhante ao de inserir
            if (inicio == arrayFila.length) {
                inicio = 0;
            }

            T e = arrayFila[inicio];
            inicio++;
            return e;
        }

        return null;
    }

    @Override
    public String toString() {

        String s = "[";
        int i = inicio;
        while (i != fim) {
            System.out.println(s);
            if (i == arrayFila.length) {
                i = 0;
            }

            if (i == fim - 1) {
                s += arrayFila[i];
            } else {
                s += arrayFila[i] + " , ";
            }

            i++;

        }

        return s + "]";
    }
}
