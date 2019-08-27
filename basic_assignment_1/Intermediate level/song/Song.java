import java.util.*;
class Song_lib  {
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
    // public float compare(Song o1, Song o2) {
    //
    //   return o1.getDuration()-o2.getDuration();
    // }
  }                                                   /*Class end */
  public class Song  {
    public static void main(String[] args)
    {
      int i,size,choice;
      String Title,Artist,Year,Album,Duration;
      Scanner sc = new Scanner(System.in);
      Map< String, Integer > mapTitle=new HashMap< String, Integer >();
      Map< String, Integer > mapArtist=new HashMap< String, Integer >();
      Map< String, Integer > mapAlbum=new HashMap< String, Integer >();
      List<Song_lib> list = new ArrayList<Song_lib>();
      /*
      System.out.println("How much details you want to Enter");
      size=sc.nextInt() ;
      sc.nextLine();

      for(i=0;i<size;i++)
      {
      System.out.println("\t\t\t\tEnter the  "+(i+1)+"  Details \t\t\t\t\n");
      System.out.println("Enter the Title ");
      Title=sc.nextLine();

      System.out.println("Enter the Album ");
      Album=sc.nextLine();

      System.out.println("Enter the Year ");
      Year=sc.nextLine();

      System.out.println("Enter the Artist ");
      Artist=sc.nextLine();

      System.out.println("Enter the Duration ");
      Duration=sc.nextLine();
      Song_lib song=new Song_lib();
      song.setDuration(Duration);
      song.setTitle(Title);
      song.setYear(Year);
      song.setAlbum(Album);
      song.setArtist(Artist);
      list.add(song);
      mapTitle.put(Title,i);
      mapAlbum.put(Album,i);
      mapArtist.put(Artist,i);
    }*/

    /*Test input Start*/

    Title="Spno ki rani";
    Artist="Kishore Kumar";
    Year="1969";
    Duration="5.0";
    Album="Aradhana";
    Song_lib song=new Song_lib();
    song.setDuration(Duration);
    song.setTitle(Title);
    song.setYear(Year);
    song.setAlbum(Album);
    song.setArtist(Artist);
    list.add(song);
    mapTitle.put(Title,0);
    mapAlbum.put(Album,0);
    mapArtist.put(Artist,0);


    /*Test input end*/

    for (Song_lib s : list)
    {
      System.out.println("\n\n"+s.getTitle() +" " +s.getAlbum() +" " +s.getYear() +" " +s.getArtist() +" " +s.getDuration() );
    }
    while(true)
    {
      System.out.println("===========================================================================================================");
      System.out.println("Press 1 View a list of all the songs in \nPress 2 list of all the artists in the library.");
      System.out.println("Press 3 list of all the albums in the library.\nPress 4 Edit any information in the library");
      System.out.println("Press 5 View a list of all the songs by a particular artist.\nPress 6 View a list of all the songs on a particular album.");
      System.out.println("Press 7 Add songs to and remove them from the library. \nPress 8 Add artists to and remove them from songs.");
      System.out.println("Press 9 Add songs to and remove them from albums");
      choice= sc.nextInt();
      sc.nextLine();
      switch(choice)
      {
        case 1:{
          System.out.println("\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
          for (Song_lib s : list)
          {
            System.out.println("\t"+s.getTitle()+"\t\t" +s.getAlbum()+"\t\t" +s.getYear()+"\t\t" +s.getArtist()+"\t" +s.getDuration());
          }
          System.out.println("===========================================================================================================");
        }
        break;
        case 2:
        {
          System.out.println("\tArtist");
          for (Song_lib s : list)
          {
            System.out.println("\n\n"+" " +s.getArtist() );
          }
          break;
        }
        case 3:
        {
          System.out.println("\tAlbum");
          for (Song_lib s : list)
          {
            System.out.println("\n\n"+" " +s.getAlbum() );
          }
          System.out.println("\n\n"+mapAlbum);
          break;
        }
        case 4:
        {
          String Update_decision,Title1,Album1,Choice_title,update_search,Artist1;
          int update_search_result;
          System.out.println("\033[H\033[2J");
          System.out.println("\t\t\t\t\t****Edit Menu****");
          System.out.println("\n\tPress T Title of songs\tPress A for Edit Albums\tPress N names of Artists ");
          Choice_title=sc.next();
          //if( Choice_title.equalsIgnoreCase("T")|| Choice_title.equalsIgnoreCase("t"))
          if(Choice_title.equalsIgnoreCase("T"))
          {
            System.out.println("\033[H\033[2J");
            System.out.println("\t\t\t\t\t**** Title Edit Menu****");
            System.out.println("Enter the Title ");
            sc.nextLine();
            update_search = sc.nextLine();
            update_search_result =mapTitle.get(update_search);
            Song_lib song_obj_title=(Song_lib)list.get(update_search_result);
            System.out.println("\t\t\t\t\t\t\tYour Search Result");
            System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
            System.out.println("\t"+song_obj_title.getTitle()+"\t\t" +song_obj_title.getAlbum()+"\t\t" +song_obj_title.getYear()+"\t\t" +song_obj_title.getArtist()+"\t" +song_obj_title.getDuration());
            System.out.println("\t\t\t\tPress Y  for Confirm and Update\tPress N for Cancel");
            Update_decision=sc.next();
            sc.nextLine();
            if(Update_decision.equalsIgnoreCase("Y"));
            //if(Update_decision.equalsIgnoreCase("Y")||Update_decision.equalsIgnoreCase("y"))
            {
              System.out.println("Enter the New Title ");
              Title1=sc.nextLine();
              song_obj_title.setTitle(Title1);
              System.out.println("\t\t\t\tUpdated Result is :\n");
              mapTitle.put(Title1,update_search_result);                                                  //Map update
              System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
              System.out.println("\t"+song_obj_title.getTitle()+"\t\t" +song_obj_title.getAlbum()+"\t\t" +song_obj_title.getYear()+"\t\t" +song_obj_title.getArtist()+"\t" +song_obj_title.getDuration());
            }
          }
          else if(Choice_title.equalsIgnoreCase("A"))
          // else if(Update_decision.equalsIgnoreCase("A")||Update_decision.equalsIgnoreCase("a"))
          {
            System.out.println("\033[H\033[2J");
            System.out.println("\t\t\t\t\t**** Album Edit Menu****");
            System.out.println("Enter the old Album name ");
            update_search=sc.next();
            sc.nextLine();
            update_search_result =mapAlbum.get(update_search);
            Song_lib song_obj_album=(Song_lib)list.get(update_search_result);
            System.out.println("\t\t\t\t\t\t\tYour Search Result");
            System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
            System.out.println("\t"+song_obj_album.getTitle()+"\t\t" +song_obj_album.getAlbum()+"\t\t" +song_obj_album.getYear()+"\t\t" +song_obj_album.getArtist()+"\t" +song_obj_album.getDuration());
            System.out.println("\t\t\t\t\t\t\tPress Y for Confirm and Update\tPress N for Cancel");
            Update_decision=sc.nextLine();
            if(Update_decision.equalsIgnoreCase("Y"))
            {
              System.out.println("Enter the new Album Name ");
              Album1=sc.nextLine();
              song_obj_album .setAlbum(Album1);
              mapAlbum.put(Album1,update_search_result);
            }
          }
          else if(Choice_title.equalsIgnoreCase("N"))
          // else if(Update_decision.equalsIgnoreCase("A")||Update_decision.equalsIgnoreCase("a"))
          {
            System.out.println("\033[H\033[2J");
            System.out.println("\t\t\t\t\t**** Artist Name  Edit Menu****");
            sc.nextLine();
            System.out.println("Enter the old Artist Name ");
            update_search=sc.nextLine();
            update_search_result =mapArtist.get(update_search);
            Song_lib song_obj_name=(Song_lib)list.get(update_search_result);
            System.out.println("\t\t\t\t\t\t\tYour Search Result");
            System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
            System.out.println("\t"+song_obj_name.getTitle()+"\t\t" +song_obj_name.getAlbum()+"\t\t" +song_obj_name.getYear()+"\t\t" +song_obj_name.getArtist()+"\t" +song_obj_name.getDuration());
            System.out.println("\t\t\t\t\t\t\tPress Y for Confirm and Update\tPress N for Cancel");
            Update_decision=sc.nextLine();
            if(Update_decision.equalsIgnoreCase("Y"))
            {
              System.out.println("Enter the  New Aritst Name ");
              Artist1=sc.nextLine();
              song_obj_name .setArtist(Artist1);
              mapArtist.put(Artist1,update_search_result);
            }
          }else
          {
            System.out.println("\033[H\033[2J");
            System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
          }
        }
        break;
        case 5:
        {                                                               //View a list of all the songs by a particular artist.
          String Artist_search;
          System.out.println("Enter the  Aritst Name ");
          Artist_search=sc.nextLine();
          System.out.println("\033[H\033[2J");
          System.out.println("\t\t\t\t\t****list of all the songs by a "+Artist_search+" is ****");
          for (Song_lib s : list)
          {
            if(s.getArtist().equals(Artist_search))
            {
              System.out.println("\n\n"+" " +s.getTitle() );
            }
          }
        }
        break;
        case 6:                                                                   /*View a list of all the songs on a particular album.*/
        {
          String Album_search;
          System.out.println("Enter the Name of Album ");
          Album_search =sc.nextLine();
          System.out.println("\033[H\033[2J");
          System.out.println("\t\t\t\t\t****list of all the songs in Album : "+Album_search+" ****");
          for (Song_lib s : list)
          {
            if(s.getAlbum().equals(Album_search))
            {
              System.out.println("\n\n"+" " +s.getTitle() );
            }
          }
        }
        break;
        case 7:                                                                  /*Add songs to and remove them from the library.*/
        {
          String Choice_song;
          System.out.println("\033[H\033[2J");
          System.out.println("Press A for Add song\tPress R for Remove Song");
          Choice_song=sc.next();
          sc.nextLine();
          if(Choice_song.equalsIgnoreCase("A"))
          {
            System.out.println("\033[H\033[2J");
            System.out.println("\t\t\t\t\t**** New Song Addition Menu****");
            System.out.println("Enter the Title ");
            Title=sc.nextLine();
            System.out.println("Enter the Album ");
            Album=sc.nextLine();
            System.out.println("Enter the Year ");
            Year=sc.nextLine();
            System.out.println("Enter the Artist ");
            Artist=sc.nextLine();
            System.out.println("Enter the Duration ");
            Duration=sc.nextLine();
            Song_lib song_add=new Song_lib();
            song_add.setDuration(Duration);
            song_add.setTitle(Title);
            song_add.setYear(Year);
            song_add.setAlbum(Album);
            song_add.setArtist(Artist);
            list.add(song_add);
            mapAlbum.put(Album,1);
            mapArtist.put(Artist,1);

          }else if(Choice_song.equalsIgnoreCase("R"))
          {
            System.out.println("\033[H\033[2J");
            mapTitle.put(Title,1);
            System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
            String Song_delete;int search_delete_result;
            System.out.println("Enter the Name for  Delete");
            Song_delete=sc.nextLine();
            search_delete_result =mapTitle.get(Song_delete);
            Song_lib song_obj_delete=(Song_lib)list.get(search_delete_result);
            list.remove(song_obj_delete);
            mapTitle.remove(song_obj_delete.getTitle());
            mapAlbum.remove(song_obj_delete.getAlbum());
            mapArtist.remove(song_obj_delete.getArtist());

          }else
          {
            System.out.println("\033[H\033[2J");
            System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
          }
        }
        break;
        case 8:/*Add artists to and remove them from songs*/
        {
          System.out.println("\033[H\033[2J");
          System.out.println("\t\t\t\t\t****  Artists Add and remove Menu****");
          String  Choice_song,Title_search,  Artist2,newvalue;
          int update_search_result_artist,update_map;
          System.out.println("Press A for Add Artist\tPress R for Remove Artist");
          Choice_song=sc.next();
          sc.nextLine();
          if(Choice_song.equalsIgnoreCase("A"))
          {
            System.out.println("\033[H\033[2J");
            System.out.println("\t\t\t\t\t**** New Artist Addition Menu****");
            System.out.println("Enter the title of songe  ");
            Title_search=sc.nextLine();
            update_search_result_artist =mapTitle.get(Title_search);
            Song_lib song_obj_Add_artist=(Song_lib)list.get(update_search_result_artist);
            System.out.println("\t\tGiven title :  "+Title +" Artist name :  "+song_obj_Add_artist.getArtist());
            update_map=mapArtist.get(song_obj_Add_artist.getArtist());
            System.out.println("Enter the New Artist name");
            Artist2=sc.nextLine();
            song_obj_Add_artist.setArtist(song_obj_Add_artist.getArtist()+","+Artist2);
            System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
            System.out.println("\t"+song_obj_Add_artist.getTitle()+"\t\t" +song_obj_Add_artist.getAlbum()+"\t\t" +song_obj_Add_artist.getYear()+"\t\t" +song_obj_Add_artist.getArtist()+"\t" +song_obj_Add_artist.getDuration());
            newvalue=(song_obj_Add_artist.getArtist());
            mapArtist.put(newvalue,update_map);
            System.out.println(mapArtist);

          }else if(Choice_song.equalsIgnoreCase("R"))
          {
            String temp_artist_name,artist_name_for_delete;
            System.out.println("\033[H\033[2J");
            System.out.println("\t\t\t\t\t**** Artist Remove Menu****");
            System.out.println("Enter the title of songe  ");
            Title_search=sc.nextLine();
            update_search_result_artist =mapTitle.get(Title_search);
            Song_lib song_obj_remove_artist=(Song_lib)list.get(update_search_result_artist);                      //right
            System.out.println("\t\tGiven title :  "+Title +" Artist name :  "+song_obj_remove_artist.getArtist());
            temp_artist_name=song_obj_remove_artist.getArtist();
          }
          else
          {
            System.out.println("\033[H\033[2J");
            System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
          }
        }
        break;
        case 9:/*Add songs to and remove them from albums*/
        {
          String  Choice_song,Title_search;
          int update_search_result_artist,update_map;
          System.out.println("\033[H\033[2J");
          System.out.println("\t\t\t\t\t****  Song Add and remove Menu****");
          System.out.println("Press A for Add Song\tPress R for Remove Song");
          Choice_song=sc.next();
          sc.nextLine();
          if(Choice_song.equalsIgnoreCase("A"))
          {
            System.out.println("Enter the Title ");
            Title=sc.nextLine();
            System.out.println("Enter the Album ");
            Album=sc.nextLine();
            System.out.println("Enter the Year ");
            Year=sc.nextLine();
            System.out.println("Enter the Artist ");
            Artist=sc.nextLine();
            System.out.println("Enter the Duration ");
            Duration=sc.nextLine();
            Song_lib song_add2=new Song_lib();
            song_add2.setDuration(Duration);
            song_add2.setTitle(Title);
            song_add2.setYear(Year);
            song_add2.setAlbum(Album);
            song_add2.setArtist(Artist);
            list.add(song_add2);
            mapAlbum.put(Album,2);
            mapArtist.put(Artist,2);
          }else if(Choice_song.equalsIgnoreCase("R"))
          {
            System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
            String Song_delete;int search_delete_result;
            System.out.println("Enter the Name for  Delete");
            Song_delete=sc.nextLine();
            search_delete_result =mapTitle.get(Song_delete);
            Song_lib song_obj_delete2=(Song_lib)list.get(search_delete_result);
            list.remove(song_obj_delete2);
            mapTitle.remove(song_obj_delete2.getTitle());
            mapAlbum.remove(song_obj_delete2.getAlbum());
            mapArtist.remove(song_obj_delete2.getArtist());
            System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
            System.out.println("\t"+song_obj_delete2.getTitle()+"\t\t" +song_obj_delete2.getAlbum()+"\t\t" +song_obj_delete2.getYear()+"\t\t" +song_obj_delete2.getArtist()+"\t" +song_obj_delete2.getDuration());
          }else
          {
            System.out.println("\033[H\033[2J");
            System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
          }

        }
        break;
        default:
        System.out.println("\n\t****Please give a valid Input****\t\n");
        break;
      }

    }//while end
  }//End of main() method
}//end of DisplayArrayList class
