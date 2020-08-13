//: Song.java
// chapter 5 ex 2

class MusicScript {
    static void write(Song song, String words) {
        song.lyrics += words;
    }
}

public class Song {
    protected String lyrics;

    Song() {
        this.lyrics = "";
    }

    public static void main(String[] args) {
        Song theInnerLight = new Song();
        String verse = "The further one travels,";
        verse       += "\nThe less one knows";
        MusicScript.write(theInnerLight, verse);
        System.out.println(theInnerLight.lyrics);
    }
}
