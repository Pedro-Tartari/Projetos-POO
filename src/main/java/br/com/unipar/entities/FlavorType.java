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
public enum FlavorType {
    COFFE {
        @Override
        public double getFlavorType() {
            return 1.50;
        }
    },
    COFFEMILK{
        @Override
        public double getFlavorType() {
            return 1.75;
        }
    },
    CHOCOMILK{
        @Override
        public double getFlavorType() {
            return 2.50;
        }
    },
    MOCHA{
        @Override
        public double getFlavorType() {
            return 4.00;
        }
    },
    ESPRESS_PANNA{
        @Override
        public double getFlavorType() {
            return 4.50;
        }
    };

    public abstract double getFlavorType();
}
