import java.util.*;
class Song_lib implements Comparator<Song_lib> {
  public String title;
  private String artist;
  private String album;
  private String year;
  private String duration;
  public Song_lib(){}

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
    public int compare(Emp e1, Emp e2) {
        if(e1.getEmpId() == e2.getEmpId()){
            return 0;
        } else {
            return -1;
        }
    }
    
  }                                                   /*Class end */
  public class Song_update {                          /*Class Song_update Start */
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      String Title,Artist,Year,Album,Duration;
      String Title_update,Artist_update,Album_update;
      HashMap< String, ArrayList<Song_lib> > mapTitle=new HashMap< String, ArrayList<Song_lib> >();
      HashMap< String, ArrayList<Song_lib> > mapArtist=new HashMap< String, ArrayList<Song_lib> >();
      HashMap< String, ArrayList<Song_lib> > mapAlbum=new HashMap< String, ArrayList<Song_lib> >();
      ArrayList<Song_lib> list = new ArrayList<Song_lib>();
                                  /*Test Input */
       Title="Spno ki rani";
       Artist="Kishore Kumar";
       Year="1969";
       Duration="5.0";
       Album="Aradhana";
       Song_lib song=new Song_lib();
       song.setTitle(Title);
       song.setAlbum(Album);
       song.setArtist(Artist);
       song.setDuration(Duration);
       song.setYear(Year); 
       list.add(song);
       mapTitle.put("Spno ki rani",list);
       /*Input 2*/
       Title="Mere Mhbub";
       Artist="Kishore Kumar";
       Year="1956";
       Duration="3.0";
       Album="Shore";
       Song_lib song1=new Song_lib();
       song1.setTitle(Title);
       song1.setAlbum(Album);
       song1.setArtist(Artist);
       song1.setDuration(Duration);
       song1.setYear(Year); 
       list.add(song1);
       mapTitle.put("Mere Mhbub",list);
       mapArtist.put("Kishore Kumar",list);
       mapAlbum.put("Shore",list);
       /*Input 3*/
        Title="Mere dill ";
       Artist="Mukesh";
       Year="1976";
       Duration="4.0";
       Album="Kbhi";
       Song_lib song2=new Song_lib();
       song2.setTitle(Title);
       song2.setAlbum(Album);
       song2.setArtist(Artist);
       song2.setDuration(Duration);
       song2.setYear(Year); 
       list.add(song2);
       mapTitle.put("Mere dill me khayal ata hy",list);
       mapArtist.put("Mukesh",list);
       mapAlbum.put("Kbhi",list);
        /*Test Input End */
      /*View a list of all the songs in the library and see information about each song, 
      including the album on which it appears and the artist(s) who performed it.*/
      System.out.println("_____________________________________________________________________________________________________________________");  
      Print(list);
      /*View a list of all the artists in the library.*/
      System.out.println("_____________________________________________________________________________________________________________________");  
      System.out.println("\n1):list of all the artists :   "+mapArtist.keySet().toString());  
      /*View a list of all the albums in the library.*/  
      System.out.println("_____________________________________________________________________________________________________________________");  
      System.out.println("\n2):Albums list :   "+mapAlbum.keySet().toString());  
      /*Edit any information in the library. This includes changing the title of songs and albums and changing the names of artists.*/
      System.out.println("_____________________________________________________________________________________________________________________");  
      System.out.println("Enter the old Title of the Song\n");  
      Title=sc.nextLine(); 
      System.out.println("Enter the New Title of the Song\n");  
      Title_update=sc.nextLine();
      Title_change(list,mapTitle,Title,Title_update);
  }//End of main() method
  public  static void Print(ArrayList<Song_lib> list){
    for (Song_lib s : list){
      System.out.println("\n"+s.getTitle() +" " +s.getAlbum() +" " +s.getYear() +" " +s.getArtist() +" " +s.getDuration() );
    }
  }/*Print Function End */
  public static void Title_change(ArrayList<Song_lib> list,HashMap< String, ArrayList<Song_lib>> map ,String Title,String Title_update)
  {
    ((Song_lib)list.get(0)).setTitle(Title_update);/*[(Song_lib)list.get(0)) ] this is working like a object of current class*/    
    Song_lib searchKey = new Song(Title);
    int index = Collections.binarySearch(list, searchKey, new EmpComp());
    System.out.println("Index of the searched key: "+index);
    Print(list);
  }

  }//end of Song_update class