public class Whip extends CondimentDecorator{

    public Whip(Beverage beverage) {
        this.beverage = beverage;
        this.setDescription(beverage.getDescription() + ", Whip");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
