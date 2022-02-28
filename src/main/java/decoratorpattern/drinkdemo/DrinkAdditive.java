package decoratorpattern.drinkdemo;

public abstract class DrinkAdditive extends Drink{
    protected Drink drink;

    public DrinkAdditive(Drink drink) {
        this.drink = drink;
    }
}
