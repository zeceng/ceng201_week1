/*
 * Inventory.java
 * Manages a fixed collection of Item objects.
 *
 * Name: Zeynep Ece ÖZASLAN
 * Student ID: 250444039
 * Date: 07.10.2026
 */

package game.inventory;

public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    // Adds an item to the inventory.
    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    // Displays name, genre, and stock count for every item.
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s | %-8s | Stock: %d%n", items[i].getName(), items[i].getGenre(), items[i].getStockCount());
        }
    }

    // Prints each item's name and serial code.
    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            // Accesses package-private getSerialCode() within the same package
            System.out.println(items[i].getName() + " -> " + items[i].getSerialCode());
        }
    }
}