import Entities.ElementoMultimediale;
import Entities.Immagine;
import Entities.RegistrazioneAudio;
import Entities.Video;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Prova per stampare tutti gli elementi multimediali


//        Immagine img = new Immagine("paolo");
//        img.setBrightness(3);
//        img.show();
//
//
//        Video video1 = new Video("goal", 6);
//        video1.setBrightness(5);
//        video1.setVolume(2);
//        video1.play();
//
//        RegistrazioneAudio rec1 = new RegistrazioneAudio("parlata", 3);
//        rec1.setVolume(3);
//        rec1.play();


        Scanner sc = new Scanner(System.in);
        ElementoMultimediale[] generalMedia = new ElementoMultimediale[5];
        System.out.println("Ciao benvenuto, qui puoi creare 5 elementi di tipo : immagine , video o audio , scrivi quello che vuoi");

        for (int i = 0; i < generalMedia.length; i++) {
            System.out.println("crea qualcosa");
            String obj = sc.nextLine();
            if (obj.equals("immagine")) {
                System.out.println("dai un titolo alla tua immagine");
                String titleImg = sc.nextLine();
                System.out.println("ora aggiungi una luminosita da 1 a 10 ");
                int luminositaImg = Integer.parseInt(sc.nextLine());
                generalMedia[i] = new Immagine(titleImg);
                System.out.println("Immagine creta con successo");
            } else if (obj.equals("audio")) {
                System.out.println("dai un titolo al tuo audio");
                String titleAudio = sc.nextLine();
                System.out.println("ora aggiungi una durata da 1 a 10 ");
                int durataAudio = Integer.parseInt(sc.nextLine());
                generalMedia[i] = new RegistrazioneAudio(titleAudio, durataAudio);
                System.out.println("Audio creato con successo");

            } else if (obj.equals("video")) {
                System.out.println("dai un titolo al tuo video");
                String titleVideo = sc.nextLine();
                System.out.println("ora aggiungi una durata da 1 a 10");
                int durataVideo = Integer.parseInt(sc.nextLine());
                System.out.println("ora aggiungi una luminosita da 1 a 10");
                int luminositaVideo = Integer.parseInt(sc.nextLine());
                generalMedia[i] = new Video(titleVideo, durataVideo, luminositaVideo);
                System.out.println("Video creato con successo");

            } else System.out.println("non hai scelto correttamente");

        }
        System.out.println("tutti gli elementi sono stati creati con successo");

        while (!(generalMedia.length < 5)) {
            System.out.println("ora scegli l'elemento che vuoi vedere con un numero da 1 a 5");
            int numeroSelezionato = Integer.parseInt(sc.nextLine());
            int numeroControllo = -1;
            if (numeroSelezionato > 0 && numeroSelezionato <= 5) {
                while (numeroControllo != 0) {

                    if (generalMedia[numeroSelezionato - 1] instanceof Immagine) {
                        System.out.println("scegli cosa fare :");
                        System.out.println("1 aumentare la luminosita");
                        System.out.println("2 diminuire la luminosita");
                        System.out.println("3 mostra Immagine");
                        numeroControllo = Integer.parseInt(sc.nextLine());
                        switch (numeroControllo) {
                            case 1: {
                                ((Immagine) generalMedia[numeroControllo - 1]).turnUpBrightness();
                                System.out.println("luminosita aumentata");
                                break;
                            }
                            case 2: {
                                ((Immagine) generalMedia[numeroControllo - 1]).decreseBrightness();
                                System.out.println("luminosita diminuita");
                                break;
                            }
                            case 3: {
                                ((Immagine) generalMedia[numeroControllo - 1]).show();
                                break;
                            }
                            default: {
                                System.out.println("non hai selezionato correttamente");
                            }
                        }
                    }
                    if (generalMedia[numeroSelezionato - 1] instanceof RegistrazioneAudio) {
                        System.out.println("scegli cosa fare :");
                        System.out.println("1 aumentare il volume");
                        System.out.println("2 diminuire il volume");
                        System.out.println("3 fai partire l'audio");
                        numeroControllo = Integer.parseInt(sc.nextLine());
                        switch (numeroControllo) {
                            case 1: {
                                ((RegistrazioneAudio) generalMedia[numeroControllo - 1]).turnUpVolume();
                                System.out.println("volume aumentata");
                                break;
                            }
                            case 2: {
                                ((RegistrazioneAudio) generalMedia[numeroControllo - 1]).descreseVolume();
                                System.out.println("volume diminuita");
                                break;
                            }
                            case 3: {
                                ((RegistrazioneAudio) generalMedia[numeroControllo - 1]).play();
                                break;
                            }
                            default: {
                                System.out.println("non hai selezionato correttamente");
                            }
                        }

                    }
                    if (generalMedia[numeroSelezionato - 1] instanceof Video) {
                        System.out.println("scegli cosa fare :");
                        System.out.println("1 aumentare la luminosita");
                        System.out.println("2 diminuire la luminosita");
                        System.out.println("3 aumentare il volume");
                        System.out.println("4 diminuire il volume");
                        System.out.println("5 fai partire il video");
                        numeroControllo = Integer.parseInt(sc.nextLine());
                        switch (numeroControllo) {
                            case 1: {
                                ((Video) generalMedia[numeroControllo - 1]).turnUpBrightness();


                                break;
                            }
                            case 2: {
                                ((Video) generalMedia[numeroControllo - 1]).decreseBrightness();

                                break;
                            }
                            case 3: {
                                ((Video) generalMedia[numeroControllo - 1]).turnUpVolume();
                                break;
                            }
                            case 4: {
                                ((Video) generalMedia[numeroControllo - 1]).descreseVolume();
                                break;
                            }
                            case 5: {
                                ((Video) generalMedia[numeroControllo - 1]).play();
                                break;
                            }
                            default: {
                                System.out.println("non hai selezionato correttamente");
                            }
                        }
                    }
                }
            }
        }

        sc.close();


    }
}