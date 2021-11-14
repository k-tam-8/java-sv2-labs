package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office = new Office();

    public void readOffice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a tárgyaló nevét: ");
        String roomName = sc.nextLine();
        System.out.print("Kérem a tárgyaló szélességét méterben: ");
        int roomWidth = sc.nextInt();
        System.out.print("Kérem a tárgyaló hosszát méterben: ");
        int roomLength = sc.nextInt();
        MeetingRoom meetingRoom = new MeetingRoom(roomName, roomLength, roomWidth);
        office.addMeetingRoom(meetingRoom);
    }

    public void printMenu() {
        System.out.println("1. Tárgyaló rögzítése");
        System.out.println("2. Tárgyalók sorrendben");
        System.out.println("3. Tárgyalók visszafele sorrendben");
        System.out.println("4. Minden második tárgyaló");
        System.out.println("5. Területek");
        System.out.println("6. Keresés pontos név alapján");
        System.out.println("7. Keresés névtöredék alapján");
        System.out.println("8. Keresés terület alapján");
        System.out.println("9. Kilépés");
        System.out.print("-> Válassz menüpontot: ");
    }

    public void runMenu() {
        boolean quitCheck = false;
        do {
            printMenu();
            Scanner sc = new Scanner(System.in);
            int menuChoose = sc.nextInt();
            sc.nextLine();
            switch (menuChoose) {
                case 1:
                    readOffice();
                    break;
                case 2:
                    office.printNames();
                    break;
                case 3:
                    office.printNamesReverse();
                    break;
                case 4:
                    office.printEvenNames();
                    break;
                case 5:
                    office.printAreas();
                    break;
                case 6:
                    System.out.print("Keresendő név: ");
                    String name = sc.nextLine();
                    office.printMeetingRoomsWithNames(name);
                    break;
                case 7:
                    System.out.print("Keresendő névtöredék: ");
                    String nameCont = sc.nextLine();
                    office.printMeetingRoomsContains(nameCont);
                    break;
                case 8:
                    System.out.print("Tárgyalók amiknek a területük nagyobb mint: ");
                    int area = sc.nextInt();
                    office.printAreasLargerThan(area);
                    break;
                case 9:
                    quitCheck = true;
            }
        }
        while (!quitCheck);
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
