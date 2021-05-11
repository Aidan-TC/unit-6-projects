public class Album {

    public String title = "";
    public String artist = "";
    public int tracks = 0;
    public double playtime = 0;

    public Album(String title, String artist, int tracks, double playtime){
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        this.playtime = playtime;
    }

    public String getTitle(){
        return  title;
    }

    public String getArtist(){
        return artist;
    }

    public int getTracks(){
        return tracks;
    }

    public double getPlaytime(){
        return playtime;
    }
}
