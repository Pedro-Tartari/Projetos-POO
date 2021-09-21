package br.com.unipar.runner;

import br.com.unipar.entities.*;
import static br.com.unipar.entities.AdditionalType.*;
import static br.com.unipar.entities.FlavorType.*;
import static br.com.unipar.entities.SizeType.*;

/**
 *
 * @author phtar
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order.Builder(COFFE, BIG)
                //.withAdditional(COOKIE)
                //.withAdditional(CONDENSED_MILK)
                .build();

        System.out.println(order.toString());
    }

}
