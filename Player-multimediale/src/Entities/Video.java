package Entities;

import Intafaces.Luminosità;
import Intafaces.Volume;

public class Video extends ElementoMultimediale implements Luminosità, Volume {
    //    ATTRIBUTI
//    rispetto al padre qui avremo 3 attributi in piu
    private int duration;
    private int brightness = 1;
    private int volume = 1;

    //    COSTRUTTORE
//    questo costruttore è uguale al quello del video
    public Video(String name, int duration, int luminositaVideo) {
        super(name);
        setDuration(duration);
    }


//    METODI
// qui avremo una "concatenzione di metodi" ovvero andremo a prendere i metodi usati precedentemente e li adatteremo al nostro oggetto video

    //    metodo luminosita
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

    //    metodo play
    @Override
    public void play() {
        if (this.duration > 0 && this.volume >= 0 && this.volume <= 10 && this.brightness >= 0 && this.brightness <= 10) {
            for (int i = 0; i < duration; i++) {
                System.out.println(this.title + " " + this.volume);
                ;
            }
            printVolume();
            printBrightness();
        }

    }

    //    metodo volume


    @Override
    public void turnUpVolume() {

        setVolume(this.volume + 1);
    }

    @Override
    public void descreseVolume() {
        setVolume(this.volume - 1);

    }

    @Override
    public void printVolume() {
        for (int i = 0; i < volume; i++) {
            System.out.println("!");
        }
    }

    @Override
    public void setVolume(int volume) {
        if (volume < 0) {
            System.out.println("non puoi diminuire il volume sotto lo 0");
        } else if (volume > 10) {
            System.out.println("non puoi aumentare il volume sopra il 10");
        } else this.volume = volume;

    }
//    metodo duration

    public void setDuration(int duration) {
        if (duration <= 0) {
            System.err.println("la durata deve essere maggiore a 0");
        } else this.duration = duration;
        this.duration = duration;
    }
}

