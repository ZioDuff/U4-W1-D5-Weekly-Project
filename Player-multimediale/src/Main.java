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


// inziamo implementando lo scanner
        Scanner sc = new Scanner(System.in);
//        qua inizializzo un array "vuoto" ma di lunghezza 5
        ElementoMultimediale[] generalMedia = new ElementoMultimediale[5];
        System.out.println("Ciao benvenuto, qui puoi creare 5 elementi di tipo : immagine , video o audio , scrivi quello che vuoi");
// avvio un for loop dove chiede di inserire determinati dati per creare l'elemento che ci serve e lo chide per 5 volte ovvero la lunghezza dell'array
        for (int i = 0; i < generalMedia.length; i++) {
            System.out.println("crea qualcosa");
            String obj = sc.nextLine();
//            avvio un controllo con if e else if dove metto a paragone le stringhe in entrata per ottenere l'oggetto che vogliamo
//            e lo faccio per le tre classi che abbiamo creato
//            classe IMMAGINE
            if (obj.equals("immagine")) {
                System.out.println("dai un titolo alla tua immagine");
                String titleImg = sc.nextLine();
                System.out.println("ora aggiungi una luminosita da 1 a 10 ");
                int luminositaImg = Integer.parseInt(sc.nextLine());
                generalMedia[i] = new Immagine(titleImg);
                System.out.println("Immagine creta con successo");

            }
//            classe REGISTRAZIONEAUDIO
            else if (obj.equals("audio")) {
                System.out.println("dai un titolo al tuo audio");
                String titleAudio = sc.nextLine();
                System.out.println("ora aggiungi una durata da 1 a 10 ");
                int durataAudio = Integer.parseInt(sc.nextLine());
                generalMedia[i] = new RegistrazioneAudio(titleAudio, durataAudio);
                System.out.println("Audio creato con successo");

            }
//            classe VIDEO
            else if (obj.equals("video")) {
                System.out.println("dai un titolo al tuo video");
                String titleVideo = sc.nextLine();
                System.out.println("ora aggiungi una durata da 1 a 10");
                int durataVideo = Integer.parseInt(sc.nextLine());
                System.out.println("ora aggiungi una luminosita da 1 a 10");
                int luminositaVideo = Integer.parseInt(sc.nextLine());
                generalMedia[i] = new Video(titleVideo, durataVideo);
                System.out.println("Video creato con successo");

            }
//            questo in caso si scelga qualcos'altro ma è da finire in quanto pusha comunque qualcosa
            else System.out.println("non hai scelto correttamente");

        }
        System.out.println("tutti gli elementi sono stati creati con successo");
// questo while non parte finchè la lunghezza del nostro array non arriva a quella corretta
        while (!(generalMedia.length < 5)) {
            System.out.println("ora scegli l'elemento che vuoi vedere con un numero da 1 a 5");
            int numeroSelezionato = Integer.parseInt(sc.nextLine());
//            scelgo un numero negativo in modo da far partire il while
            int numeroControllo = -1;
            if (numeroSelezionato > 0 && numeroSelezionato <= 5) {
                while (numeroControllo != 0) {
// qua faccio partire un altro controllo con l'if questa volta con le istanze delle nostre classi se questo va a buon fine facciamo un cast e scegliamo il metodo
//                    questo controllo lo fatto per ogni istanza della classe come il precedente
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
// la chiusura dello scanner non avviene ancora come il funzionamento di molti metodi, ce bisogno di fix di molte cose lo so :(
        sc.close();


    }
}