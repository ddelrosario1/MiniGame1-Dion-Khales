import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RoomList {
    private ArrayList<Room> roomArray = new ArrayList<>();

    // Turns out that nextInt() does weird things when used with \n and doesn't recognize line breaks so it does not
    // let you read the next int and instead throws type mismatch exceptions
    // Did not work: delimiter should cause it to ignore the appropriate parts in the text file that allow human reading ease
    public RoomList() throws FileNotFoundException {
        Scanner in = new Scanner(new File("Rooms.txt"));

        while (in.hasNext()) {
            String name = in.nextLine();
            int id = Integer.parseInt(in.nextLine());
            String desc = in.nextLine();
            int north = Integer.parseInt(in.nextLine());
            int east = Integer.parseInt(in.nextLine());
            int south = Integer.parseInt(in.nextLine());
            int west = Integer.parseInt(in.nextLine());

            Room newRoom = new Room(name, id, desc, north, east, south, west);
            roomArray.add(newRoom);
        }
    }

    public ArrayList<Room> getRoomArray() {
        return roomArray;
    }
}