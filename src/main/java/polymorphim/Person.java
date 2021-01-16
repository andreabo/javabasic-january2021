package polymorphim;

import sun.jvm.hotspot.debugger.Address;

public class Person implements IPerson{
    private String name;
    private Address address;

    public Person(String name, Address address){
        this.name = name;
        this.address = address;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String speak() {
        return null;
    }
}
