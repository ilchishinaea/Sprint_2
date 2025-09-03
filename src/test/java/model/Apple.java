package model;

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
         if (colour == "red") {
             return 60;
         } else {
             return 0;
         }
    }
}
