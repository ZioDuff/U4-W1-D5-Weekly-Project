import Entities.Immagine;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("paolo");
        img.show();
        img.printBrightness();
    }
}