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
        Map< String, List<Integer> > mapTitle=new HashMap<>();
        Map< String, List<Integer>  > mapArtist=new HashMap<>();
        Map< String, List<Integer>  > mapAlbum=new HashMap< >();
        List<Song_lib> list = new ArrayList<Song_lib>();
          
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
        mapTitle.put(Title,Arrays.asList(new Integer[] {0}));
        mapAlbum.put(Album,Arrays.asList(new Integer[] {0}));
        mapArtist.put(Artist,Arrays.asList(new Integer[] {0}));
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
        mapTitle.put("Mere Mhbub",Arrays.asList(new Integer[] {1}));
        mapArtist.put("Kishore Kumar",Arrays.asList(new Integer[] {0,1}));
        mapAlbum.put("Shore",Arrays.asList(new Integer[] {1}));
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
        mapTitle.put("Mere dill",Arrays.asList(new Integer[] {2}));
        mapArtist.put("Mukesh",Arrays.asList(new Integer[] {2}));
        mapAlbum.put("Kbhi",Arrays.asList(new Integer[] {2}));

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
              System.out.println("\n"+mapArtist.keySet());
              break;
            }
            case 3:
            {
              System.out.println("\tAlbum");
              
              System.out.println("\n\n"+mapAlbum.keySet());
              break;
            }
            case 4:
            {
              String Update_decision,Title1,Album1,Choice_title,update_search,Artist1;
              List<Integer> update_search_result= new ArrayList();
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
                System.out.println(mapTitle.get(update_search));
                update_search_result=mapTitle.get(update_search);
                System.out.println("update_search_result"+update_search_result);
                for(i=0;i<=update_search_result.size();i++){
                  Song_lib song_obj_title=(Song_lib)list.get(i);
                  if(song_obj_title.getTitle().equals(update_search)){
                    System.out.println("\t\t\t\t\t\t\tYour Search Result");
                    System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                    System.out.println("\t"+song_obj_title.getTitle()+"\t\t" +song_obj_title.getAlbum()+"\t\t" +song_obj_title.getYear()+"\t\t" +song_obj_title.getArtist()+"\t" +song_obj_title.getDuration());
                    System.out.println("\t\t\t\tPress Y  for Confirm and Update\tPress N for Cancel");
                    Update_decision=sc.next();
                    sc.nextLine();
                    if(Update_decision.equalsIgnoreCase("Y"));
                    {
                      System.out.println("Enter the New Title ");
                      Title1=sc.nextLine();
                      song_obj_title.setTitle(Title1);
                      System.out.println("\t\t\t\tUpdated Result is :\n");
                    mapTitle.put(Title1,Arrays.asList(new Integer[] {i}));  //Map update
                    System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                    System.out.println("\t"+song_obj_title.getTitle()+"\t\t" +song_obj_title.getAlbum()+"\t\t" +song_obj_title.getYear()+"\t\t" +song_obj_title.getArtist()+"\t" +song_obj_title.getDuration());
                  }
                }
              }
            } 
            else if(Choice_title.equalsIgnoreCase("A"))

            {
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t**** Album Edit Menu****");
              System.out.println("Enter the old Album name ");
              update_search=sc.next();
              sc.nextLine();
              System.out.println(mapAlbum.get(update_search));
              update_search_result =mapAlbum.get(update_search);
              System.out.println("update_search_result"+update_search_result+" update_search_result.size() "+update_search_result.size());
              for(i=0;i<=(update_search_result.size()+1);i++){
                Song_lib song_obj_album=(Song_lib)list.get(i);
                if(song_obj_album.getAlbum().equals(update_search)){
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
                    mapAlbum.put(Album1,Arrays.asList(new Integer[] {i}));
                  }
                }
              }
            }
            else if(Choice_title.equalsIgnoreCase("N"))
            {
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t**** Artist Name  Edit Menu****");
              sc.nextLine();
              System.out.println("Enter the old Artist Name ");
              update_search=sc.nextLine();
              System.out.println(mapArtist.get(update_search));
              update_search_result =mapArtist.get(update_search);
              System.out.println("update_search_result"+update_search_result+" update_search_result.size() "+update_search_result.size());
              for(i=0;i<=(update_search_result.size());i++){
                Song_lib song_obj_name=(Song_lib)list.get(i);
                if(song_obj_name.getArtist().equals(update_search)){
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
                    mapArtist.put(Artist1,Arrays.asList(new Integer[] {i}));
                  }
                }}}else
                {
                  System.out.println("\033[H\033[2J");
                  System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
                }
              }
              break;
              case 5:
            {                                                               //View a list of all the songs by a particular artist.
              String Artist_search;
              List<Integer> update_search_result= new ArrayList();
              System.out.println("Enter the  Artist Name ");
              Artist_search=sc.nextLine();
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t****list of all the songs by a "+Artist_search+" is ****");
              update_search_result =mapArtist.get(Artist_search);
              Object[] objects = update_search_result.toArray(); 
              for (Object obj : objects) {
                Song_lib list_of_song=(Song_lib)list.get((int)obj);
                System.out.println(list_of_song.getTitle());
              } }
              break;
              case 6:                                                                   /*View a list of all the songs on a particular album.*/
              {
                String Album_search;
                List<Integer> update_search_result= new ArrayList();
                System.out.println("Enter the Name of Album ");
                Album_search =sc.nextLine();
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t****list of all the songs in Album : "+Album_search+" ****");
                update_search_result =mapAlbum.get(Album_search);
                System.out.println("update_search_result"+update_search_result+" update_search_result.size() "+update_search_result.size());
                Object[] objects = update_search_result.toArray(); 
                for (Object obj : objects) {
                  Song_lib list_of_album=(Song_lib)list.get((int)obj);
                  System.out.println(list_of_album.getTitle());
                }

              }
              break;
              case 7:         /*Add songs to and remove them from the library.*/
              {
                List<Integer> update_search_result,find_index_value= new ArrayList();
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
                  if(mapTitle.containsKey(Title))
                  {
                    System.out.println("Song is Already Present Please Remove it first  by using [7 -> R ] option ");
                    break;
                  }else 
                  {
                    Song_lib song_add=new Song_lib();
                    song_add.setDuration(Duration);
                    song_add.setTitle(Title);
                    song_add.setYear(Year);
                    song_add.setAlbum(Album);
                    song_add.setArtist(Artist);
                    list.add(song_add);
                    if(mapArtist.containsKey(Artist))
                    {
                      System.out.println("Artist is Already Present this song will going to add Artist library  ");
                      update_search_result =mapArtist.get(Artist);
                      List<Integer> ints = new ArrayList<Integer>();
                      Object[] objects = update_search_result.toArray(); 
                      for (Object obj : objects) {
                       ints.add((int)obj);
                     }
                     ints.add(list.indexOf(song_add));
                     mapArtist.put(Artist,ints);
                   }
                   if(mapAlbum.containsKey(Album))
                   {
                    System.out.println("Album is Already Present this song will going to add Album library  ");
                    update_search_result =mapAlbum.get(Album);
                    List<Integer> ints = new ArrayList<Integer>();
                    Object[] objects = update_search_result.toArray(); 
                    for (Object obj : objects) {
                     ints.add((int)obj);
                   }
                   ints.add(list.indexOf(song_add));
                   mapAlbum.put(Album,ints);
                 }
               }            
             }else if(Choice_song.equalsIgnoreCase("R"))
             {
              List<Integer> ints = new ArrayList<Integer>();

              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
              String Song_delete;
              System.out.println("Enter the Title of Song for  Delete");
              Song_delete=sc.nextLine();
              System.out.println("Entered song is "+Song_delete);
              update_search_result=mapTitle.get(Song_delete);
              System.out.println("update_search_result for delete is "+update_search_result+"map is "+mapTitle);
              System.out.println("Check");
              Object[] objects = update_search_result.toArray(); 
              for (Object obj : objects) {
                Song_lib song_obj_delete=(Song_lib)list.get((int)obj);
                System.out.println("obj"+obj);
                System.out.println("\t\t\t\t\t\t\tYour Search Result");
                System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                System.out.println("\t"+song_obj_delete.getTitle()+"\t\t" +song_obj_delete.getAlbum()+"\t\t" +song_obj_delete.getYear()+"\t\t" +song_obj_delete.getArtist()+"\t" +song_obj_delete.getDuration());
                int x=list.indexOf(song_obj_delete);
                list.remove(song_obj_delete);
                mapTitle.remove(Song_delete); 
                find_index_value=mapArtist.get(song_obj_delete.getArtist());
                Object[] object = find_index_value.toArray(); 
                for (Object obk : object) {
                 ints.add((int)obk);
               }
               ints.remove(x);
               System.out.println("inst  "+ints);
               /*object loop close */
               mapAlbum.put(song_obj_delete.getAlbum(),ints);
               mapArtist.put(song_obj_delete.getArtist(),ints);
             }
           }
             else
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
              List<Integer> update_search_result_artist,find_index_value,update_map= new ArrayList();
              System.out.println("Press A for Add Artist\tPress R for Remove Artist");
              Choice_song=sc.next();
              sc.nextLine();
              if(Choice_song.equalsIgnoreCase("A"))
              {
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t**** New Artist Addition Menu****");
                System.out.println("Enter the title of song  ");
                Title_search=sc.nextLine();
                update_search_result_artist =mapTitle.get(Title_search);
                Object[] objects = update_search_result_artist.toArray(); 
                for (Object obj : objects) {
                Song_lib song_obj_Add_artist=(Song_lib)list.get((int)obj);  
                if(song_obj_Add_artist.getTitle().equals(Title_search)) {             
                System.out.println("\t\tGiven title :  "+Title_search +" Artist name :  "+song_obj_Add_artist.getArtist());
                update_map=mapArtist.get(song_obj_Add_artist.getArtist());
                System.out.println("Enter the New Artist name");
                Artist2=sc.nextLine();
                song_obj_Add_artist.setArtist(song_obj_Add_artist.getArtist()+","+Artist2);
                System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                System.out.println("\t"+song_obj_Add_artist.getTitle()+"\t\t" +song_obj_Add_artist.getAlbum()+"\t\t" +song_obj_Add_artist.getYear()+"\t\t" +song_obj_Add_artist.getArtist()+"\t" +song_obj_Add_artist.getDuration());
                newvalue=(song_obj_Add_artist.getArtist());
                mapArtist.put(newvalue,update_map);
                System.out.println(mapArtist);
              }
            }
          }
              else if(Choice_song.equalsIgnoreCase("R"))
              {
                String temp_artist_name,artist_name_for_delete;
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t**** Artist Remove Menu****");
                System.out.println("Enter the title of song  ");
                Title_search=sc.nextLine();
                update_search_result_artist =mapTitle.get(Title_search);
                Object[] objects = update_search_result_artist.toArray(); 
                for (Object obj : objects) 
                {
                Song_lib song_obj_remove_artist=(Song_lib)list.get((int)obj);  
                if(song_obj_remove_artist.getTitle().equals(Title_search)) { 
                System.out.println("\t\tGiven title :  "+Title +" Artist name :  "+song_obj_remove_artist.getArtist());
                temp_artist_name=song_obj_remove_artist.getArtist();
                song_obj_remove_artist.setArtist(null);
                mapArtist.remove(song_obj_remove_artist.getArtist());
                }
              }
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
              List<Integer> update_search_result_artist,find_index_value,update_map,ints = new ArrayList();
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t****  Song Add and remove Menu****");
              System.out.println("Press A for Add Song\tPress R for Remove Song");
              Choice_song=sc.next();
              sc.nextLine();
              if(Choice_song.equalsIgnoreCase("A"))
              {
                
                System.out.println("Enter the Album ");
                Album=sc.nextLine();
                if(!mapAlbum.containsKey(Album))
                {
                  System.out.println("Album is not exist go to [7th --> A] option ");
                  break;
                }else
                {
                  System.out.println("\033[H\033[2J\t\t\t\t\tEnter the Song Details ");
                  System.out.println("Enter the Title ");
                  Title=sc.nextLine();
                  System.out.println("Enter the Artist ");
                  Artist=sc.nextLine();
                  System.out.println("Enter the Year ");
                  Year=sc.nextLine();             
                  System.out.println("Enter the Duration ");
                  Duration=sc.nextLine();
                  Song_lib song_add2=new Song_lib();
                  song_add2.setDuration(Duration);
                  song_add2.setTitle(Title);
                  song_add2.setYear(Year);
                  song_add2.setAlbum(Album);
                  song_add2.setArtist(Artist);
                  list.add(song_add2);
                  update_search_result_artist =mapAlbum.get(Album);
                  Object[] objects = update_search_result_artist.toArray(); 
                    for (Object obj : objects) {
                     ints.add((int)obj);
                   }
                   ints.add(list.indexOf(song_add2));

                  mapAlbum.put(Album,ints);
                  if(mapArtist.containsKey(Artist)) {
                   System.out.println("Artist is Already exist this Song will automatically add on Artist list ");
                   find_index_value=mapArtist.get(Artist);
                   Object[] object = find_index_value.toArray(); 
                    for (Object obj : object) {
                     ints.add((int)obj);
                   }
                    ints.add(list.indexOf(song_add2));
                  }              
                 mapArtist.put(Artist,ints);
              }
              }
              else if(Choice_song.equalsIgnoreCase("R"))
              {
                System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
                String Song_delete;
                List<Integer> search_delete_result = new ArrayList();

                System.out.println("Enter the Album Name -> Song Name  for  Delete");
                Album=sc.nextLine();
                if(mapAlbum.containsKey(Album))
                {
                  System.out.println("Enter the  Song Name  for  Delete");
                  Song_delete=sc.nextLine();
                      if(mapTitle.containsKey(Song_delete))
                      {
                        search_delete_result =mapTitle.get(Song_delete);                      
                        
                          Object[] objects = search_delete_result.toArray(); 
                          for (Object obj : objects) 
                           {
                              Song_lib song_obj_remove_album=(Song_lib)list.get((int)obj);  
                              if(song_obj_remove_album.getTitle().equals(Song_delete)) 
                              { 
                                 System.out.println("\t\tGiven title :  "+Song_delete +" Artist name :  "+song_obj_remove_album.getArtist());
                                 int index=list.indexOf(song_obj_remove_album);
                                 list.remove(song_obj_remove_album);
                                 mapTitle.remove(Song_delete);
                                 find_index_value=mapArtist.get(song_obj_remove_album.getArtist());
                                 Object[] object = find_index_value.toArray(); 
                                 for (Object obk : object) 
                                  {
                                    ints.add((int)obk);
                                  }
                                    ints.remove(index);
                                    mapAlbum.put(song_obj_remove_album.getAlbum(),ints);
                                    mapArtist.put(song_obj_remove_album.getArtist(),ints);
                            }
                          }
                      }
                      else
                      {
                        System.out.println("Song not Exist ");
                        break;
                      }
                }
                else
                {
                  System.out.println("Album is not exist go to [7th --> A] option ");
                  break;
                }
              }
              else
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
