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
    for (Integer s: res) {
        SongLib editObj = list.get(s);
        System.out.println("Enter the New "+s);

        if(s.equals("Title")){
        mapTitle.remove(search);
        editObj.setTitle(sc.nextLine());        
        mapTitle.put(editObj.getTitle(), res);    
        }

        else if(s.equals("Album")){
        mapAlbum.remove(search);
        editObj.setAlbum(sc.nextLine());
        mapAlbum.put(editObj.getAlbum(),res);
        }
        /*Artist name baki hy */
        } 
        
    }/*editInfo end*/

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
                    case:"T":
                    editInfo(resTitle,list,mapTitle,"Title");
                    break;
                    case:"A":
                    editInfo(resTitle,list,mapTitle,"Album");
                    break;
                    case:"N":
                    editInfo(resTitle,list,mapTitle,"Artist");
                    break;
                }
                break;

            }/*Switch end*/
        }/*While close */
    }/*Main Function End*/
}/*MusicLib end*/