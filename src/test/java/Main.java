import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args){

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, "red");
        Apple appleGreen = new Apple(8, 60, "green");

        Food[] item = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(item);

        System.out.println("Общая сумма товаров без скидки: " + shoppingCart.getTotalPrice() + " рублей.");
        System.out.println("Общая сумма товаров со скидкой: " + shoppingCart.getTotalPriceSale() + " рублей.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + shoppingCart.getTotalPriceIsVegetarian() + " рублей.");

    }
}
