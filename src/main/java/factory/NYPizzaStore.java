package factory;

public class NYPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(String item) {
        if(item.equals("chesse")){
            return new NYStyleCheesePizza("chesse");
        }else if(item.equals("veggie")){
            return new NYStyleVeggiePizza("veggie");
        }else if(item.equals("clam")){
            return new NYStyleClamPizza("clamm");
        }else if(item.equals("pepperoni")){
            return new NYStylePepperoniPizza("pepperoni");
        }else{
            return null;
        }
    }
}
