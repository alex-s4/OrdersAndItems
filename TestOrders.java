package OrdersAndItems;
import java.util.ArrayList;

public class TestOrders{
    public static void main(String[] args) {
        
        // Menu items
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.name = "mocha";
        item2.name = "latte";
        item3.name = "drip coffee";
        item4.name = "capuccino";

        item1.price = 2.0;
        item2.price = 2.5;
        item3.price = 3.5;
        item4.price = 3.0;
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        // Set each order's name -- "Cindhuri", "Jimmy", "Noah", "Sam".

        order1.name = "Cindhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        // Print the order1 variable to the console to see what happens.
        // Expected output: memory address of order1 object
        System.out.println(order1);
        
        // Predict what will happen if you print order1.total
        // Output: 0.0 - default value for double
        // System.out.println(order1.total);

        // Add item1 to order2's item list and increment the order's total.
        order2.items.add(item1);
        order2.total += item1.price;

        // order3 ordered a cappucino. Add the cappuccino to their order list and to their tab.
        order3.items.add(item4);
        order3.total += item4.price;

        // order4 added a latte. Update accordingly
        order4.items.add(item2);
        order4.total += item2.price;

        // Cindhuri's order is now ready. Update her status.
        order1.ready = true;

        // Sam ordered more drinks - 2 lattes. Update their order as well
        order4.items.add(item2);
        order4.total += item2.price;
        order4.items.add(item2);
        order4.total += item2.price;

        // Jimmy's order is now ready. Update his status.
        order2.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        
        // System.out.printf("Name: %s\n", order1.name);
        // System.out.printf("Total: %s\n", order1.total);
        // System.out.printf("Ready: %s\n", order1.ready);        
    }
}