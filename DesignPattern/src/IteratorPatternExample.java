import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Song {
	
    private String songName;
    private String singer;

    public Song(String songName, String singer) 
    {
        super();
        this.songName = songName;
        this.singer = singer;
    }    

    public String getSongName() 
    {
        return songName;
    }
    public String getSinger() 
    {
        return singer;
    }

}






class SongCollection {
	
    private List< Song > songList = new ArrayList< Song >();

    public void addSong(Song song) 
    {
        songList.add(song);
    }

    public Iterator< Song > getSongIterator() 
    {
        return new SongIterator();
    } 

    private class SongIterator implements Iterator< Song > 
    {
        int currentSongIndex = 0;

        @Override
        public boolean hasNext() 
        {
            if (currentSongIndex >= songList.size()) 
            {
                return false;
            } 
            else {
                return true;
            }
        }

        @Override
        public Song next() 
        {
            return songList.get(currentSongIndex++);
        }

        @Override
        public void remove() 
        {
            songList.remove(--currentSongIndex);
        }

    }
}



public class IteratorPatternExample {

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        Song s1 = new Song("Rock You !!!" , "Eric Martin");        
        Song s2 = new Song("Someone Gone !!!" , "Neuone Derek");        
        Song s3 = new Song("Remember Me !!!" , "Justin Diebler");        

        SongCollection songCollection = new SongCollection();
        songCollection.addSong(s1);
        songCollection.addSong(s2);
        songCollection.addSong(s3);

        System.out.println("Displaying Song Info : \n");
        Iterator< Song > songIterator = songCollection.getSongIterator();

        while(songIterator.hasNext()) 
        {
            Song song = songIterator.next();
            System.out.println("Song Name : " + song.getSongName());
            System.out.println("Song Singer : " + song.getSinger());
            System.out.println();
        }

        System.out.println("Removing Song and Displaying :\n");

        songIterator.remove();

        songIterator = songCollection.getSongIterator();

        while(songIterator.hasNext()) 
        {
            Song song = songIterator.next();
            System.out.println("Song Name : " + song.getSongName());
            System.out.println("Song Singer : " + song.getSinger());
            System.out.println();
        }
    }
}

