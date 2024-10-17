import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Making Memories", "Karan Aujla");

        album.addSong("On Top", 4.2);
        album.addSong("Softly", 2.36);
        album.addSong("You", 2.2);
        album.addSong("52 Bars", 3.45);
        album.addSong("Admirin' You", 3.25);

        album = new Album("For The Day One$", "Kr$sna");

        album.addSong("i Guess", 4.2);
        album.addSong("been a while", 3.36);
        album.addSong("No Cap", 5.2);

        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("52 Bars", playList_1);
        albums.get(0).addToPlayList("Softly", playList_1);
        albums.get(0).addToPlayList("i Guess", playList_1);
        albums.get(0).addToPlayList("No Cap", playList_1);

        play(playList_1);

    }
    private static void play(LinkedList<Song> playList) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println(" this playList have no song ;)");
        } else {
            System.out.println("now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = sc.nextInt();
            switch (action) {
                case 0:
                System.out.println("PlayList complete");
                quit = true;
                break;

                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("now playing" + listIterator.next().toString());
                    } else {
                        System.out.println("no song availble, reached to the end");
                        forward = false;
                    }
                    break;

                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now Playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("we are the first song");
                        forward = false;
                    }
                    break;

                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now Playing" + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("we are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now Playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("we have reached the end of the playList");
                        }
                    }
                    break;

                case 4:
                    printList(playList);
                    break;

                case 5:
                    printMenu();
                    break;

                case 6:
                    if (playList.size() > 0) {
                        if (listIterator.hasNext()) {
                            System.out.println("now playing " + listIterator.next().toString());
                        } else {
                            if (listIterator.hasPrevious()) {
                                System.out.println("now Playing " + listIterator.previous().toString());
                            }
                        }
                    }
            }

        }
    }

    private static void printMenu(){
        System.out.println("Available options \n press");
        System.out.println("0 - to quite \n"+
                "1-to play next song\n"+
                "2- to play previous song \n"+
                "3 - to play current song \n"+
                "4- List All songs\n" +
                "5- print all available options\n" +
                "6- delete current song "
        );
    }
    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("---------------------");
        while(!iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("---------------------");
    }
}







