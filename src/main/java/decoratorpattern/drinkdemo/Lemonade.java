package decoratorpattern.drinkdemo;

public class Lemonade extends Drink {

    private String name;

    public Lemonade() {
        this.name = "lemonade";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void make() {
        System.out.println("This is lemonade");
    }
}
