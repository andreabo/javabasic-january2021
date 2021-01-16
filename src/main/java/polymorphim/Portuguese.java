package polymorphim;

import sun.jvm.hotspot.debugger.Address;

public class Portuguese implements IPerson{
    private String name;

    public Portuguese(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String speak() {
        return "Portugues";
    }
}
