/*
 * GameShop.java
 * Main driver program testing the inventory system and access controls.
 *
 * Name: Zeynep Ece ÖZASLAN
 * Student ID: 250444039
 * Date: 07.10.2026
 */

import game.inventory.Item;
import game.inventory.Inventory;


public class GameShop {

    public static void main(String[] args) {

        Inventory shop = new Inventory();

        Item item1 = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item item2 = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item item3 = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(item1);
        shop.addItem(item2);
        shop.addItem(item3);

        // Display initial inventory
        shop.displayAll();
        System.out.println();

        // Perform sales
        item1.sell(4);
        item2.sell(6); // Triggers stock warning
        System.out.println();

        // Display updated inventory
        shop.displayAll();
        System.out.println();

        // Audit serial codes from within the inventory package
        shop.auditSerialCodes();

        /*
         * WHY DOES THIS FAIL TO COMPILE IF UNCOMMENTED?
         * ---------------------------------------------------------------------
         * System.out.println(item1.getSerialCode());
         * ---------------------------------------------------------------------
         * Explanation: The getSerialCode() method in Item.java is package-private
         * (it has no access modifier keyword like public or private).
         * This means it can ONLY be called by classes located inside the same
         * package ('game.inventory'). Since 'GameShop' is located in the root
         * package, it cannot access package-private members of 'game.inventory'.
         */
    }
}