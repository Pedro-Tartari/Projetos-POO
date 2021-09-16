package br.com.unipar.arre2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Border {

    
    Flavor flavors = new Flavor();
    
    private List<String> listBorder = new ArrayList();
    private String borderFlavorChoice;
    
    String showBorder() {
        listBorder.add("Cheddar");
        listBorder.add("Catupiry");
        listBorder.add("1/2 Nutella 1/2 Doce de Leite");
        listBorder.add("Nutella");

        String temp = "";
        for (String item : listBorder) {
            temp += item + "\n";
        }
        return temp;
    }

    void chooseBorder(String size, Size sizes, Flavor flavors) {
        String borderChoice = JOptionPane.showInputDialog("Com borda? [Y/N]");
        if (!borderChoice.equalsIgnoreCase("y")) {
            borderFlavorChoice = "Sem Borda";
        } else {
            borderFlavorChoice = JOptionPane.showInputDialog(showBorder());
            pickBorderValue(size, sizes);
            pickSpecialValue(borderFlavorChoice, flavors);
        }
    }

    void pickBorderValue(String size, Size sizes) {

        switch (size.toLowerCase()) {
            case "gigante":
                sizes.setPizzaValue(80.0);
            case "familia":
                sizes.setPizzaValue(69.50);
            case "media":
                sizes.setPizzaValue(56.50);
            case "pequena":
                sizes.setPizzaValue(44.50);
        }
    }

    void pickSpecialValue(String border, Flavor flavors) {
        if (border.equalsIgnoreCase("½ Nutella ½ Doce de Leite")) {
            flavors.setAdcionalValue(3);
        }
        if (border.equalsIgnoreCase("Nutella")) {
            flavors.setAdcionalValue(2);
        }
    }

    //Gets e Sets
    public String getborderFlavorChoice() {
        return this.borderFlavorChoice;
    }

    public void setborderFlavorChoice(String borderFlavorChoice) {
        this.borderFlavorChoice = borderFlavorChoice;
    }

}
