import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_COLOUR;
import static model.constants.Colour.RED_COLOUR;

public class Main {

    public static void main(String[] args){

        Meat meat = new Meat(5, 100);
        Apple appleRed = new Apple(10, 50, RED_COLOUR);
        Apple appleGreen = new Apple(8, 60, GREEN_COLOUR);

        Food[] item = {meat, appleRed, appleGreen};

        ShoppingCart shoppingCart = new ShoppingCart(item);

        System.out.printf("%nОбщая сумма товаров без скидки: %.2f рублей.", shoppingCart.getTotalPrice());
        System.out.printf("%nОбщая сумма товаров со скидкой: %.2f рублей.", shoppingCart.getTotalPriceSale());
        System.out.printf("%nСумма всех вегетарианских продуктов без скидки: %.2f рублей.", shoppingCart.getTotalPriceIsVegetarian());

    }
}
