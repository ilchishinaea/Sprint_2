package service;

import model.Food;

public class ShoppingCart {

    Food[] items;

    public ShoppingCart(Food[] items) {

        this.items = items;
    }

    public double getTotalPrice() {
        double totalPrice = 0.0;

        for (Food items : this.items) {
            totalPrice += items.getPrice() * items.getAmount();
        }
        return totalPrice;
    }

    public double getTotalPriceSale() {
        double totalPriceSale = 0.0;

        for (Food items : this.items) {
            totalPriceSale += ((items.getPrice() - items.getPrice() * (items.getDiscount() / 100))) * items.getAmount();
        }
        return totalPriceSale;
    }

    public double getTotalPriceIsVegetarian() {
        double totalPriceIsVegetarian = 0.0;

        for (Food items : this.items) {
            if (items.getIsVegetarian()) {
                totalPriceIsVegetarian += items.getPrice() * items.getAmount();
            }
        }
        return totalPriceIsVegetarian;
    }
}
