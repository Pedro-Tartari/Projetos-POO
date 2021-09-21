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
public class Order {

    private double flavor;
    private double size;
    private double addicional;

    public static class Builder {

        private double flavor;
        private double size;
        private double addicional;

        public Builder(FlavorType flavor, SizeType size) {
            this.flavor = flavor.getFlavorType();
            this.size = size.getSizeType();
        }

        public Builder withAdditional(AdditionalType addicional) {
            this.addicional += addicional.getAdditionalType();
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    private Order(Builder builder) {
        this.flavor = builder.flavor;
        this.size = builder.size;
        this.addicional = builder.addicional;

    }

    public double total() {
        return (this.flavor * this.size) + this.addicional;
    }

    @Override
    public String toString() {
        return "Order{" + "flavor=" + flavor + ", size=" + size + ", addicional=" + addicional + ", total=" + total() + '}';
    }

}
