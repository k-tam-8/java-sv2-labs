package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office;

    public void readOffice() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a tárgyaló nevét: ");
        String roomName = sc.nextLine();
        System.out.print("Kérem a tárgyaló szélességét méterben: ");
        int roomWidth = sc.nextInt();
        System.out.print("Kérem a tárgyaló hosszát méterben: ");
        int roomLength = sc.nextInt();
        // Office office = new Office();
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
        printMenu();
        Scanner sc = new Scanner(System.in);
        int menuChoose = sc.nextInt();
        switch (menuChoose) {
            case 1:
                readOffice();
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                System.out.println("Nem megfelelő szám!");
        }
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController = new MeetingRoomController();
        meetingRoomController.runMenu();

    }
}
