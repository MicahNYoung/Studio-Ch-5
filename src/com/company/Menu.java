package com.company;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> menuItems;

    // an empty constructor, it just creates an empty list for the menuItems and uses the current time for lastUpdated
    public Menu() {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = new ArrayList<MenuItem>();
    }

    // a constructor that allows the user to create the menu with a pre-existing list of menuItems
    public Menu(ArrayList<MenuItem> items) {
        this.lastUpdated = Date.from(Instant.now());
        this.menuItems = items;
    }

    // getter for .lastUpdated
    public Date getLastUpdated() {
        return lastUpdated;
    }

    // getter for .getMenuItems()
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    // no setters --- as of now I don't think there is any reason to overwrite the properties
    public void addMenuItem(MenuItem newItem){
        menuItems.add(newItem);
    }

    public void removeMenuItem(MenuItem item) {
        menuItems.remove(item);
    }
    //toString

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }
    public void printMenu() {
        for(MenuItem item: menuItems ){
        System.out.println("Menu" +
                "Description: " + item.getDescription() +
                "Price: " + item.getPrice() +
                "Category: " + item.getCategory() +
                '\n');
    }
}

}