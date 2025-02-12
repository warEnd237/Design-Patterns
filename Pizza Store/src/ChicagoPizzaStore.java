public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        return switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
        //    case "veggie" -> new ChicagoStyleVeggiePizza();
        //    case "clam" -> new ChicagoStyleClamPizza();
        //    case "pepperoni" -> new ChicagoStylePepperoniPizza();
            default -> null;
        };
    }
}
