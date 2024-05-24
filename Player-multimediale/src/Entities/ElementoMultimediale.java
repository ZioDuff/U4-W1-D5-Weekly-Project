package Entities;

public abstract class ElementoMultimediale {
    //    ATTRIBUTI
//    vado a stabile l'attributo generale che avranno tutti i figli di questa classe padre
    protected String title;

    //    COSTRUTTORE
//    questo sarà il costruttore che passerà in eredità nei figli
    public ElementoMultimediale(String title) {
        this.title = title;
    }

    //    METODI
// vado a fare un override del metodo toString per poter visualizzare correttamente l'oggetto
    @Override
    public String toString() {
        return "elementoMultimediale{" +
                "name='" + title + '\'' +
                '}';
    }

    // metoddo per ritornare e stampare il titolo dell 'oggetto
    public String getName() {
        return title;
    }
}
