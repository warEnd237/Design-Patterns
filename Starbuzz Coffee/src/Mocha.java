public class Mocha extends CondimentDecorator{

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
        this.setDescription(beverage.getDescription() + ", Mocha");
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

}
