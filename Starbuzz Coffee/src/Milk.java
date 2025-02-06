public class Milk extends CondimentDecorator{

    public Milk(Beverage beverage) {
        this.beverage = beverage;
        this.setDescription(beverage.getDescription() + ", Milk");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
