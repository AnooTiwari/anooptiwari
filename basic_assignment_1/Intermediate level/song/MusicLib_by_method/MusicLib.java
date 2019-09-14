import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class SongLib {
    public String title;
    private String artist;
    private String album;
    private String duration;
    private String year;
    public SongLib(String title,String artist,String album,String duration,String year) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
        this.year = year;

    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }     
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getArtist() {
        return artist;
    }
    public void setAlbum(String album) {
        this.album = album;
    }
    public String getAlbum() {
        return album;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
     public String getDuration() {
        return duration;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getYear() {
        return year;
    }    
} 
public class MusicLib{
    Scanner sc= new Scanner(System.in);


    public static void printListOfAllSong(List < SongLib > list){
        if(list == null || list.size() == 0 || list.contains(null) || list.contains(""))
            System.out.println("\n\t\t___--**Please Insert Data First**--___\t\t\n");
        else
        for (SongLib s: list) {
        System.out.println(list.indexOf(s) + "\t" + s.getTitle() + "\t\t" + s.getAlbum() + "\t\t" );
        System.out.println(s.getYear() + "\t\t" + s.getArtist() + "\t" + s.getDuration());
        }
    }/*printListOfAllSong end*/

    public static  void prinListofallKey( Map < String, List < Integer >> mapkey){
        if(mapkey.isEmpty())
        System.out.println("\n\t\t___--**Please Insert Data First In Map**--___\t\t\n");
        else
        System.out.println("\n" +mapkey.keySet());
    }/*prinListOfAllArtist End*/


    public static  void editInfo(List < Integer > res,List < SongLib > list,Map < String, List < Integer >> map,String s){
    System.out.println("Enter the old"+s);
    String search;
    res = map.get(search); 
    for (Integer k: res) {
        SongLib editObj = list.get(k);
        System.out.println("Enter the New "+s);

        if(s.equals("Title")){
        map.remove(search);
        editObj.setTitle(sc.nextLine());        
        map.put(editObj.getTitle(), res);    
        }

        else if(s.equals("Album")){
        map.remove(search);
        editObj.setAlbum(sc.nextLine());
        map.put(editObj.getAlbum(),res);
        }
        else if(s.equals("Artist")){
            map.remove(search);
            editObj.setArtist(sc.nextLine());
            map.put(editObj.getArtist(),res);
        }
    }/*For loop end*/
    }/*editInfo end*/

    public static  void listofmap(String s,List < Integer > res,List < SongLib > list,Map < String, List < Integer >> map){
        
        System.out.println("Enter the "+s+" Name ");
        if(s.equals("Artist"))
        res = map.get(sc.nextLine());

        if(s.equals("Album"))
        res = map.get(sc.nextLine());

        for (Integer s: res) {
        SongLib objList = list.get(s);
        System.out.println(objList.getTitle());
        }

    }/*listofmap end*/

    public static void addSonginLib(Map < String, List < Integer >> mapTitle,Map < String, List < Integer >> mapAlbum,Map < String, List < Integer >> mapArtist,List < SongLib > list,List < Integer > resArtist,List < Integer > resAlbum,List < Integer > resTitle){
        while(true)
        {
        System.out.println("Enter the Title ");
        if (mapTitle.containsKey(sc.nextLine())) {
        System.out.println("Song is Already Present Please Remove it First ");
        break;
        }else {
                SongLib newSongAddObj = new SongLib();
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
                ifKeyIsExistInMapz(mapArtist,newSongAddObj,resArtist,list,"Artist");
                ifKeyIsExistInMapz(mapAlbum,newSongAddObj,resAlbum,list,"Album");
                resTitle = new ArrayList();
                resTitle.add(list.indexOf(newSongAddObj));
                mapTitle.put(newAddTitle, resTitle);
            }
        printAllMap(mapTitle);
        printAllMap(mapAlbum);
        printAllMap(mapArtist);
        System.out.println("press 0 for exit");
        String exit = sc.nextLine();
        if (exit.equalsIgnoreCase("e"))
            break;                  
    }
    }/*addSonginLib end*/

    public static void removeSonginLib(Map < String, List < Integer >> mapTitle,Map < String, List < Integer >> mapAlbum,Map < String, List < Integer >> mapArtist,List < SongLib > list,List < Integer > resArtist,List < Integer > resAlbum,List < Integer > resTitle){
        System.out.println("Enter the Title of Song for  Delete");
        resTitle = mapTitle.get(sc.nextLine());
        if(resTitle == null || resTitle.size() == 0 || resTitle.contains(null) || resTitle.contains(""))
        System.out.println("Opps something went wrong!! Give Right Input  ");
        else{
        for (Integer k: resTitle) {
            SongLib songforDeleteObj = list.get(k);
            mapTitle.remove(songforDeleteObj.getTitle());
            resArtist = mapArtist.get(songforDeleteObj.getArtist());
            resArtist.remove(k);

            resAlbum = mapAlbum.get(songforDeleteObj.getAlbum());
            resAlbum.remove(k);

            list.remove(songforDeleteObj);

            reIndex(mapTitle, k, "Title");
            reIndex(mapArtist, k, "Artist");
            reIndex(mapAlbum, k, "Album");
            }
        }
    }/*removeSonginLib end*/

    public static void printAllMap(Map < String, List < Integer >> map){
        System.out.println(map);         
    }/*printAllMap end*/ 

    public static void ifKeyIsExistInMap(Map < String, List < Integer >> map,SongLib obj,List < Integer > res,List < SongLib > list,String s){
        if(s.equals("Artist")){
        if (map.containsKey(obj.getArtist())) {
        res = map.get(obj.getArtist());
        res.add(list.indexOf(obj));
        }else{
            res = new ArrayList();
            res.add(list.indexOf(obj));
            map.put(obj.getArtist(),res);
            }
        }else if(s.equals("Album")){
        if (map.containsKey(obj.getAlbum())) {
        res = map.get(obj.getAlbum());
        res.add(list.indexOf(obj));
        }else{
            res = new ArrayList();
            res.add(list.indexOf(obj));
            map.put(obj.getAlbum(),res);
            }
        }
    }/*ifKeyIsExistInMap end*/
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

    public static void addSongInAlbm(Map < String, List < Integer >> mapTitle,Map < String, List < Integer >> mapAlbum,Map < String, List < Integer >> mapArtist,List < SongLib > list,List < Integer > resArtist,List < Integer > resAlbum,List < Integer > resTitle){
    System.out.println("Enter the Album ");
      String albumSearch = sc.nextLine();
        if (!mapAlbum.containsKey(albumSearch)) {
            System.out.println("Album is not exist go to [7th --> A] option ");
            break;
        } else {
            SongLib songAddObj = new Song_lib();

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
            ifKeyIsExistInMapz(mapArtist,songAddObj,resArtist,list,"Artist");
        }
    }/*addSongInAlbm end*/

    public static void removeSongInAlbm(Map < String, List < Integer >> mapTitle,Map < String, List < Integer >> mapAlbum,Map < String, List < Integer >> mapArtist,List < SongLib > list,List < Integer > resArtist,List < Integer > resAlbum,List < Integer > resTitle){
                 String searchAlbum, songDelete;
                    System.out.println("Enter the Album Name ");
                    searchAlbum = sc.nextLine();
                    if (mapAlbum.containsKey(searchAlbum)) {
                        System.out.println("Enter the  Song Name  for  Delete");
                            resTitle = mapTitle.get(sc.nextLine());
                            if(resTitle == null || resTitle.size() == 0 || resTitle.contains(null) || resTitle.contains(""))
                            System.out.println("Opps something went wrong!! Give Right Input  ");
                            else
                            for (Integer k: resTitle) {
                                SongLib songObjRemoveAlbum = list.get(k);
                                if (songObjRemoveAlbum.getTitle().equalsIgnoreCase(songDelete) && songObjRemoveAlbum.getAlbum().equalsIgnoreCase(searchAlbum)) 
                                {
                                    resAlbum = mapAlbum.get(songObjRemoveAlbum.getAlbum());
                                    resAlbum.remove(k);
                                    resArtist = mapArtist.get(songObjRemoveAlbum.getArtist());
                                    resArtist.remove(k);
                                    mapTitle.remove(songDelete);
                                    list.remove(songObjRemoveAlbum);
                                    reIndex(mapTitle, k, "Title");
                                    reIndex(mapArtist,k, "Artist");
                                    reIndex(mapAlbum, k, "Album");
                                }
                            }/*loop end*/
                        }else {
                        System.out.println("Album is not exist go to [7th --> A] option ");
                        break;
                    }
    }/*removeSongInAlbm end*/


    public static void main(String ar[]){
        int i, size;
        String title, artist, year, album, duration,choice;
        Scanner sc = new Scanner(System.in);
        Map < String, List < Integer >> mapTitle = new HashMap < > ();
        Map < String, List < Integer >> mapArtist = new HashMap < > ();
        Map < String, List < Integer >> mapAlbum = new HashMap < > ();
        List < SongLib > list = new ArrayList < SongLib > ();
        List < Integer > resArtist = new ArrayList();
        List < Integer > resAlbum = new ArrayList();
        List < Integer > resTitle = new ArrayList();
        while (true) {
            System.out.println("===========================================================================================================");
            System.out.println("Press 1 View a list of all the songs in \nPress 2 list of all the artists in the library.");
            System.out.println("Press 3 list of all the albums in the library.\nPress 4 Edit any information in the library");
            System.out.println("Press 5 View a list of all the songs by a particular artist.\nPress 6 View a list of all the songs on a particular album.");
            System.out.println("Press 7 Add songs to and remove them from the library. \nPress 8 Add artists to and remove them from songs.");
            System.out.println("Press 9 Add songs to and remove them from albums");
            choice = sc.next();
            sc.nextLine();
            switch (choice) {
                case "1": 
                printListOfAllSong(list);
                break;
                case "2":
                prinListofallKey(mapArtist);
                break;
                case "3":
                prinListofallKey(mapAlbum);
                break;
                case "4":
                System.out.println("\n\tPress --[ T ]-- Title of songs\tPress --[ A ]-- for Edit Albums\tPress --[ N ]-- Names of Artists ");
                switch(sc.nextLine().toUpperCase()){
                    case "T":
                    editInfo(resTitle,list,mapTitle,"Title");
                    break;
                    case "A":
                    editInfo(resAlbum,list,mapAlbum,"Album");
                    break;
                    case "N":
                    editInfo(resArtist,list,mapArtist,"Artist");
                    break;
                }
                break;
                case "5":
                listofmap("Artist",resArtist,list,mapArtist);
                break;
                case "6":
                listofmap("Album",resAlbum,list,mapAlbum);
                break;
                case "7":
                System.out.println("Press --[ A ]-- for Add song\tPress --[ R ]-- for Remove Song");
                switch(sc.nextLine().toUpperCase()){
                    case "A":
                    addSonginLib(mapTitle,mapAlbum,mapArtist,list,resArtist,resAlbum,resTitle);
                    break;
                    case "R":
                    removeSonginLib(mapTitle,mapAlbum,mapArtist,list,resArtist,resAlbum,resTitle);
                    break;
                }
                break;
                case "8":

                break;
                case "9":
                System.out.println("Press --[ A ]-- for Add song\tPress --[ R ]-- for Remove Song From Album");
                switch(sc.nextLine().toUpperCase()){
                    case "A":
                    addSongInAlbm(mapTitle,mapAlbum,mapArtist,list,resArtist,resAlbum,resTitle);
                    break;
                    case "R":
                   removeSongInAlbm(mapTitle,mapAlbum,mapArtist,list,resArtist,resAlbum,resTitle);
                    break;
                }
                break;

            }/*Switch end*/
        }/*While close */
    }/*Main Function End*/
}/*MusicLib end*/