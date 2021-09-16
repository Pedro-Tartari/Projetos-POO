package br.com.unipar.arre2;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Order {

    Size sizes = new Size();
    Flavor flavors = new Flavor();
    Calculate calc = new Calculate();
    Border borders = new Border();
    Drinks drinks = new Drinks();

    public void iniciate() {

        //Captura o tamanho 
        String sizeChoice = sizes.pickSize();
        if (sizeChoice == null) {
            return;
        }

        //Captura os sabores 
        List flavorsChoice = flavors.pickFlavors(sizes.getqtd());
        if (flavorsChoice == null) {
            return;
        }

        //Borda
        if (!sizeChoice.equalsIgnoreCase("broto")) {
            borders.chooseBorder(sizeChoice, sizes, flavors);
        }else{
           borders.setborderFlavorChoice("Sem Borda") ;
        }

        //Bebidas
        drinks.chooseDrinks();
        
        // Calculo Total e Print
        double valueTotal = calc.totalValue(sizes, drinks, flavors);
        calc.calculateAndPrint(sizeChoice, flavorsChoice, drinks, borders, valueTotal);
    }
}
