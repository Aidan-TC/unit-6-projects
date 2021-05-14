import java.util.Arrays;

public class MusicLibraryClient {
       public static void main(String[] args) {
            MusicLibrary myLibrary = new MusicLibrary();

            Album a1 = new Album("D", "B", 10, 42.5);
            Album a2 = new Album("CC", "D", 9, 36);
            Album a3 = new Album("B", "C", 12, 39.1);
            Album a4 = new Album("AA", "A", 12, 39.1);

            myLibrary.add(a4);

            myLibrary.add(a2);
            myLibrary.add(a1);
            myLibrary.add(a3);
            myLibrary.add(a3);
            myLibrary.doubleSize();
            myLibrary.add(a2);
            myLibrary.add(a3);
            myLibrary.add(a4);

            myLibrary.selectSortTitle();
            System.out.println(myLibrary);
            myLibrary.insertSortArtist();
            myLibrary.binSearchArtist("Dome Band");
            myLibrary.binSearchArtist("Ceople");
            myLibrary.binSearchTitle("APlay");
            myLibrary.linSearchTitle("Play");
            myLibrary.linSearchArtist("Apeople");
        }
    }
