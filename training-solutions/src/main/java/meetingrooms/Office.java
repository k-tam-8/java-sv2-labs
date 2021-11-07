package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom) {
        meetingRooms.add(meetingRoom);
    }

    public void printNames() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printNamesReverse() {
        for (int i = meetingRooms.size(); i >= 0; i--) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames() {
        for (int i = 1; i < meetingRooms.size(); i += 2) {
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas() {
        for (int i = 0; i < meetingRooms.size(); i++) {
            printAllData(i);
        }
    }

    public void printMeetingRoomsWithNames(String name) {
        for (MeetingRoom meetingRoom : meetingRooms) {
            if (meetingRoom.getName().equals(name)) {
                System.out.println(meetingRoom.getName());
            }
        }
    }

    public void printMeetingRoomsContains(String part) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getName().contains(part)) {
                printAllData(i);
            }
        }
    }

    public void printAreasLargerThan(int area) {
        for (int i = 0; i < meetingRooms.size(); i++) {
            if (meetingRooms.get(i).getArea() > area) {
                printAllData(i);
            }
        }
    }

    public void printAllData(int listItem) {
        System.out.println("Tárgyaló neve: " + meetingRooms.get(listItem).getName());
        System.out.println("Tárgyaló szélessége: " + meetingRooms.get(listItem).getWidth());
        System.out.println("Tárgyaló hossza: " + meetingRooms.get(listItem).getLength());
        System.out.println("Tárgyaló területe: " + meetingRooms.get(listItem).getArea());
        System.out.println();
    }
}

