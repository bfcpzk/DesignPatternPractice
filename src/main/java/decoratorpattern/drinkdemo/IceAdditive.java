package decoratorpattern.drinkdemo;

public class IceAdditive extends DrinkAdditive {

    public IceAdditive(Drink drink) {
        super(drink);
    }

    @Override
    public String getName() {
        return drink.getName() + " with ice";
    }

    @Override
    public void make() {
        System.out.println("This is " + drink.getName() + " with ice");
    }
}
