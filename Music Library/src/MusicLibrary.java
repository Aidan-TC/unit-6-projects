public class MusicLibrary {

    int size = 1;
    boolean wasTrue = false;

    private Album[] albumList;
    public MusicLibrary(){
        albumList = new Album[(10)];
    }

    public void add(Album album){
        for(int i =0; i< albumList.length; i++){
            if(albumList[i]==null){
                albumList[i] = album;
                break;
            }
        }
    }

    public void remove(int index){
        albumList[index] = null;
        for(int i =index; i<albumList.length-1; i++){
            albumList[i] = albumList[i+1];
        }
    }

    public void doubleSize(){
        size*=2;
        Album[] albumList2 = new Album[(size*10)];
        for(int i =0; i<9; i++){
            albumList2[i] = albumList[i];
        }
        albumList = albumList2;
    }

    public String toString(){
        System.out.println(" ");
        for(int i =0; i<=albumList.length -1; i++){
            if(albumList[i] == null) {
                System.out.println("empty");
            }else {
                System.out.print("Title: " + albumList[i].getTitle() + ", ");
                System.out.print("Artist: " + albumList[i].getArtist() + ", ");
                System.out.print("Tracks: " + albumList[i].getTracks() + ", ");
                System.out.println("Play time: " + albumList[i].getPlaytime() + ", ");
            }
        }
        return " ";
    }

    public void insertSortArtist() {
        for (int i = 1; i <= albumList.length; i++) {
            if (albumList[i] == null) {
                break;
            }
            if(wasTrue){
                i--;
                wasTrue = false;
            }
            Album key = albumList[i];
            if (i > 0 && ((albumList[i].getArtist().compareTo(albumList[i - 1].getArtist())) < 0)) {
                albumList[i] = albumList[i - 1];
                i--;
                albumList[i] = key;
                wasTrue = true;
            }
        }
    }

    public void selectSortTitle(){ //sorts alphabetically
        for(int i =0; i<= albumList.length; i++){
            for(int j = i+1; j< albumList.length; j++){
                if(albumList[j]==null){
                    break;
                }
                if(albumList[i].getTitle().compareTo(albumList[j].getTitle())>0){
                    Album temp = albumList[i];
                    albumList[i] = albumList[j];
                    albumList[j] = temp;
                }
            }
        }
    }
    //I wasn't sure if the searches needed to print out the album info
    public Album linSearchTitle(String title){
        for(int i =0; i<= albumList.length; i++){
            if(albumList[i].getTitle().equals(title)){
                System.out.println("Title: " + albumList[i].getTitle() + ", " +
                        "Artist: " + albumList[i].getArtist() + ", " +
                        "Tracks: " + albumList[i].getTracks() + ", " +
                        "Play time: " + albumList[i].getPlaytime());
                return albumList[i];
            }
        }
        return null;
    }

    public Album linSearchArtist(String artist){
        for(int i =0; i<= albumList.length; i++){
            if(albumList[i].getArtist().equals(artist)){
                System.out.println("Title: " + albumList[i].getTitle() + ", " +
                        "Artist: " + albumList[i].getArtist() + ", " +
                        "Tracks: " + albumList[i].getTracks() + ", " +
                        "Play time: " + albumList[i].getPlaytime());
                return albumList[i];
            }
        }
        return null;
    }

    public Album binSearchArtist(String artist) {
        int middle = albumList.length / 2;
        int high = albumList.length;
        int low =0;
        while(albumList[middle] == null){
            middle-=1;
        }
        while (!(albumList[middle].getArtist().equals(artist)) && low<=high) {

            if (albumList[middle].getArtist().compareTo(artist) > 0) {
                middle /= 2;
                high /=2;
            } else {
                middle *= 1.5;
                low = albumList.length/2;
            }
        }
        System.out.println("Title: " + albumList[middle].getTitle() + ", " +
                "Artist: " + albumList[middle].getArtist() + ", " +
                "Tracks: " + albumList[middle].getTracks() + ", " +
                "Play time: " + albumList[middle].getPlaytime());

        return albumList[middle];
    }

    public Album binSearchTitle(String title) {
        int middle = albumList.length / 2;
        int high = albumList.length;
        int low =0;
        while(albumList[middle] == null){
            middle-=1;
        }
        while (!(albumList[middle].getTitle().equals(title)) && low<=high) {
            if (albumList[middle].getTitle().compareTo(title) > 0) {
                middle /= 2;
                high /=2;
            } else {
                middle *= 1.5;
                low = albumList.length/2;
            }
        }
        System.out.println("Title: " + albumList[middle].getTitle() + ", " +
                "Artist: " + albumList[middle].getArtist() + ", " +
                "Tracks: " + albumList[middle].getTracks() + ", " +
                "Play time: " + albumList[middle].getPlaytime());

        return albumList[middle];
    }
}

