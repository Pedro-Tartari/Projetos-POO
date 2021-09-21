/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.unipar.entities;

/**
 *
 * @author phtar
 */
public enum SizeType {
    SMALL {
        @Override
        public double getSizeType() {
            return 1;
        }
    },
    MEDIUM{
        @Override
        public double getSizeType() {
            return 1.2;
        }
    },  
    BIG{
        @Override
        public double getSizeType() {
            return 1.35;
        }
    };

    public abstract double getSizeType();
}
