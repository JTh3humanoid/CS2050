
public class Album {
   private static String Albumname="Renaissance";
   private static String Artist="Beyonce";
   private static String Genre="Easy listening";
   private static String Final;
   public static int songl=10;
   Album(){
  System.out.println(Albumname+"\n"+Artist+"\n"
  +Genre+"\n"+songl);
   }
    Album(String An, String Ar, String Ge, int sl) {
        Albumname = An;
        Artist = Ar;
        Genre = Ge;
        songl= sl;
    }
    public String toString(){
        return "Title: "+ Albumname
                +"\nPerformer: "+ Artist
                +"\nGenre: "+ Genre
                +"\nNumber of Songs: "+ songl;
    }

    public static String getAlbumname() {
        return Albumname;
    }
    public static String getArtist(){
        return Artist;
    }

    public static String getGenre() {
        return Genre;
    }

    public static int getSongl() {
        return songl;
    }

    public static void setAlbumname(String albumname) {
        Albumname = albumname;
    }

    public static void setArtist(String artist) {
        Artist = artist;
    }

    public static void setGenre(String genre) {
        Genre = genre;
    }
    public static void setSongl(int songl) {
        Album.songl = songl;
    }
    public boolean isLong(){
       if (songl>=50){
           return true;
       }
       else {
           return false;
       }
    }
}



