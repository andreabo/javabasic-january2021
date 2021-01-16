package factory;

public class PizzaTestDrive {

    public static void main(String[] args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("chesse");
        System.out.println("Carol ordered a " +pizza.getName() + " pizza");
    }
}
