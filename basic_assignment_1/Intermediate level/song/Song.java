import java.util.*;
class Song_lib {
    public String title;
    private String artist;
    private String album;
    private String year;
    private String duration;
    public Song_lib() {}

    public void setDuration(String duration) {
        this.duration = duration;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getArtist() {
        return artist;
    }
    public String getAlbum() {
        return album;
    }
    public String getYear() {
        return year;
    }

} /*Class end */
public class Song {

    public static void reIndex(Map < String, List < Integer >> m, int x, String s) {
        System.out.println(" map is : " + m + "  index x :" + x + "  opration is going on  " + s);

        for (Map.Entry < String, List < Integer >> me: m.entrySet()) {
            List < Integer > valueList = me.getValue();
            for (int i = 0; i < valueList.size(); i++) {
                if (valueList.get(i) > x) {
                    valueList.set(i, valueList.get(i) - 1);
                }
            }
        }

    }

    public static void main(String[] args) {
        int i, size, choice;
        String Title, Artist, Year, Album, Duration;
        Scanner sc = new Scanner(System.in);
        Map < String, List < Integer >> mapTitle = new HashMap < > ();
        Map < String, List < Integer >> mapArtist = new HashMap < > ();
        Map < String, List < Integer >> mapAlbum = new HashMap < > ();
        List < Song_lib > list = new ArrayList < Song_lib > ();
        List < Integer > resArtist = new ArrayList();
        List < Integer > resAlbum = new ArrayList();
        List < Integer > resTitle = new ArrayList();
        /*Test input Start*/
        Song_lib song = new Song_lib();
        // song.setDuration("5.0");
        // song.setTitle("Spno ki rani");
        // song.setYear("1969");
        // song.setAlbum("Aradhana");
        // song.setArtist("Kishore Kumar");

        // resArtist.add(0);
        // resAlbum.add(0);
        // resTitle.add(0);

        // mapTitle.put("Spno ki rani",resTitle);
        // mapAlbum.put("Aradhana",resAlbum);
        // mapArtist.put("Kishore Kumar",resArtist);
        // list.add(song);


        /*Test input end*/
        for (Song_lib s: list) {
            System.out.println("\n\n" + s.getTitle() + " " + s.getAlbum() + " " + s.getYear() + " " + s.getArtist() + " " + s.getDuration());
        }
        while (true) {
            System.out.println("===========================================================================================================");
            System.out.println("Press 1 View a list of all the songs in \nPress 2 list of all the artists in the library.");
            System.out.println("Press 3 list of all the albums in the library.\nPress 4 Edit any information in the library");
            System.out.println("Press 5 View a list of all the songs by a particular artist.\nPress 6 View a list of all the songs on a particular album.");
            System.out.println("Press 7 Add songs to and remove them from the library. \nPress 8 Add artists to and remove them from songs.");
            System.out.println("Press 9 Add songs to and remove them from albums");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                    for (Song_lib s: list) {
                        System.out.println(list.indexOf(s) + "\t" + s.getTitle() + "\t\t" + s.getAlbum() + "\t\t" + s.getYear() + "\t\t" + s.getArtist() + "\t" + s.getDuration());
                    }
                    System.out.println("===========================================================================================================");
                }
                break;
            case 2: {
                System.out.println("\tArtist");
                System.out.println("\n" + mapArtist.keySet());
                break;
            }
            case 3: {
                System.out.println("\tAlbum");

                System.out.println("\n\n" + mapAlbum.keySet());
                break;
            }
            case 4:
                String choiceTitle, titleSearch, newTitle;
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t****Edit Menu****");
                System.out.println("\n\tPress T Title of songs\tPress A for Edit Albums\tPress N names of Artists ");
                choiceTitle = sc.next();
                if (choiceTitle.equalsIgnoreCase("T")) {
                    System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t\t\t**** Title Edit Menu****");
                    System.out.println("Enter the Title ");
                    sc.nextLine();
                    titleSearch = sc.nextLine();
                    resTitle = mapTitle.get(titleSearch); /*Rerun the index value of related title*/
                    for (Integer s: resTitle) {
                        Song_lib songObjTitle = list.get(s);
                        System.out.println("\t" + songObjTitle.getTitle() + "\t\t" + songObjTitle.getAlbum() + "\t\t" + songObjTitle.getYear() + "\t\t" + songObjTitle.getArtist() + "\t" + songObjTitle.getDuration());
                        System.out.println("Enter the New Title ");
                        newTitle = sc.nextLine();
                        songObjTitle.setTitle(newTitle);
                        System.out.println("\t\t\t\tUpdated Result is :\n");
                        mapTitle.remove(titleSearch);
                        mapTitle.put(newTitle, resTitle); //Map update
                        System.out.println("\t" + songObjTitle.getTitle() + "\t\t" + songObjTitle.getAlbum() + "\t\t" + songObjTitle.getYear() + "\t\t" + songObjTitle.getArtist() + "\t" + songObjTitle.getDuration());
                    }
                } else if (choiceTitle.equalsIgnoreCase("A")) {
                    String searchAlbum, newAlbum;
                    System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t\t\t**** Album Edit Menu****");
                    System.out.println("Enter the old Album name ");
                    sc.nextLine();
                    searchAlbum = sc.nextLine();
                    resAlbum = mapAlbum.get(searchAlbum);

                    for (Integer s: resAlbum) {
                        Song_lib songObjAlbum = list.get(s);
                        System.out.println("\t\t\t\t\t\t\tYour Search Result");
                        System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                        System.out.println("\t" + songObjAlbum.getTitle() + "\t\t" + songObjAlbum.getAlbum() + "\t\t" + songObjAlbum.getYear() + "\t\t" + songObjAlbum.getArtist() + "\t" + songObjAlbum.getDuration());
                        System.out.println("Enter the new Album Name");
                        newAlbum = sc.nextLine();
                        songObjAlbum.setAlbum(newAlbum);
                        mapAlbum.remove(searchAlbum);
                        mapAlbum.put(newAlbum, resAlbum);
                    }

                } else if (choiceTitle.equalsIgnoreCase("N")) {
                    String searchArtist, newArtistName;
                    System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t\t\t**** Artist Name  Edit Menu****");
                    sc.nextLine();
                    System.out.println("Enter the old Artist Name ");
                    searchArtist = sc.nextLine();
                    resArtist = mapArtist.get(searchArtist);
                    System.out.println("Enter the  New Aritst Name ");
                    newArtistName = sc.nextLine();
                    for (Integer s: resArtist) {
                        Song_lib songObjName = list.get(s);
                        System.out.println("\t\t\t\t\t\t\tYour Search Result");
                        System.out.println("\t" + songObjName.getTitle() + "\t\t" + songObjName.getAlbum() + "\t\t" + songObjName.getYear() + "\t\t" + songObjName.getArtist() + "\t" + songObjName.getDuration());
                        songObjName.setArtist(newArtistName);
                        mapArtist.remove(searchArtist);
                        mapArtist.put(newArtistName, resArtist);
                    }
                } else {
                    System.out.println("\033[H\033[2J");
                    System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
                }
                break;

            case 5: //View a list of all the songs by a particular artist.
            {
                String artistSearch;


                System.out.println("Enter the  Artist Name ");
                resArtist = mapArtist.get(sc.nextLine());
                System.out.println("\033[H\033[2J");


                for (Integer s: resArtist) {
                    Song_lib listofSong = list.get(s);
                    System.out.println(listofSong.getTitle());
                }

            }
            break;
            case 6:
                /*View a list of all the songs on a particular album.*/
                String albumSearch;
                System.out.println("Enter the Name of Album ");
                albumSearch = sc.nextLine();
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t****list of all the songs in Album : " + albumSearch + " ****");
                resAlbum = mapAlbum.get(albumSearch);
                for (Integer s: resAlbum) {
                    Song_lib listofAlbum = list.get(s);
                    System.out.println(listofAlbum.getTitle());
                }
                break;
            case 7: /*Add songs to and remove them from the library.*/ {
                String choiceSong;
                System.out.println("\033[H\033[2J");
                System.out.println("Press A for Add song\tPress R for Remove Song");
                choiceSong = sc.next();
                sc.nextLine();
                if (choiceSong.equalsIgnoreCase("A")) {
                    while (true) {
                        String newAddTitle, newArtist, newAlbum, newYear, newDuration;
                        System.out.println("\t\t\t\t\t**** New Song Addition Menu****");
                        System.out.println("Enter the Title ");
                        newAddTitle = sc.nextLine();
                        if (mapTitle.containsKey(newAddTitle)) {
                            System.out.println("Song is Already Present Please Remove it first  by using [7 -> R ] option ");
                            break;
                        } else {
                            Song_lib newSongAddObj = new Song_lib();
                            newSongAddObj.setTitle(newAddTitle);
                            System.out.println("Enter the Artist ");
                            newSongAddObj.setArtist(sc.nextLine());

                            System.out.println("Enter the Album ");
                            newSongAddObj.setAlbum(sc.nextLine());
                            System.out.println("Enter the Year ");
                            newSongAddObj.setYear(sc.nextLine());
                            System.out.println("Enter the Duration ");
                            newSongAddObj.setDuration(sc.nextLine());
                            list.add(newSongAddObj);

                            if (mapArtist.containsKey(newSongAddObj.getArtist())) {
                                System.out.println("Artist is Already Present this song will going to add Artist library  ");
                                resArtist = mapArtist.get(newSongAddObj.getArtist());

                                resArtist.add(list.indexOf(newSongAddObj));
                                /*No need to put again it is automaticly update */
                            } else {
                                resArtist = new ArrayList();
                                System.out.println("insid the else ");

                                resArtist.add(list.indexOf(newSongAddObj));
                                System.out.println("resArtist  1  " + resArtist);

                                mapArtist.put(newSongAddObj.getArtist(), resArtist);
                            }
                            if (mapAlbum.containsKey(newSongAddObj.getAlbum())) {
                                System.out.println("\nAlbum is Already Present this song will going to add Album library  ");
                                resAlbum = mapAlbum.get(newSongAddObj.getAlbum());

                                resAlbum.add(list.indexOf(newSongAddObj));
                            } else {
                                resAlbum = new ArrayList();
                                resAlbum.add(list.indexOf(newSongAddObj));
                                mapAlbum.put(newSongAddObj.getAlbum(), resAlbum);
                            }
                            resTitle = new ArrayList();
                            resTitle.add(list.indexOf(newSongAddObj));
                            mapTitle.put(newAddTitle, resTitle);
                        }
                        System.out.println(mapTitle);
                        System.out.println(mapAlbum);
                        System.out.println(mapArtist);
                        System.out.println("press E for exit");
                        String exit = sc.nextLine();
                        if (exit.equalsIgnoreCase("e"))
                            break;
                    }
                } else if (choiceSong.equalsIgnoreCase("R")) {
                    System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
                    System.out.println("Enter the Title of Song for  Delete");
                    resTitle = mapTitle.get(sc.nextLine());
                    System.out.println("Check");

                    for (Integer s: resTitle) {
                        Song_lib songforDeleteObj = list.get(s);
                        mapTitle.remove(songforDeleteObj.getTitle());
                        resArtist = mapArtist.get(songforDeleteObj.getArtist());
                        resArtist.remove(s);

                        resAlbum = mapAlbum.get(songforDeleteObj.getAlbum());
                        resAlbum.remove(s);

                        list.remove(songforDeleteObj);

                        reIndex(mapTitle, s, "Title");
                        reIndex(mapArtist, s, "Artist");
                        reIndex(mapAlbum, s, "Album");
                        System.out.println("after the Function call mapTitle  " + mapTitle);
                        System.out.println("after the Function call mapTitle  " + mapArtist);
                        System.out.println("after the Function call mapTitle  " + mapAlbum);
                    }

                } else {
                    System.out.println("\033[H\033[2J");
                    System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
                }
            }
            break;
            case 8:
                /*Add artists to and remove them from songs*/

                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t****  Artists Add and remove Menu****");
                String choiceSong, newArtistAdd, newvalue, oldValue;
                System.out.println("Press A for Add Artist\tPress R for Remove Artist");
                choiceSong = sc.next();
                sc.nextLine();
                if (choiceSong.equalsIgnoreCase("A")) {
                    System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t\t\t**** New Artist Addition Menu****");
                    System.out.println("Enter the TITILE of song  ");
                    resTitle = mapTitle.get(sc.nextLine());
                    if(resTitle == null || resTitle.size() == 0 || resTitle.contains(null) || resTitle.contains(""))
                    System.out.println("Opps something went wrong!! Give Right Input  ");
                    else
                    {
                    for (Integer s: resTitle) {
                        Song_lib songobjAddartist = list.get(s);

                        System.out.println("Enter the Second Artist name");
                        newArtistAdd = sc.nextLine();
                        if (!songobjAddartist.getArtist().contains(newArtistAdd)) {
                            if (mapArtist.containsKey(newArtistAdd)) {
                                resArtist = mapArtist.get(newArtistAdd);
                                resArtist.add(s);
                                if (!songobjAddartist.getArtist().equals(""))
                                    songobjAddartist.setArtist(songobjAddartist.getArtist() + "," + newArtistAdd);
                                else
                                    songobjAddartist.setArtist(newArtistAdd);
                                System.out.println("\n\t\t *** Successfully Added *** \t\t\n");
                            } else {
                                resArtist = new ArrayList();
                                resArtist.add(s);
                                mapArtist.put(newArtistAdd, resArtist);
                                if (!songobjAddartist.getArtist().equals(""))
                                    songobjAddartist.setArtist(songobjAddartist.getArtist() + "," + newArtistAdd);
                                else
                                    songobjAddartist.setArtist(newArtistAdd);

                            }
                        } else {
                            System.out.println("\n\t\t *** can't Add same Artist twice *** \t\t\n");
                        }
                    }
                }
                } else if (choiceSong.equalsIgnoreCase("R")) {
                    String tempArtistName, artistNameforDelete;
                    System.out.println("\033[H\033[2J");
                    System.out.println("\t\t\t\t\t**** Artist Remove Menu****");
                    System.out.println("Enter the title of song  ");
                    resTitle = mapTitle.get(sc.nextLine());
                    if(resTitle == null || resTitle.size() == 0 || resTitle.contains(null) || resTitle.contains(""))
                     System.out.println("Opps something went wrong!!  ");
                    else{
                    for (Integer s: resTitle) {
                        Song_lib songObjRemoveArtist = list.get(s);
                        if (songObjRemoveArtist.getArtist().contains(",")) {
                            String[] artist = songObjRemoveArtist.getArtist().split(",");
                            for (String k: artist) {
                                if (k.equalsIgnoreCase(""))
                                    continue;
                                resArtist = mapArtist.get(k);
                                songObjRemoveArtist.setArtist("");
                                resArtist.remove(s);
                                mapArtist.remove(songObjRemoveArtist.getArtist());
                                mapArtist.put(songObjRemoveArtist.getArtist(), resTitle);
                            }
                        }else
                        {
                                songObjRemoveArtist.setArtist("");
                                resArtist.remove(s);
                                mapArtist.remove(songObjRemoveArtist.getArtist());
                                mapArtist.put(songObjRemoveArtist.getArtist(), resTitle);
                        }
                    }
                }
                    if (mapArtist.containsKey(""))
                        mapArtist.remove("");
                } else {
                    System.out.println("\033[H\033[2J");
                    System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
                }

                break;
            case 9: /*Add songs to and remove them from albums*/ {

                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t****  Song Add and remove Menu****");
                System.out.println("Press A for Add Song\tPress R for Remove Song");
                choiceSong = sc.next();
                sc.nextLine();
                if (choiceSong.equalsIgnoreCase("A")) {

                    System.out.println("Enter the Album ");
                    albumSearch = sc.nextLine();
                    if (!mapAlbum.containsKey(albumSearch)) {
                        System.out.println("Album is not exist go to [7th --> A] option ");
                        break;
                    } else {
                        Song_lib songAddObj = new Song_lib();

                        System.out.println("\t\t\t\t\t\tEnter the Song Details \n\n\n");
                        System.out.println("Enter the Title ");
                        songAddObj.setTitle(sc.nextLine());

                        System.out.println("Enter the Artist ");
                        songAddObj.setArtist(sc.nextLine());

                        System.out.println("Enter the Duration ");
                        songAddObj.setDuration(sc.nextLine());

                        System.out.println("Enter the Year ");
                        songAddObj.setYear(sc.nextLine());
                        songAddObj.setAlbum(albumSearch);
                        list.add(songAddObj);

                        resAlbum = mapAlbum.get(albumSearch);

                        resAlbum.add(list.indexOf(songAddObj));

                        if (mapArtist.containsKey(songAddObj.getArtist())) {
                            System.out.println("Artist is Already exist this Song will automatically add on Artist list ");

                            resArtist = mapArtist.get(songAddObj.getArtist());

                            resArtist.add(list.indexOf(songAddObj));

                        } else {
                            resArtist = new ArrayList();
                            resArtist.add(list.indexOf(songAddObj));
                            mapArtist.put(songAddObj.getArtist(), resArtist);

                        }
                    }
                } else if (choiceSong.equalsIgnoreCase("R")) {
                    System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
                    String searchAlbum, songDelete;
                    System.out.println("Enter the Album Name -> Song Name  for  Delete");
                    searchAlbum = sc.nextLine();
                    if (mapAlbum.containsKey(searchAlbum)) {
                        System.out.println("Enter the  Song Name  for  Delete");
                        songDelete = sc.nextLine();
                        if (mapTitle.containsKey(songDelete)) {
                            resTitle = mapTitle.get(songDelete);
                            for (Integer s: resTitle) {
                                Song_lib songObjRemoveAlbum = list.get(s);
                                if (songObjRemoveAlbum.getTitle().equalsIgnoreCase(songDelete) && songObjRemoveAlbum.getAlbum().equalsIgnoreCase(searchAlbum)) {
                                    resAlbum = mapAlbum.get(songObjRemoveAlbum.getAlbum());
                                    resAlbum.remove(s);
                                    resArtist = mapArtist.get(songObjRemoveAlbum.getArtist());
                                    resArtist.remove(s);
                                    mapTitle.remove(songDelete);
                                    list.remove(songObjRemoveAlbum);
                                    reIndex(mapTitle, s, "Title");
                                    reIndex(mapArtist, s, "Artist");
                                    reIndex(mapAlbum, s, "Album");
                                    System.out.println("after the Function call mapTitle  " + mapTitle);
                                    System.out.println("after the Function call mapTitle  " + mapArtist);
                                    System.out.println("after the Function call mapTitle  " + mapAlbum);
                                } else {
                                    System.out.println("\n\t\t oops!! something went wrong ");
                                }
                            }
                        } else {
                            System.out.println("Song not Exist  go to song Add menu");
                            break;
                        }
                    } else {
                        System.out.println("Album is not exist go to [7th --> A] option ");
                        break;
                    }
                } else {
                    System.out.println("\033[H\033[2J");
                    System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
                }
                break;
            }
            default:
                System.out.println("\n\t****Please give a valid Input****\t\n");
                break;
            }
        } //while end
    } //End of main() method
} //end of  class