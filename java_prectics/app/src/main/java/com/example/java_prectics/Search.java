package com.example.java_prectics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import integration.Album;
import integration.MusicLib;
import integration.SearchList;
import integration.SearchOptions;
import integration.Song;

public class Search
{

    public static SearchList search(MusicLib library,String search, SearchOptions searchOptions)
    {

        SearchList returnedList = new SearchList();
        Collections.sort(library.getAlbumList(), new Comparator(){
            public int compare(Object o1, Object o2) {
                Album a1 = (Album) o1;
                Album a2 = (Album) o2;
                return a1.getAlbumTitle().compareToIgnoreCase(a2.getAlbumTitle());
            }
        });


        if (searchOptions.sAlbums)
        {
            ArrayList<Album> returnedAlbums = searchAlbums(library, search);
            for (int i = 0; i < returnedAlbums.size(); i++)
                returnedList.addAlbum(returnedAlbums.get(i));
        }

        if (searchOptions.sSongs)
        {
            ArrayList<Song> returnedSongs = searchSongs(library, search);
            for (int i = 0; i < returnedSongs.size(); i++)
                returnedList.addSong(returnedSongs.get(i));
        }

        if (searchOptions.sArtist)
        {
            ArrayList<Song> returnedSongs = searchArtist(library, search);
            for (int i = 0; i < returnedSongs.size(); i++){
                returnedList.addSong(returnedSongs.get(i));
            }

        }


        return returnedList;
    }



    public static ArrayList<Album> searchAlbums(MusicLib library, String search) {

        ArrayList<Album> returnedAlbums = new ArrayList<Album>();

        // Create pattern (which is determined by user) for matching
        Pattern inputSearch = Pattern.compile(search, Pattern.CASE_INSENSITIVE);


        for (int n = 0; n < library.getAlbumList().size(); n++)
        {
            // Create a matcher object using albumTitle string as input
            Matcher matcher = inputSearch.matcher(library.getAlbumList().get(n).getAlbumTitle().trim());

            if (matcher.find() && matcher.start() == 0)
            {
                returnedAlbums.add(library.getAlbumList().get(n));
            }
        }


        for (int n = 0; n < library.getAlbumList().size(); n++)
        {
            Matcher matcher = inputSearch.matcher(library.getAlbumList().get(n).getAlbumTitle().trim());

            if (matcher.find() && matcher.start() != 0)
            {
                returnedAlbums.add(library.getAlbumList().get(n));
            }
        }



        return returnedAlbums;
    }

    public static ArrayList<Song> searchSongs(MusicLib library, String search) {
        ArrayList<Song> returnedSongs = new ArrayList<Song>();
        Pattern inputSearch = Pattern.compile(search, Pattern.CASE_INSENSITIVE);

        for (int i = 0; i < library.getAlbumList().size(); i++) {
            for (int n = 0; n < library.getAlbumList().get(i).getSongList().size(); n++) {
                Matcher matcher = inputSearch.matcher(library.getAlbumList().get(i).getSongList().get(n).getTitle().trim());

                if (matcher.find() && matcher.start() == 0)
                {
                    returnedSongs.add(library.getAlbumList().get(i).getSongList().get(n));
                }

            }
        }

        for (int i = 0; i < library.getAlbumList().size(); i++) {
            for (int n = 0; n < library.getAlbumList().get(i).getSongList().size(); n++) {
                Matcher matcher = inputSearch.matcher(library.getAlbumList().get(i).getSongList().get(n).getTitle().trim());

                if (matcher.find() && matcher.start() != 0)
                {
                    returnedSongs.add(library.getAlbumList().get(i).getSongList().get(n));
                }

            }
        }

        return returnedSongs;
    }

    public static ArrayList<Song> searchArtist(MusicLib library, String search) {
        ArrayList<Song> returnedSongs = new ArrayList<Song>();
        //create a pattern using the users input
        Pattern inputSearch = Pattern.compile(search, Pattern.CASE_INSENSITIVE);


        for (int n = 0; n < library.getAlbumList().size(); n++)
        {
            for (int i = 0; i < library.getAlbumList().get(n).getSongList().size(); i++)
            {
                //Create a matcher object using the artist as an input.
                Matcher matcher = inputSearch.matcher(library.getAlbumList().get(n).getSongList().get(i).getArtist().trim());

                if (matcher.find() && matcher.start() == 0)
                {
                    //adds the song to the return list if the artist name begins with the input
                    returnedSongs.add(library.getAlbumList().get(n).getSongList().get(i));
                }
            }
        }

        for (int n = 0; n < library.getAlbumList().size(); n++)
        {
            for (int i = 0; i < library.getAlbumList().get(n).getSongList().size(); i++)
            {
                //Create a matcher object using the artist as an input.
                Matcher matcher = inputSearch.matcher(library.getAlbumList().get(n).getSongList().get(i).getArtist().trim());

                if (matcher.find() && matcher.start() != 0)
                {
                    //adds the song to the return list if the artist name does not begin with the input
                    returnedSongs.add(library.getAlbumList().get(n).getSongList().get(i));
                }
            }
        }


        return returnedSongs;
    }
}
