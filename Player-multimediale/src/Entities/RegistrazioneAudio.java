package Entities;

import Intafaces.Volume;

public class RegistrazioneAudio extends elementoMultimediale implements Volume {

    //    Attributi
//    a differenza del padre qui abbiamo 2 attributi in piu
    private int volume = 1;
    private int duration = 1;

    //    Costruttore
// prediamo come base il costruttore del padre ma aggiungiamo un altro parametro che ci serve per impostare la durata dell'audio
    public RegistrazioneAudio(String name, int duration) {
        super(name);
        setDuration(duration);
    }
//METODI


    //    metodo play
//    questo è il metodo per far partire in stampa il nostro audio con i suo attributi
    @Override
    public void play() {
        if (this.duration > 0 && this.volume >= 0 && this.volume <= 10) {
            for (int i = 0; i < duration; i++) {
                System.out.println(this.title);
            }
            printVolume();

        }

    }

    // metodo volume
//    usiamo lo stesso concetto usato per la luminosità ma andremo a stampare un altra stringa
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
// qui anidamo a settare la durata dell
    public void setDuration(int duration) {
        if (duration <= 0) {
            System.err.println("la durata deve essere maggiore a 0");
        } else this.duration = duration;
        this.duration = duration;
    }
}
