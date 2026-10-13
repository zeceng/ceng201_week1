/*
 * Item.java
 * Represents a single game title available in the store.
 *
 * Name: Zeynep Ece ÖZASLAN
 * Student ID: 250444039
 * Date: 07.10.2026
 */

package game.inventory;


public class Item {

    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    //Package-private getter for internal inventory auditing.
    //Accessible only within game.inventory package.

    String getSerialCode() {
        return serialCode;
    }

    // Private helper method to verify if requested quantity is in stock.
    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    //Sells specified quantity if stock is sufficient.
    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount -= quantity;
            System.out.println("Sold " + quantity + " copy/copies of " + name + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}

