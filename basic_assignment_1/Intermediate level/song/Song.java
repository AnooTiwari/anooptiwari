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
        
    }                                                   /*Class end */
    public class Song  {
      public static void main(String[] args)
      {
        int i,size,choice;
        String Title,Artist,Year,Album,Duration;
        Scanner sc = new Scanner(System.in);
        Map< String, List<Integer>> mapTitle=new HashMap<>();
        Map< String, List<Integer>> mapArtist=new HashMap<>();
        Map< String, List<Integer>> mapAlbum=new HashMap< >();
        List<Song_lib> list = new ArrayList<Song_lib>();
        List<Integer> updateSearchResult= new ArrayList();

        /*Test input Start*/
        Song_lib song=new Song_lib();
        song.setDuration("5.0");
        song.setTitle("Spno ki rani");
        song.setYear("1969");
        song.setAlbum("Aradhana");
        song.setArtist("Kishore Kumar");
        list.add(song);
        mapTitle.put("Spno ki rani",Arrays.asList(new Integer[] {0}));
        mapAlbum.put("Aradhana",Arrays.asList(new Integer[] {0}));
        mapArtist.put("Kishore Kumar",Arrays.asList(new Integer[] {0}));
        /*Input 2*/
        Song_lib song1=new Song_lib();
        song1.setTitle("Mere Mhbub");
        song1.setAlbum("Shore");
        song1.setArtist("Kishore Kumar");
        song1.setDuration("3.0");
        song1.setYear("1956"); 
        list.add(song1);
        mapTitle.put("Mere Mhbub",Arrays.asList(new Integer[] {1}));
        mapArtist.put("Kishore Kumar",Arrays.asList(new Integer[] {0,1}));
        mapAlbum.put("Shore",Arrays.asList(new Integer[] {1}));
        /*Input 3*/
        Song_lib song2=new Song_lib();
        song2.setTitle("Mere dill");
        song2.setAlbum("Kbhi");
        song2.setArtist("Mukesh");
        song2.setDuration("4.7");
        song2.setYear("1976"); 
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
             String choiceTitle,titleSearch,newTitle;
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t****Edit Menu****");
              System.out.println("\n\tPress T Title of songs\tPress A for Edit Albums\tPress N names of Artists ");
              choiceTitle=sc.next();
              if(choiceTitle.equalsIgnoreCase("T"))
              {
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t**** Title Edit Menu****");
                System.out.println("Enter the Title ");
                sc.nextLine();
                titleSearch = sc.nextLine();
                updateSearchResult=mapTitle.get(titleSearch);/*Rerun the index value of related title*/
                 for (Integer s : updateSearchResult)
                 {
                  Song_lib songObjTitle=list.get(s);
                    System.out.println("\t\t\t\t\t\t\tYour Search Result");
                    System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                    System.out.println("\t"+songObjTitle.getTitle()+"\t\t" +songObjTitle.getAlbum()+"\t\t" +songObjTitle.getYear()+"\t\t" +songObjTitle.getArtist()+"\t" +songObjTitle.getDuration());
                    System.out.println("Enter the New Title ");
                    newTitle=sc.nextLine();
                    songObjTitle.setTitle(newTitle);
                    System.out.println("\t\t\t\tUpdated Result is :\n");
                    mapTitle.remove(titleSearch);
                    mapTitle.put(newTitle,updateSearchResult);  //Map update
                    System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                    System.out.println("\t"+songObjTitle.getTitle()+"\t\t" +songObjTitle.getAlbum()+"\t\t" +songObjTitle.getYear()+"\t\t" +songObjTitle.getArtist()+"\t" +songObjTitle.getDuration());
                  }
                }
              else if(choiceTitle.equalsIgnoreCase("A"))
              {
              String searchAlbum,newAlbum;
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t**** Album Edit Menu****");
              System.out.println("Enter the old Album name ");
              sc.nextLine();
              searchAlbum=sc.nextLine();
              updateSearchResult=mapAlbum.get(searchAlbum);
              for (Integer s : updateSearchResult)
               {
                Song_lib songObjAlbum=list.get(s);
                System.out.println("\t\t\t\t\t\t\tYour Search Result");
                System.out.println("\n\n\t\tTitle\t\t\tAlbum\t\t\tYear\t\tArtist\t\tDuration ");
                System.out.println("\t"+songObjAlbum.getTitle()+"\t\t" +songObjAlbum.getAlbum()+"\t\t" +songObjAlbum.getYear()+"\t\t" +songObjAlbum.getArtist()+"\t" +songObjAlbum.getDuration());                   
                System.out.println("Enter the new Album Name");
                newAlbum=sc.nextLine();
                songObjAlbum .setAlbum(newAlbum);
                mapAlbum.remove(searchAlbum);
                mapAlbum.put(newAlbum,updateSearchResult);
               }
            }
            else if(choiceTitle.equalsIgnoreCase("N"))
            {
              String searchArtist,newArtistName;
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t**** Artist Name  Edit Menu****");
              sc.nextLine();
              System.out.println("Enter the old Artist Name ");
              searchArtist=sc.nextLine();
              updateSearchResult =mapArtist.get(searchArtist);
              System.out.println("Enter the  New Aritst Name ");
              newArtistName=sc.nextLine();
              for (Integer s : updateSearchResult)
               {
                  Song_lib songObjName=list.get(s);
                  System.out.println("\t\t\t\t\t\t\tYour Search Result");
                  System.out.println("\t"+songObjName.getTitle()+"\t\t" +songObjName.getAlbum()+"\t\t" +songObjName.getYear()+"\t\t" +songObjName.getArtist()+"\t" +songObjName.getDuration());
                  songObjName .setArtist(newArtistName);
                  mapArtist.remove(searchArtist);
                  mapArtist.put(newArtistName,updateSearchResult);
                  }
            }
            else
            {
                  System.out.println("\033[H\033[2J");
                  System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
            }
              break;

              case 5://View a list of all the songs by a particular artist.
            {                       
              String artistSearch;
              System.out.println("Enter the  Artist Name ");
              artistSearch=sc.nextLine();
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t****list of all the songs by a :"+artistSearch+" ****");
              updateSearchResult =mapArtist.get(artistSearch);
              for (Integer s : updateSearchResult)
              {
                Song_lib listofSong=list.get(s);
                System.out.println(listofSong.getTitle());
              }
            }
              break;
              case 6: /*View a list of all the songs on a particular album.*/
                String albumSearch;
                System.out.println("Enter the Name of Album ");
                albumSearch =sc.nextLine();
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t****list of all the songs in Album : "+albumSearch+" ****");
                updateSearchResult =mapAlbum.get(albumSearch);
                for (Integer s : updateSearchResult)
                {
                Song_lib listofAlbum=list.get(s);              
                System.out.println(listofAlbum.getTitle());
                }
                break;
              case 7:         /*Add songs to and remove them from the library.*/
              {
                String choiceSong;
                System.out.println("\033[H\033[2J");
                System.out.println("Press A for Add song\tPress R for Remove Song");
                choiceSong=sc.next();
                sc.nextLine();
                if(choiceSong.equalsIgnoreCase("A"))
                {
                  String newAddTitle,newArtist,newAlbum,newYear,newDuration;
                  System.out.println("\033[H\033[2J");
                  System.out.println("\t\t\t\t\t**** New Song Addition Menu****");
                  System.out.println("Enter the Title ");
                  newAddTitle=sc.nextLine();
                  if(mapTitle.containsKey(newAddTitle))
                  {
                    System.out.println("Song is Already Present Please Remove it first  by using [7 -> R ] option ");
                    break;
                  }else 
                  {
                    System.out.println("Enter the Artist ");
                    newArtist=sc.nextLine();
                    System.out.println("Enter the Album ");
                    newAlbum=sc.nextLine();
                    System.out.println("Enter the Year ");
                    newYear=sc.nextLine();
                    System.out.println("Enter the Duration ");
                    newDuration=sc.nextLine();
                    Song_lib newSongAddObj=new Song_lib();
                    newSongAddObj.setDuration(newDuration);
                    newSongAddObj.setTitle(newAddTitle);
                    newSongAddObj.setYear(newYear);
                    newSongAddObj.setAlbum(newAlbum);
                    newSongAddObj.setArtist(newArtist);
                    list.add(newSongAddObj);
                    if(mapArtist.containsKey(newArtist))
                    {
                      System.out.println("Artist is Already Present this song will going to add Artist library  ");
                      updateSearchResult =mapArtist.get(newArtist);
                      List<Integer> newList = new ArrayList<Integer>(updateSearchResult);
                      newList.add(list.indexOf(newSongAddObj));
                      mapArtist.put(newArtist,newList);
                   }
                   if(mapAlbum.containsKey(newAlbum))
                   {
                    System.out.println("\nAlbum is Already Present this song will going to add Album library  ");
                    updateSearchResult =mapAlbum.get(newAlbum);
                    List<Integer> newList = new ArrayList<Integer>(updateSearchResult);
                    newList.add(list.indexOf(newSongAddObj));
                    mapAlbum.put(newAlbum,newList); 
                 }
               }            
              }
           else if(choiceSong.equalsIgnoreCase("R"))
             {
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
              String songforDelete;
              System.out.println("Enter the Title of Song for  Delete");
              songforDelete=sc.nextLine();
              updateSearchResult=mapTitle.get(songforDelete);
              List<Integer> newList = new ArrayList<Integer>(updateSearchResult);
              Song_lib songforDeleteObj;
              for (Integer s : updateSearchResult){
              songforDeleteObj=list.get(s);   
              System.out.println("\t"+songforDeleteObj.getTitle()+"\t\t" +songforDeleteObj.getAlbum()+"\t\t" +songforDeleteObj.getYear()+"\t\t" +songforDeleteObj.getArtist()+"\t" +songforDeleteObj.getDuration());
              int index=list.indexOf(songforDeleteObj);
              mapTitle.remove(songforDeleteObj.getTitle());
              updateSearchResult=mapArtist.get(songforDeleteObj.getArtist());
              List<Integer> newList1 = new ArrayList<Integer>(updateSearchResult);
              newList1.remove(index);
              mapArtist.put(songforDeleteObj.getArtist(),newList1);
              updateSearchResult=mapAlbum.get(songforDeleteObj.getAlbum());
              List<Integer> newList2 = new ArrayList<Integer>(updateSearchResult);
              newList2.remove(index);
              mapAlbum.put(songforDeleteObj.getAlbum(),newList2);                
              list.remove(songforDeleteObj); 
             }}            
             else
             {
               System.out.println("\033[H\033[2J");
               System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
             }
           }
           break;
            case 8:/*Add artists to and remove them from songs*/
            
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t****  Artists Add and remove Menu****");
              String  choiceSong,newArtistAdd,newvalue,oldValue;
              System.out.println("Press A for Add Artist\tPress R for Remove Artist");
              choiceSong=sc.next();
              sc.nextLine();
              if(choiceSong.equalsIgnoreCase("A"))
              {
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t**** New Artist Addition Menu****");
                System.out.println("Enter the title of song  ");
                titleSearch=sc.nextLine();
                updateSearchResult =mapTitle.get(titleSearch);
                for (Integer s : updateSearchResult){
                Song_lib songobjAddartist=list.get(s);  
                System.out.println("\t\tGiven title :  "+titleSearch +" Artist name :  "+songobjAddartist.getArtist());
                System.out.println("Enter the Second Artist name");
                newArtistAdd=sc.nextLine();
                oldValue=songobjAddartist.getArtist();
                songobjAddartist.setArtist(songobjAddartist.getArtist()+","+newArtistAdd);
                newvalue=(songobjAddartist.getArtist());
                List<Integer> artistIndex = new ArrayList<Integer>(updateSearchResult);
                mapArtist.remove(oldValue);
                mapArtist.put(newvalue,artistIndex);
                System.out.println(mapArtist);
              }
            }
            else if(choiceSong.equalsIgnoreCase("R"))
              {
                String tempArtistName,artistNameforDelete;
                System.out.println("\033[H\033[2J");
                System.out.println("\t\t\t\t\t**** Artist Remove Menu****");
                System.out.println("Enter the title of song  ");
                titleSearch=sc.nextLine();
                updateSearchResult =mapTitle.get(titleSearch);
                for (Integer s : updateSearchResult){
                Song_lib songObjRemoveArtist=list.get(s);  
                System.out.println("\t\tGiven title :  "+titleSearch +" Artist name :  "+songObjRemoveArtist.getArtist());
                tempArtistName=songObjRemoveArtist.getArtist();
                updateSearchResult=mapArtist.get(tempArtistName);
                songObjRemoveArtist.setArtist(null);
                int index=list.indexOf(songObjRemoveArtist);
                List<Integer> artistIndex = new ArrayList<Integer>(updateSearchResult);
                artistIndex.remove(index);
                mapArtist.remove(songObjRemoveArtist.getArtist());
                mapArtist.put(tempArtistName,artistIndex);
                }
              }
            
              else
              {
                System.out.println("\033[H\033[2J");
                System.out.println("****************************************\tPlease Give Correct Input\t****************************************\n\n\n\n\n");
              }
            
            break;
            case 9:/*Add songs to and remove them from albums*/
            
              String  songDuration,songYear,songArtist,songTitle;
              System.out.println("\033[H\033[2J");
              System.out.println("\t\t\t\t\t****  Song Add and remove Menu****");
              System.out.println("Press A for Add Song\tPress R for Remove Song");
              choiceSong=sc.next();
              sc.nextLine();
              if(choiceSong.equalsIgnoreCase("A"))
              {
                
                System.out.println("Enter the Album ");
                albumSearch=sc.nextLine();
                if(!mapAlbum.containsKey(albumSearch))
                {
                  System.out.println("Album is not exist go to [7th --> A] option ");
                  break;
                }else
                {
                  System.out.println("\033[H\033[2J\t\t\t\t\tEnter the Song Details ");
                  System.out.println("Enter the Title ");
                  songTitle=sc.nextLine();
                  System.out.println("Enter the Artist ");
                  songArtist=sc.nextLine();
                  System.out.println("Enter the Year ");
                  songYear=sc.nextLine();             
                  System.out.println("Enter the Duration ");
                  songDuration=sc.nextLine();
                  Song_lib songAddObj=new Song_lib();
                  songAddObj.setDuration(songDuration);
                  songAddObj.setTitle(songTitle);
                  songAddObj.setYear(songYear);
                  songAddObj.setAlbum(albumSearch);
                  songAddObj.setArtist(songArtist);
                  list.add(songAddObj);
                  updateSearchResult =mapAlbum.get(albumSearch);
                  List<Integer> albumIndex = new ArrayList<Integer>(updateSearchResult);
                  albumIndex.add(list.indexOf(songAddObj));
                  mapAlbum.put(albumSearch,albumIndex);
                  if(mapArtist.containsKey(songArtist)) {
                   System.out.println("Artist is Already exist this Song will automatically add on Artist list ");
                    updateSearchResult =mapArtist.get(songArtist);
                    List<Integer> albumIndex2 = new ArrayList<Integer>(updateSearchResult);
                    albumIndex2.add(list.indexOf(songAddObj));
                    mapAlbum.put(songArtist,albumIndex2);
                  }              
                 }
               }
              
              else if(choiceSong.equalsIgnoreCase("R"))
              {
                System.out.println("\t\t\t\t\t**** Song Deletion Menu****");
                String searchAlbum,songDelete,tempAlbumName;              
                System.out.println("Enter the Album Name -> Song Name  for  Delete");
                searchAlbum=sc.nextLine();
                if(mapAlbum.containsKey(searchAlbum))
                {
                System.out.println("Enter the  Song Name  for  Delete");
                songDelete=sc.nextLine();
                if(mapTitle.containsKey(songDelete))
                 {
                 updateSearchResult =mapTitle.get(songDelete);
                for (Integer s : updateSearchResult)
                {
                Song_lib songObjRemoveAlbum=list.get(s);
                System.out.println("\t\tGiven title :  "+songDelete +" Artist name :  "+songObjRemoveAlbum.getArtist());
                int index=list.indexOf(songObjRemoveAlbum);
                System.out.println("index is "+index+"Album name is "+songObjRemoveAlbum.getAlbum()+"  updateSearchResult"+updateSearchResult);
                updateSearchResult=mapAlbum.get(songObjRemoveAlbum.getAlbum());
                List<Integer> albumIndex = new ArrayList<Integer>(updateSearchResult);
                albumIndex.remove(index);
                mapAlbum.put(searchAlbum,albumIndex);
                updateSearchResult=mapArtist.get(songObjRemoveAlbum.getArtist());
                System.out.println("updateSearchResult   "+updateSearchResult);
                List<Integer> albumIndex2 = new ArrayList<Integer>(updateSearchResult);
                albumIndex2.remove(index);
                System.out.println(albumIndex2);
                mapTitle.remove(songDelete);
                mapArtist.put(songObjRemoveAlbum.getArtist(),albumIndex2);
                list.remove(songObjRemoveAlbum);
                }
                }else
                {
                System.out.println("Song not Exist  go to song Add menu");
                break;
                }
                }else
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
              break;
            default:
            System.out.println("\n\t****Please give a valid Input****\t\n");
            break;
         }
        }//while end
      }//End of main() method
    }//end of DisplayArrayList class
  