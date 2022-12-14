import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Storm bringer", "Deep Purple");
        album.addSong("Storm bringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);


    }

    private static void play(LinkedList<Song> playlist){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator= playlist.listIterator();
        if(playlist.size() == 0){
            System.out.println("No songs in playlist");
            return ;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Playlist Complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing " + listIterator.next().toString());
                    } else
                    {
                        System.out.println("We have reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = true;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    } else
                    {
                        System.out.println("We have reached end of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing" + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the playlist");
                        }
                    } else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " +listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached end of the list");
                        }
                    }
                    break;
                case 4:
                    if(playlist.size()> 0) {
                        printList(playlist);
                    } else {
                        System.out.println("No songs in the Playlist");
                    }
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size()> 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing " + listIterator.previous());
                        }
                    } else {
                        System.out.println("No songs in the Playlist to remove");
                    }
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available Actions");
        System.out.println("0-Quit\n" +
                "1-Play Next Song\n"+
                "2-Play Previous Song\n"+
                "3-Replay Current Song\n"+
                "4-List songs in the playlist\n"+
                "5-Show Menu\n" +
                "6-Delete current Song from Playlist");
    }

    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=========================");
    }



}