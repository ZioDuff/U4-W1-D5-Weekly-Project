package Entities;

public abstract class elementoMultimediale {
    //    ATTRIBUTI
    protected String title;

    //    COSTRUTTORE
    public elementoMultimediale(String title) {
        this.title = title;
    }
//    METODI

    @Override
    public String toString() {
        return "elementoMultimediale{" +
                "name='" + title + '\'' +
                '}';
    }

    public String getName() {
        return title;
    }
}
