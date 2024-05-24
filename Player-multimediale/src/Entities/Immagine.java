package Entities;

import Intafaces.ImageAndVideo;

public class Immagine extends elementoMultimediale implements ImageAndVideo {
    //    ATTRIBUTI
    private int brightness = 1;

    //    COSTRUTTORE
    public Immagine(String title) {
        super(title);
    }

    //    METODI
    public void show() {
        if (this.brightness >= 0 && this.brightness <= 0) {
            System.out.println(this.title);
            printBrightness();

        }
    }

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
