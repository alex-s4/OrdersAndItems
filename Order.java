package OrdersAndItems;

import java.util.ArrayList;

/**
 * Order
 */
public class Order {

    String name;
    double total;
    boolean ready;
    ArrayList<Item> items = new ArrayList<Item>();
}