package br.com.unipar.arre2;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro Tartari
 */
public class Size {

    private List<String> listSize = new ArrayList();
    private List<String> listSizeAdcional = new ArrayList();
    private List<String> listConcSize = new ArrayList();
    private List<String> listChoiceSize = new ArrayList();
    
    private Integer qtd;
    private double pizzaValue;

    String showSize() {
        listSize.add("Gigante");
        listSize.add("Família");
        listSize.add("Média");
        listSize.add("Pequena");
        listSize.add("Broto");

        listSizeAdcional.add("--------- 5 pedaços");
        listSizeAdcional.add("--------- 4 pedaços");
        listSizeAdcional.add("--------- 3 pedaços");
        listSizeAdcional.add("--------- 3 pedaços");
        listSizeAdcional.add("--------- 2 pedaços");

        for (int i = 0; i < 5; i++) {
            listConcSize.add(listSize.get(i) + listSizeAdcional.get(i));
        }

        String temp = "";
        for (String item : listConcSize) {
            temp += item + "\n";
        }

        return temp;

    }

    String pickSize() {
        String sizeChoice = JOptionPane.showInputDialog(" ===============================\n Escreva qual o tamanho da pizza desejado \n =============================== \n" + showSize());
        listChoiceSize.add(sizeChoice);
        if (listChoiceSize.retainAll(listSize) == true) {
            JOptionPane.showMessageDialog(null, "Tamanho não encontrado");
            return null;
        }
        stringToInt(sizeChoice);
        return sizeChoice;
    }

    Integer stringToInt(String size) {

        switch (size) {
            case "Gigante":
                pizzaValue = 75.0;
                return qtd = 5;

            case "Família":
                pizzaValue = 66.0;
                return qtd = 4;

            case "Média":
                pizzaValue = 52.0;
                return qtd = 3;

            case "Pequena":
                pizzaValue = 42.0;
                return qtd = 3;

            case "Broto":
                pizzaValue = 28.0;
                return qtd = 2;
        }
        return -3000;
    }

    //Gets e Sets
    public Integer getqtd() {
        return this.qtd;
    }

    public double getPizzaValue() {
        return this.pizzaValue;
    }

    public void setPizzaValue(double pizzaValue) {
        this.pizzaValue = pizzaValue;
    }
}
