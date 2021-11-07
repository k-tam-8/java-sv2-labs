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
            System.out.println("Tárgyaló neve: " + meetingRooms.get(i).getName());
            System.out.println("Tárgyaló szélessége: " + meetingRooms.get(i).getWidth());
            System.out.println("Tárgyaló hossza: " + meetingRooms.get(i).getLength());
            System.out.println("Tárgyaló területe: " + meetingRooms.get(i).getArea());
            System.out.println();
        }
    }

    public void printMeetingRoomsWithNames(String name) {

    }

    public void printMeetingRoomsContains(String part) {

    }

    public void printAreasLargerThan(int area) {
        for (int i = 0; i < meetingRooms.size(); i++) {
           if (meetingRooms.get(i).getArea()>area){
               System.out.println("Tárgyaló neve: " + meetingRooms.get(i).getName());
               System.out.println("Tárgyaló szélessége: " + meetingRooms.get(i).getWidth());
               System.out.println("Tárgyaló hossza: " + meetingRooms.get(i).getLength());
               System.out.println("Tárgyaló területe: " + meetingRooms.get(i).getArea());
               System.out.println();
           }
        }
    }
}
