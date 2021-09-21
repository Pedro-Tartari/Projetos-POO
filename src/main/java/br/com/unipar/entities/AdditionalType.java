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
public enum AdditionalType {
     
    LEMON_ZEST {
        @Override
        public double getAdditionalType() {
            return 0.50;
        }
    },
    CINNAMON_POWDER{
        @Override
        public double getAdditionalType() {
            return 0.75;
        }
    },  
    NEST_MILK{
        @Override
        public double getAdditionalType() {
            return 1.40;
        }
    },  
    SOUR_CREAM_ICE{
        @Override
        public double getAdditionalType() {
            return 1.75;
        }
    },  
    CONDENSED_MILK{
        @Override
        public double getAdditionalType() {
            return 1.85;
        }
    },  
    POWDERED_CHOCOLATE{
        @Override
        public double getAdditionalType() {
            return 1.50;
        }
    },  
     COOKIE{
        @Override
        public double getAdditionalType() {
            return 0.90;
        }
    };

    public abstract double getAdditionalType();
}
