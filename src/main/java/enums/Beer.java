package enums;

public class Beer {

    private Glass glass;
    private Brand brand;

    enum Brand {CORONA, HEINEKEN, BBC}

    public Beer(Brand brand, Glass glass){
        this.glass = glass;
        this.brand = brand;
    }

    public void serve() {
        System.out.println("Sirviendo "+glass.getCC()+"cc. de " + brand);
    }
}
