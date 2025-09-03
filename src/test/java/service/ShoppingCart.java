package service;

import model.Food;

public class ShoppingCart {

    Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (int i = 0; i < items.length; i++) {
            totalPrice = totalPrice + items[i].getPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceSale() {
        double totalPriceSale = 0.0;

        for (int i = 0; i < items.length; i++) {
            totalPriceSale = totalPriceSale + (items[i].getPrice() - items[i].getPrice() * (items[i].getDiscount() / 100));
        }
        return totalPriceSale;
    }

    public double getTotalPriceIsVegetarian() {
        double totalPriceIsVegetarian = 0.0;

        for (int i = 0; i < items.length; i++) {
            if (items[i].getIsVegetarian() == true) {
                totalPriceIsVegetarian = totalPriceIsVegetarian + items[i].getPrice();
            }
        }
        return totalPriceIsVegetarian;
    }
}
