package br.com.unipar.arre2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Drinks {

    private List<String> listDrink = new ArrayList();
    private List<String> listChoiceDrink = new ArrayList();

    private double value;
    private double drinksValue;

    String showDrinks() {
        listDrink.add("Coca Cola 2 LT");
        listDrink.add("Cerveja Heineken 330 ML");
        listDrink.add("Suco Pratz 900 ML");
        listDrink.add("Água Mineral 600 ML");

        String temp = "";
        for (String item : listDrink) {
            temp += item + "\n";
        }
        return temp;

    }

    void chooseDrinks() {
        String drinksChoice = JOptionPane.showInputDialog("Bebidas? [Y/N]");
        if (!drinksChoice.equalsIgnoreCase("y")) {
            listChoiceDrink.add("Sem Bebidas");
            return;
        } else {
            String drinksQtdChoice = JOptionPane.showInputDialog("Quantas?");
            pickDrinks(Integer.parseInt(drinksQtdChoice));
        }
    }

    List pickDrinks(int qtd) {
        JOptionPane.showMessageDialog(null, showDrinks());
        for (int i = 0; i < qtd; i++) {
            String newItem = JOptionPane.showInputDialog("Digite a " + (i + 1) + "º bebida: ");
            listChoiceDrink.add(newItem);
        }
        pickDrinksValue();
        return listChoiceDrink;
    }

    void pickDrinksValue() {

        for (String item : listChoiceDrink) {
            if (item.equalsIgnoreCase("Coca Cola 2 LT")) {
                drinksValue += 9.50;
            }
            if (item.equalsIgnoreCase("Cerveja Heineken 330 ML")) {
                drinksValue += 6.50;
            }
            if (item.equalsIgnoreCase("Água Mineral 600 ML")) {
                drinksValue += 3.50;
            }
            if (item.equalsIgnoreCase("Suco Pratz 900 ML")) {
                drinksValue += 12.50;
            }
        }
    }

    //Gets e Sets
    public double getDrinksValue() {
        return this.drinksValue;
    }

    public void setDrinksValue(double drinksValue) {
        this.drinksValue += drinksValue;
    }

    public List getDrinksList() {
        return this.listChoiceDrink;
    }
}
