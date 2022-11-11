package learnjava.introtojava;

import java.util.ArrayList;

class Playlist {

    public static void main(String[] args) {

        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        desertIslandPlaylist.add("The Killers - Runaways");
        desertIslandPlaylist.add("KISS - Hard Luck Woman");
        desertIslandPlaylist.add("Khalid - Outta My Head");
        desertIslandPlaylist.add("Matchbox 20 - 3AM");
        desertIslandPlaylist.add("HAIM - Forever");
        desertIslandPlaylist.add("Machine Gun Kelly - Bloody Valentine");

        System.out.println(desertIslandPlaylist);

        desertIslandPlaylist.remove(5);

        System.out.println(desertIslandPlaylist.size());

        int indexA = desertIslandPlaylist.indexOf("Matchbox 20 - 3AM");
        int indexB = desertIslandPlaylist.indexOf("HAIM - Forever");

        desertIslandPlaylist.set(indexA, "HAIM - Forever");
        desertIslandPlaylist.set(indexB, "Matchbox 20 - 3AM");

        System.out.println(desertIslandPlaylist);
    }

}