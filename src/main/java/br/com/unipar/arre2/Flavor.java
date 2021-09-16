package br.com.unipar.arre2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Flavor {

    private List<String> listFlavor = new ArrayList();
    private List<String> listFlavorAdcional = new ArrayList();
    private List<String> listConcFlavor = new ArrayList();
    private List<String> listChoiceFlavor = new ArrayList();

    private double adcionalValue;

    String showFlavors() {
        listFlavor.add("Cheddar");
        listFlavor.add("Salmão com Alcaparras");
        listFlavor.add("Camarão");
        listFlavor.add("Calabresa");
        listFlavor.add("Chocolate");
        listFlavor.add("Prestigio");
        listFlavor.add("Frango Catupiry");
        listFlavor.add("5 Queijos");
        listFlavor.add("Abacaxi com Canela");

        listFlavorAdcional.add("    ---------    Valor Adicional 3,50");
        listFlavorAdcional.add("  ----------  Valor Adicional 4,00");
        listFlavorAdcional.add("   ---------    Valor Adicional 4,50");

        for (int i = 0; i < Math.max(listFlavor.size(), listFlavorAdcional.size()); i++) {
            listConcFlavor.add(((i >= listFlavor.size()) ? "" : listFlavor.get(i)) + " " + ((i >= listFlavorAdcional.size()) ? "" : listFlavorAdcional.get(i)));
        }//Professor, acabei por pegar esse trecho acima da internet, não consegui fazer ele comparar o tamno das duas listas. É puramente estetíco.

        String temp = "";
        for (String item : listConcFlavor) {
            temp += item + "\n";
        }

        return temp;
    }

    List pickFlavors(int qtd) {
        JOptionPane.showMessageDialog(null, showFlavors());
        for (int i = 0; i < qtd; i++) {
            String newItem = JOptionPane.showInputDialog("Digite o " + (i + 1) + "º sabor com a primeira letra em Maísculo: ");
            listChoiceFlavor.add(newItem);
            if (listChoiceFlavor.retainAll(listFlavor) == true) {
                JOptionPane.showMessageDialog(null, "Sabor não encontrado");
                return null;
            }
        }
        pickFlavorSpecialValue();
        return listChoiceFlavor;
    }

    void pickFlavorSpecialValue() {

        for (String item : listChoiceFlavor) {
            if (item.equalsIgnoreCase("cheddar")) {
                adcionalValue += 3.50;
            }
            if (item.equalsIgnoreCase("salmão com alcaparras")) {
                adcionalValue += 4.00;
            }
            if (item.equalsIgnoreCase("camarão")) {
                adcionalValue += 4.50;
            }
        }
    }

    //Gets e Sets
    public double getAdcionalValue() {
        return this.adcionalValue;
    }

    public void setAdcionalValue(double adcionalValue) {
        this.adcionalValue += adcionalValue;
    }

}
