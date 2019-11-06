package codewars;

public class Dubstep {
    public static String SongDecoder (String song)
    {
        // Your code is here...
        String newSong = song.replace("WUB", " ");
        int previousLength = song.length();
        while(previousLength != newSong.length()){
            previousLength = newSong.length();
            newSong = newSong.replace("  ", " ");
        }

        return newSong.trim();
    }
}
