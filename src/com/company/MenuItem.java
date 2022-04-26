package com.company;

public class MenuItem {

    private double price;
    private String description;
    private String category;
    private boolean isNew = true;


    public MenuItem(double price, String description, String category) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = true;
    }


    // getter for .price
    public double getPrice() {
        return this.price;
    }

    // getter for .description
    public String getDescription() {
        return description;
    }

    // getter for .category
    public String getCategory() {
        return category;
    }

    // getter for .isNew --> notice the syntax is a little different I didn't use getIsNew() -> just isNew() makes sense as it can only return either true or false
    public boolean isNew() {
        return isNew;
    }

    // setter for .price()
    public void setPrice(double price) {
        this.price = price;
    }

    // setter for .description
    public void setDescription(String description) {
        this.description = description;
    }

    // setter for isNew
    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MenuItem menuItem = (MenuItem) o;

        if (Double.compare(menuItem.price, price) != 0) return false;
        if (isNew != menuItem.isNew) return false;
        if (!description.equals(menuItem.description)) return false;
        return category.equals(menuItem.category);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(price);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + description.hashCode();
        result = 31 * result + category.hashCode();
        result = 31 * result + (isNew ? 1 : 0);
        return result;
    }
}
