package decoratorpattern.drinkdemo;

public class SugarAdditive extends DrinkAdditive {

    public SugarAdditive(Drink drink) {
        super(drink);
    }

    @Override
    public String getName() {
        return drink.getName() + " with sugar";
    }

    @Override
    public void make() {
        System.out.println("This is " + drink.getName() + " with sugar");
    }
}
