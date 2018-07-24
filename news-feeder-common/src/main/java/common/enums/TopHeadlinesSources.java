package common.enums;

public enum TopHeadlinesSources {

    AFTENPOSTEN("Aftenposten"),
    BLOOMBERG("Bloomberg"),
    CNBC("CNBC"),
    CNN("CNN"),
    ESPN("ESPN"),
    FORTUNE("Fortune"),
    INDEPENDENT("Independent"),
    MARCA("Marca"),
    NRK("NRK"),
    REUTERS("Reuters"),
    TECHCRUNCH("TechCrunch"),
    TECHRADAR("TechRadar");

    private String source;

    TopHeadlinesSources(String source) {
        this.source = source;
    }

    public String getSource() {
        return source;
    }
}
