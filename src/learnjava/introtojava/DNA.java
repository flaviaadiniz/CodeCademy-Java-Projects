package learnjava.introtojava;

//checks if a DNA sequence is a protein
//TO DO: create a method for checking if DNA is a protein

public class DNA {

    public static void main(String[] args) {

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";


        System.out.println("Length of DNA 1: " + dna1.length());

        int start = dna1.indexOf("ATG");
        System.out.println("ATG starts at index " + start);
        int stop = dna1.indexOf("TGA");
        System.out.println("TGA stops at index " + stop);

        String protein1 = dna1.substring(start, stop + 3);
        if (start != -1 && stop != -1 && (stop - start) % 3 == 0) {
            System.out.println(protein1 + " is a protein.");
        } else {
            System.out.println(protein1 + "isn't a protein.");
        }

        System.out.println("");

        System.out.println("Length of DNA 2: " + dna2.length());

        int start2 = dna2.indexOf("ATG");
        System.out.println("ATG starts at index " + start);
        int stop2 = dna2.indexOf("TGA");
        System.out.println("TGA stops at index " + stop);

        String protein2 = dna2.substring(start2, stop2 + 3);
        if (start2 != -1 && stop2 != -1 && (stop2 - start2) % 3 == 0) {
            System.out.println(protein2 + " is a protein");
        } else {
            System.out.println(protein2 + " isn't a protein.");
        }

        System.out.println("");

        System.out.println("Length of DNA 2: " + dna3.length());

        int start3 = dna3.indexOf("ATG");
        System.out.println("ATG starts at index " + start);
        int stop3 = dna3.indexOf("TGA");
        System.out.println("TGA stops at index " + stop);

        String protein3 = dna3.substring(start3, stop3 + 3);
        if (start3 != -1 && stop3 != -1 && (stop3 - start3) % 3 == 0) {
            System.out.println(protein3 + " is a protein");
        } else {
            System.out.println(protein3 + " isn't a protein.");
        }

    }

}