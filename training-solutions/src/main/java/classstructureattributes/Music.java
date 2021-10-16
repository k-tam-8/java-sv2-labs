package classstructureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner bekeres = new Scanner(System.in);

        System.out.println("Zeneszámok");
        System.out.print("Előadó neve: ");
        song.artist = bekeres.nextLine();
        System.out.print("Szám címe: ");
        song.title = bekeres.nextLine();
        System.out.print("Szám hossza percben: ");
        song.duration = bekeres.nextInt();

        System.out.println(song.artist + " - " + song.title + " (" + song.duration + " perc)");


    }
}
