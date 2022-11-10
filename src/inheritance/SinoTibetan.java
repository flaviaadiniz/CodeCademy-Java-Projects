package inheritance;

public class SinoTibetan extends Language {

    SinoTibetan(String name, int numSpeakers) {
        super(name, numSpeakers, "Asia", "subject-object-verb");
        if (this.name.contains("Chinese")) {
            wordOrder = "subject-verb-object";
        }
    }



}
