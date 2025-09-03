package model;

public abstract class Food {

    protected int amount;
    protected double price;
    protected boolean isVegetarian;

    public double getPrice(){
        return price;
    }

    public boolean getIsVegetarian(){
        return isVegetarian;
    }

    public abstract double getDiscount();

}
