package enums;

public enum Glass {
    JIRAFA("Jirafa", 3000),
    JARRA("Jarra", 1000),
    VASO("Vaso", 570),
    BOTELLA("Botella", 350);

    private String type;
    private int cc;

    private Glass(String type, int cc){
        this.type = type;
        this.cc = cc;
    }

    public int getCC() {
        return cc;
    }

    public String getType() {
        return type;
    }
}
