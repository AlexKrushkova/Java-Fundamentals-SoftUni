import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Songs {
    public static void main(String[] args) {
        class Song {
            public String getTypeList() {
                return typeList;
            }

            public void setTypeList(String typeList) {
                this.typeList = typeList;
            }

            private String typeList;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String name;
            public String time;

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
        Scanner scanner = new Scanner(System.in);
        int numofSongs = Integer.parseInt(scanner.nextLine());

        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < numofSongs; i++) {
            String[] data = scanner.nextLine().split(" ");

            String type = data[0];
            String name = data[1];
            String time = data[2];

            Song song = new Song();

            song.setTypeList(type);
            song.setName(name);
            song.setTime(time);
        }
        String typeList = scanner.nextLine();

        if (typeList.equals("all")){
            for (Song song:songs) {
                if (song.getTypeList().equals(typeList)){
                    System.out.println(song.getName());
                }
            }
        }
        List <Song> filterSong = songs.stream().filter(e->e.getTypeList().equals(typeList)).collect(Collectors.toList());

        for (Song song:filterSong) {
            System.out.println(song.getName());
        }
    }
}
