package Entities;

import Intafaces.Luminosità;

public class Immagine extends ElementoMultimediale implements Luminosità {
    //    ATTRIBUTI
//    l'immagine avrà come attributo la luminosità che non eredita dal padre
    private int brightness = 1;

    //    COSTRUTTORE
//   qui richiamiamo il costruttore del padre
    public Immagine(String title) {
        super(title);
    }

    //    METODI
//    questo è il metodo per richiamare l'immagine una volta instanziata con le sue propietà
    public void show() {
        if (this.brightness >= 0 && this.brightness <= 10) {
            System.out.println(this.title);
            printBrightness();

        }
    }

    // metodi per impostare la luminosità
    public void setBrightness(int brightness) {
        if (brightness < 0) {
            System.out.println("la luminosita non puo scendere sotto lo 0");
        } else if (brightness > 10) {
            System.out.println("la luminosita non puo salire sopra al 10");
        } else this.brightness = brightness;
    }

    @Override
    public void turnUpBrightness() {
        setBrightness(this.brightness + 1);

    }

    @Override
    public void decreseBrightness() {
        setBrightness(this.brightness - 1);

    }

    @Override
    public void printBrightness() {
        for (int i = 0; i < this.brightness; i++) {
            System.out.println("*");
        }
    }
}
