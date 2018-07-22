package common.enums;

public enum TopHeadlinesSources {

    AFTENPOSTEN("Aftenposten"),
    BLOOMBERG("Bloomberg"),
    CNBC("CNBC"),
    CNN("CNN"),
    ESPN("ESPN"),
    FORTUNE("FORTUNE"),
    INDEPENDENT("Independent"),
    MARCA("Marca"),
    NRK("NRK"),
    REUTERS("Reuters"),
    TECHCRUNCH("TechCrunch"),
    TECHRADAR("TechRadar");

    private String trans;

    TopHeadlinesSources(String trans) {
        this.trans = trans;
    }

    public String getTrans() {
        return trans;
    }
}
