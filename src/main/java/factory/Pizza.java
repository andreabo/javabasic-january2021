package factory;

public class Pizza {

    private String name;

    Pizza(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void prepare() {
        System.out.println("Preparing");
    }

    public void bake() {
        System.out.println("Baking");
    }

    public void cut() {
        System.out.println("Cutting");
    }

    public void box() {
        System.out.println("Box done!");
    }
}
