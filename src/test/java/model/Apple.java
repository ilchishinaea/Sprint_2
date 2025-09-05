package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{

    protected String colour;

    public Apple (int amount, double price, String colour) {
        this.amount = amount;
        this.price = price;
        this.colour = colour;
        this.isVegetarian = true;
    }

    @Override
    public double getDiscount() {
         if (colour.equals(Colour.RED_COLOUR)) {
             return Discount.SALE;
         } else if (colour.equals(Colour.GREEN_COLOUR)) {
            return 0;
         } else {
            return 0;
        }
    }
}
