package br.com.unipar.arre2;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Calculate {

    double totalValue(Size sizes, Drinks drinks, Flavor flavors) {
        double total;
        return total = sizes.getPizzaValue() + flavors.getAdcionalValue() + drinks.getDrinksValue();
    }

    void calculateAndPrint(String size, List flavors, Drinks drinks, Border borders, double value) {
        JOptionPane.showMessageDialog(null,
                "Tamanho Pizza = " + size
                + "\n Sabores = " + flavors
                + "\n Borda = " + borders.getborderFlavorChoice()
                + "\n Bebidas = " + drinks.getDrinksList()
                + "\n Total = " + value);
    }
}
