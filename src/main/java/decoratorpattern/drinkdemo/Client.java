package decoratorpattern.drinkdemo;

public class Client {

    public static void main(String[] args) {
        Drink lemonade = new Lemonade();
        Drink lemonadeWithIce = new IceAdditive(lemonade);
        Drink lemonadeWithIceAndSugar = new SugarAdditive(lemonadeWithIce);

        lemonade.make();
        lemonadeWithIce.make();
        lemonadeWithIceAndSugar.make();
    }
}
