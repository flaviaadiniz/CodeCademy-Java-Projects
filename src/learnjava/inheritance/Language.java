package learnjava.inheritance;

/* EXTRA: - Build an array or ArrayList of several language objects and loop through them to call getInfo().
- Add new methods that allow users to set a specific region, change the number of speakers,
or modify the word order.
- Create several more language family classes that pertain to languages you’re interested in.
- Map out the sign language families.
- Add in further linguistic features (e.g., which genders are used, whether the language is tonal, etc.).*/

    public class Language {
        protected String name;
        protected int numSpeakers;
        protected String regionsSpoken;
        protected String wordOrder;

        public static void main(String[] args) {

            Language portuguese = new Language("Portuguese", 200000, "Brazil and Portugal", "Subject-Verb-Object");
            portuguese.getInfo();

            Language chontal = new Mayan("Chontal", 36810);
            chontal.getInfo();

            Language chineseMandarin = new SinoTibetan("Chinese Mandarin", 5000000);
            chineseMandarin.getInfo();

            Language burmese = new SinoTibetan("Burmese", 3000000);
            burmese.getInfo();

        }

        Language(String name, int numSpeakers, String regionsSpoken, String wordOrder) {
            this.name =  name;
            this.numSpeakers = numSpeakers;
            this.regionsSpoken = regionsSpoken;
            this.wordOrder = wordOrder;
        }

        public void getInfo() {
            System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
            System.out.println("The language follows the word order: " + this.wordOrder + ".\n");
        }

    }

